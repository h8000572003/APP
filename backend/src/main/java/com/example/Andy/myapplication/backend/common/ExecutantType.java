package com.example.Andy.myapplication.backend.common;

import java.io.Serializable;

/**
 * Created by Andy on 2015/12/2.
 */
public class ExecutantType implements Serializable {
    private String id = "";
    private String name = "";

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
}
