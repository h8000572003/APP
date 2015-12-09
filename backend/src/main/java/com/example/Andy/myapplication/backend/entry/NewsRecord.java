package com.example.Andy.myapplication.backend.entry;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;
import com.googlecode.objectify.annotation.Unindex;

import java.io.Serializable;

/**
 * 最新消息
 * Created by Andy on 2015/11/30.
 */
@Entity
public class NewsRecord implements Serializable {
    @Id
    Long id;

    @Unindex
    private String content;


    /**
     * 標題
     */

    @Index
    private String title="";
    /**
     * 撰寫人名稱
     */
    @Index
    private String name;

    @Index
    private String writeId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



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

    public String getWriteId() {
        return writeId;
    }

    public void setWriteId(String writeId) {
        this.writeId = writeId;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
