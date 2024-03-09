
package ru.learn;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class DocumentModel {

    @SerializedName("description")
    private Description mDescription;
    @SerializedName("doc_id")
    private String mDocId;
    @SerializedName("doc_status")
    private String mDocStatus;
    @SerializedName("doc_type")
    private String mDocType;
    @SerializedName("importRequest")
    private Boolean mImportRequest;
    @SerializedName("owner_inn")
    private String mOwnerInn;
    @SerializedName("participant_inn")
    private String mParticipantInn;
    @SerializedName("producer_inn")
    private String mProducerInn;
    @SerializedName("production_date")
    private String mProductionDate;
    @SerializedName("production_type")
    private String mProductionType;
    @SerializedName("products")
    private List<Product> mProducts;
    @SerializedName("reg_date")
    private String mRegDate;
    @SerializedName("reg_number")
    private String mRegNumber;

    public DocumentModel(Description mDescription, String mDocId, String mDocStatus, String mDocType, Boolean mImportRequest, String mOwnerInn, String mParticipantInn, String mProducerInn, String mProductionDate, String mProductionType, List<Product> mProducts, String mRegDate, String mRegNumber) {
        this.mDescription = mDescription;
        this.mDocId = mDocId;
        this.mDocStatus = mDocStatus;
        this.mDocType = mDocType;
        this.mImportRequest = mImportRequest;
        this.mOwnerInn = mOwnerInn;
        this.mParticipantInn = mParticipantInn;
        this.mProducerInn = mProducerInn;
        this.mProductionDate = mProductionDate;
        this.mProductionType = mProductionType;
        this.mProducts = mProducts;
        this.mRegDate = mRegDate;
        this.mRegNumber = mRegNumber;
    }

    public Description getDescription() {
        return mDescription;
    }

    public void setDescription(Description description) {
        mDescription = description;
    }

    public String getDocId() {
        return mDocId;
    }

    public void setDocId(String docId) {
        mDocId = docId;
    }

    public String getDocStatus() {
        return mDocStatus;
    }

    public void setDocStatus(String docStatus) {
        mDocStatus = docStatus;
    }

    public String getDocType() {
        return mDocType;
    }

    public void setDocType(String docType) {
        mDocType = docType;
    }

    public Boolean getImportRequest() {
        return mImportRequest;
    }

    public void setImportRequest(Boolean importRequest) {
        mImportRequest = importRequest;
    }

    public String getOwnerInn() {
        return mOwnerInn;
    }

    public void setOwnerInn(String ownerInn) {
        mOwnerInn = ownerInn;
    }

    public String getParticipantInn() {
        return mParticipantInn;
    }

    public void setParticipantInn(String participantInn) {
        mParticipantInn = participantInn;
    }

    public String getProducerInn() {
        return mProducerInn;
    }

    public void setProducerInn(String producerInn) {
        mProducerInn = producerInn;
    }

    public String getProductionDate() {
        return mProductionDate;
    }

    public void setProductionDate(String productionDate) {
        mProductionDate = productionDate;
    }

    public String getProductionType() {
        return mProductionType;
    }

    public void setProductionType(String productionType) {
        mProductionType = productionType;
    }

    public List<Product> getProducts() {
        return mProducts;
    }

    public void setProducts(List<Product> products) {
        mProducts = products;
    }

    public String getRegDate() {
        return mRegDate;
    }

    public void setRegDate(String regDate) {
        mRegDate = regDate;
    }

    public String getRegNumber() {
        return mRegNumber;
    }

    public void setRegNumber(String regNumber) {
        mRegNumber = regNumber;
    }

}
