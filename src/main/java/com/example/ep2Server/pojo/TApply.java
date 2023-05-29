package com.example.ep2Server.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Date;

@TableName("t_apply")
@Data
public class TApply {

  private String businessLicenseNumber;
  private String hygienicLicenseNumber;
  private String healthCertificateNumber;
  private String idNumber;
  private String userName;

  private String province;
  private String city;
  private String district;
  private String street;
  private java.sql.Date startDate;
  private java.sql.Date endDate;
  private long dealStatus;
  private long applyStatus;
  private String storeId;


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


  public long getDealStatus() {
    return dealStatus;
  }

  public void setDealStatus(long dealStatus) {
    this.dealStatus = dealStatus;
  }


  public long getApplyStatus() {
    return applyStatus;
  }

  public void setApplyStatus(long applyStatus) {
    this.applyStatus = applyStatus;
  }


  public String getStoreId() {
    return storeId;
  }

  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }

}
