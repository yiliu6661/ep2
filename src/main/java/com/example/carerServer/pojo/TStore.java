package com.example.carerServer.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("t_store")
@Data
public class TStore {
  @TableId("store_id")
  private String storeId;
  private String storeName;
  private String businessContent;
  private String storeType;


  public String getStoreId() {
    return storeId;
  }

  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }


  public String getStoreName() {
    return storeName;
  }

  public void setStoreName(String storeName) {
    this.storeName = storeName;
  }


  public String getBusinessContent() {
    return businessContent;
  }

  public void setBusinessContent(String businessContent) {
    this.businessContent = businessContent;
  }

  public String getStoreType() {
    return storeType;
  }

  public void setStoreType(String storeType) {
    this.storeType = storeType;
  }
}
