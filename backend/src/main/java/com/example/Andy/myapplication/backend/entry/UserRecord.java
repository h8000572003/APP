package com.example.Andy.myapplication.backend.entry;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

import java.io.Serializable;

/**
 * 使用者資訊
 * Created by Andy on 2015/12/1.
 */


@Entity
public class UserRecord implements Serializable {

    @Id
    private String id = "";

    @Index
    private String name = "";


    private String password = "";

    /**
     * 階級
     * <li>0:管理員</li>
     * <li>1:老闆</li>
     * <li>2:員工</li>
     */
    @Index
    private String level;


    @Index
    private String regId;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getRegId() {
        return regId;
    }

    public void setRegId(String regId) {
        this.regId = regId;
    }
}
