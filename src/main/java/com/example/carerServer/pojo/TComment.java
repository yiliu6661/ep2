package com.example.carerServer.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
@TableName("t_comment")
@Data
public class TComment {

  private String storeId;
  @TableId("comment_id")
  private String commentId;
  private String userName;
  private long commentScore;
  private String commentContent;


  public String getStoreId() {
    return storeId;
  }

  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }


  public String getCommentId() {
    return commentId;
  }

  public void setCommentId(String commentId) {
    this.commentId = commentId;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public long getCommentScore() {
    return commentScore;
  }

  public void setCommentScore(long commentScore) {
    this.commentScore = commentScore;
  }


  public String getCommentContent() {
    return commentContent;
  }

  public void setCommentContent(String commentContent) {
    this.commentContent = commentContent;
  }

}
