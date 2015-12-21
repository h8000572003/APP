package com.example.Andy.myapplication.backend.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Andy on 2015/12/18.
 */
public class SettingNewsItemDTO implements Serializable {


    private String content;


    /**
     * 標題
     */


    private String title = "";
    /**
     * 撰寫人名稱
     */

    private String name;


    private String writeId;

    private Date beginDate = new Date();


    private Date endDate = new Date();


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriteId() {
        return writeId;
    }

    public void setWriteId(String writeId) {
        this.writeId = writeId;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
