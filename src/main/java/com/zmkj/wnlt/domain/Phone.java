package com.zmkj.wnlt.domain;


import java.io.Serializable;

public class Phone implements Serializable {

  private Integer pId;
  private String dhh;
  private String yc;
  private String xyq;
  private String yxftc;
  private String tclx;
  private String delFlag;


  public Integer getPId() {
    return pId;
  }

  public void setPId(Integer pId) {
    this.pId = pId;
  }


  public String getDhh() {
    return dhh;
  }

  public void setDhh(String dhh) {
    this.dhh = dhh;
  }


  public String getYc() {
    return yc;
  }

  public void setYc(String yc) {
    this.yc = yc;
  }


  public String getXyq() {
    return xyq;
  }

  public void setXyq(String xyq) {
    this.xyq = xyq;
  }


  public String getYxftc() {
    return yxftc;
  }

  public void setYxftc(String yxftc) {
    this.yxftc = yxftc;
  }


  public String getTclx() {
    return tclx;
  }

  public void setTclx(String tclx) {
    this.tclx = tclx;
  }



    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

}
