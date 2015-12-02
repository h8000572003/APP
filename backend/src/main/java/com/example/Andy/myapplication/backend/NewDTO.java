package com.example.Andy.myapplication.backend;

import com.example.Andy.myapplication.backend.entry.NewsRecord;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Andy on 2015/12/1.
 */
public class NewDTO implements Serializable {
    private List<NewsRecord> recordList;

    public List<NewsRecord> getRecordList() {
        return recordList;
    }

    public void setRecordList(List<NewsRecord> recordList) {
        this.recordList = recordList;
    }
}
