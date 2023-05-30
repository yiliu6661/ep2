package com.example.carerServer.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("t_report")
@Data
public class TReport {

  private String storeId;
  @TableId("report_id")
  private String reportId;
  private String userName;
  private String reportContent;
  private long reportStatus;


  public String getStoreId() {
    return storeId;
  }

  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }


  public String getReportId() {
    return reportId;
  }

  public void setReportId(String reportId) {
    this.reportId = reportId;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getReportContent() {
    return reportContent;
  }

  public void setReportContent(String reportContent) {
    this.reportContent = reportContent;
  }


  public long getReportStatus() {
    return reportStatus;
  }

  public void setReportStatus(long reportStatus) {
    this.reportStatus = reportStatus;
  }

}
