package com.example.Andy.myapplication.backend.domain;

import java.io.Serializable;

/**
 * Created by Andy on 2015/12/2.
 */
public class RegistUserDTO implements Serializable {
    private String id = "";
    private String password = "";
    private String name = "";


    private String level;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public java.lang.String getLevel() {
        return level;
    }

    public void setLevel(java.lang.String level) {
        this.level = level;
    }
}
