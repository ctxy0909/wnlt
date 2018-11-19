package com.zmkj.wnlt.domain;


import java.io.Serializable;

public class Message implements Serializable {

    private Integer mId;
    private String dhh;
    private String xm;
    private String username;
    private String userTel;
    private String tel;
    private String addr;
    private String phone;//参与活动的手机
    private String isPartIn;//是否参与
    private java.util.Date creTime;
    private Integer tempId;
    private Integer userId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getMId() {
        return mId;
    }

    public void setMId(Integer mId) {
        this.mId = mId;
    }


    public String getDhh() {
        return dhh;
    }

    public void setDhh(String dhh) {
        this.dhh = dhh;
    }


    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }


    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }


    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }


    public java.util.Date getCreTime() {
        return creTime;
    }

    public void setCreTime(java.util.Date creTime) {
        this.creTime = creTime;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIsPartIn() {
        return isPartIn;
    }

    public void setIsPartIn(String isPartIn) {
        this.isPartIn = isPartIn;
    }

    public Integer getTempId() {
        return tempId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getUserTel() {
        return userTel;
    }
}
