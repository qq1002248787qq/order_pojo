package com.qf.shop.order.pojo;


import java.io.Serializable;

public class Items implements Serializable {

  private long itemid;
  private String title;
  private long price;
  private String descrption;
  private long status;


  public long getItemid() {
    return itemid;
  }

  public void setItemid(long itemid) {
    this.itemid = itemid;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public long getPrice() {
    return price;
  }

  public void setPrice(long price) {
    this.price = price;
  }


  public String getDescrption() {
    return descrption;
  }

  public void setDescrption(String descrption) {
    this.descrption = descrption;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }

}
