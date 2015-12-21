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

    /**
     * 內容
     */
    @Unindex
    private String content;


    /**
     * 標題
     */

    @Index
    private String title = "";
    /**
     * 撰寫人名稱
     */
    @Index
    private String name;

    /**
     * 填寫人
     */
    @Index
    private String writeId;

    /**
     * 發佈時間
     */
    @Index
    private String beginDate = "";

    /**
     * 發佈日期
     */
    @Index
    private String endDate = "";

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

    /**
     * 建立日期
     */

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

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
