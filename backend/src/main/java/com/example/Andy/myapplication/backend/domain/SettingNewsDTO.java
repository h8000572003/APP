package com.example.Andy.myapplication.backend.domain;

import com.example.Andy.myapplication.backend.entry.NewsRecord;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Andy on 2015/12/9.
 */
public class SettingNewsDTO implements Serializable{
    private List<NewsRecord> newsRecords;

    private NewsRecord record=new NewsRecord();

    public List<NewsRecord> getNewsRecords() {
        return newsRecords;
    }

    public void setNewsRecords(List<NewsRecord> newsRecords) {
        this.newsRecords = newsRecords;
    }

    public NewsRecord getRecord() {
        return record;
    }

    public void setRecord(NewsRecord record) {
        this.record = record;
    }
}
