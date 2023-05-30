package com.example.carerServer.form;

import lombok.Data;

@Data
public class ApplyStore {
    private String businessLicenseNumber;
    private String hygienicLicenseNumber;
    private String healthCertificateNumber;
    private String idNumber;
    private String userName;
    private String storeName;
    private String storeType;
    private String province;
    private String city;
    private String district;
    private String street;
    private String start;
    private String end;
    private String businessContent;


    public String getBusinessLicenseNumber() {
        return businessLicenseNumber;
    }

    public void setBusinessLicenseNumber(String businessLicenseNumber) {
        this.businessLicenseNumber = businessLicenseNumber;
    }

    public String getHygienicLicenseNumber() {
        return hygienicLicenseNumber;
    }

    public void setHygienicLicenseNumber(String hygienicLicenseNumber) {
        this.hygienicLicenseNumber = hygienicLicenseNumber;
    }

    public String getHealthCertificateNumber() {
        return healthCertificateNumber;
    }

    public void setHealthCertificateNumber(String healthCertificateNumber) {
        this.healthCertificateNumber = healthCertificateNumber;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreType() {
        return storeType;
    }

    public void setStoreType(String storeType) {
        this.storeType = storeType;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getBusinessContent() {
        return businessContent;
    }

    public void setBusinessContent(String businessContent) {
        this.businessContent = businessContent;
    }


}

