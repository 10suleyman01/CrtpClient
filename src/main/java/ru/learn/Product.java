
package ru.learn;

import com.google.gson.annotations.SerializedName;

public class Product {

    @SerializedName("certificate_document")
    private String mCertificateDocument;
    @SerializedName("certificate_document_date")
    private String mCertificateDocumentDate;
    @SerializedName("certificate_document_number")
    private String mCertificateDocumentNumber;
    @SerializedName("owner_inn")
    private String mOwnerInn;
    @SerializedName("producer_inn")
    private String mProducerInn;
    @SerializedName("production_date")
    private String mProductionDate;
    @SerializedName("tnved_code")
    private String mTnvedCode;
    @SerializedName("uit_code")
    private String mUitCode;
    @SerializedName("uitu_code")
    private String mUituCode;

    public Product(String mCertificateDocument, String mCertificateDocumentDate, String mCertificateDocumentNumber, String mOwnerInn, String mProducerInn, String mProductionDate, String mTnvedCode, String mUitCode, String mUituCode) {
        this.mCertificateDocument = mCertificateDocument;
        this.mCertificateDocumentDate = mCertificateDocumentDate;
        this.mCertificateDocumentNumber = mCertificateDocumentNumber;
        this.mOwnerInn = mOwnerInn;
        this.mProducerInn = mProducerInn;
        this.mProductionDate = mProductionDate;
        this.mTnvedCode = mTnvedCode;
        this.mUitCode = mUitCode;
        this.mUituCode = mUituCode;
    }

    public String getCertificateDocument() {
        return mCertificateDocument;
    }

    public void setCertificateDocument(String certificateDocument) {
        mCertificateDocument = certificateDocument;
    }

    public String getCertificateDocumentDate() {
        return mCertificateDocumentDate;
    }

    public void setCertificateDocumentDate(String certificateDocumentDate) {
        mCertificateDocumentDate = certificateDocumentDate;
    }

    public String getCertificateDocumentNumber() {
        return mCertificateDocumentNumber;
    }

    public void setCertificateDocumentNumber(String certificateDocumentNumber) {
        mCertificateDocumentNumber = certificateDocumentNumber;
    }

    public String getOwnerInn() {
        return mOwnerInn;
    }

    public void setOwnerInn(String ownerInn) {
        mOwnerInn = ownerInn;
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

    public String getTnvedCode() {
        return mTnvedCode;
    }

    public void setTnvedCode(String tnvedCode) {
        mTnvedCode = tnvedCode;
    }

    public String getUitCode() {
        return mUitCode;
    }

    public void setUitCode(String uitCode) {
        mUitCode = uitCode;
    }

    public String getUituCode() {
        return mUituCode;
    }

    public void setUituCode(String uituCode) {
        mUituCode = uituCode;
    }

}
