package com.example.Andy.myapplication.backend.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Created by Andy on 2015/12/15.
 */
@SessionScoped
@ManagedBean
public class UserBean implements Serializable {
    private String id = "";
    private String name = "";
    private String loginTime = "";

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }

}
