package ru.learn;

import com.google.gson.Gson;
import okhttp3.*;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Time;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class CrptApi {

    private final OkHttpClient client = new OkHttpClient();
    private final Gson gson = new Gson();
    private final Semaphore semaphore;
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);


    public CrptApi(TimeUnit timeUnit, int requestLimit) {
        this.semaphore = new Semaphore(requestLimit);

        scheduler.scheduleAtFixedRate(() -> {
            semaphore.release(requestLimit - semaphore.availablePermits());
        }, 0, 1, timeUnit);
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        var api = new CrptApi(TimeUnit.SECONDS, 5);
        var products = new ArrayList<Product>();
        products.add(new Product(
                "string",
                "2020-01-23",
                "string",
                "string",
                "string",
                "2020-01-23",
                "string",
                "string",
                "string"));
        
        var document = new DocumentModel(
                new Description("string"),
                "string",
                "string",
                "string",
                true,
                "string",
                "string",
                "string",
                "2020-01-23",
                "string",
                products,
                "2020-01-23",
                "string"
        );

        String response = api.createDocument(document);
        System.out.println(response);

        api.shutdown();


    }

    private void shutdown() {
        scheduler.shutdown();
    }

    public String createDocument(DocumentModel document) throws InterruptedException, IOException {
        semaphore.acquire();

        MediaType MEDIA_TYPE_JSON = MediaType.parse("application/json; charset=utf-8");
        String jsonDocument = gson.toJson(document);

        RequestBody body = RequestBody.create(jsonDocument, MEDIA_TYPE_JSON);
        Request request = new Request.Builder()
                .url("https://ismp.crpt.ru/api/v3/lk/documents/create")
                .post(body)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        } finally {
            semaphore.release();
        }
    }

}