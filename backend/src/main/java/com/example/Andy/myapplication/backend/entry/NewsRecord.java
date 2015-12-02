package com.example.Andy.myapplication.backend.entry;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;
import com.googlecode.objectify.annotation.Unindex;

/**
 * 最新消息
 * Created by Andy on 2015/11/30.
 */
@Entity
public class NewsRecord {
    @Id
    Long id;

    @Unindex
    private String content;


    @Index
    private String user;

    /**
     * 權限
     */
    @Unindex
    private int leavel;

    @Unindex
    private String delete;

    @Index
    private String yyyymmdd;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }


    public String getDelete() {
        return delete;
    }

    public void setDelete(String delete) {
        this.delete = delete;
    }

    public int getLeavel() {
        return leavel;
    }

    public void setLeavel(int leavel) {
        this.leavel = leavel;
    }

    public String getYyyymmdd() {
        return yyyymmdd;
    }

    public void setYyyymmdd(String yyyymmdd) {
        this.yyyymmdd = yyyymmdd;
    }
}
