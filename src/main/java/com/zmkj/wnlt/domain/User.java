package com.zmkj.wnlt.domain;

/**
 * @Auther: Administrator
 * @Date: 2018/11/6 15:19
 * @Description:
 */
public class User {
    private Integer id;
    private String username;
    private String tel;
    private Integer tempId;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTempId() {
        return tempId;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
