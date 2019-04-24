package com.qf.shop.order.pojo;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Orders implements Serializable {

  private long orderid;
  private long fromuserid;
  private long touserid;
  private Date createtime;
  private long status;
  private Date paytime;
  private Date confimtime;
  private Date fahuotime;
  private long totalprice;
  private List<Items> items;

  public List <Items> getItems() {
    return items;
  }

  public void setItems(List <Items> items) {
    this.items = items;
  }

  public long getOrderid() {
    return orderid;
  }

  public void setOrderid(long orderid) {
    this.orderid = orderid;
  }


  public long getFromuserid() {
    return fromuserid;
  }

  public void setFromuserid(long fromuserid) {
    this.fromuserid = fromuserid;
  }


  public long getTouserid() {
    return touserid;
  }

  public void setTouserid(long touserid) {
    this.touserid = touserid;
  }


  public Date getCreatetime() {
    return createtime;
  }

  public void setCreatetime(Date createtime) {
    this.createtime = createtime;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public Date getPaytime() {
    return paytime;
  }

  public void setPaytime(Date paytime) {
    this.paytime = paytime;
  }


  public Date getConfimtime() {
    return confimtime;
  }

  public void setConfimtime(Date confimtime) {
    this.confimtime = confimtime;
  }


  public Date getFahuotime() {
    return fahuotime;
  }

  public void setFahuotime(Date fahuotime) {
    this.fahuotime = fahuotime;
  }


  public long getTotalprice() {
    return totalprice;
  }

  public void setTotalprice(long totalprice) {
    this.totalprice = totalprice;
  }

}
