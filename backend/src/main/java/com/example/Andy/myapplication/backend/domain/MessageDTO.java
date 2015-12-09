package com.example.Andy.myapplication.backend.domain;

import com.example.Andy.myapplication.backend.entry.NewsRecord;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Andy on 2015/12/9.
 */
public class MessageDTO implements Serializable {
    private String yyyymmdd;

    public String getYyyymmdd() {
        return yyyymmdd;
    }

    public void setYyyymmdd(String yyyymmdd) {
        this.yyyymmdd = yyyymmdd;
    }

    private List<NewsRecord> messages = new ArrayList<>();

    public List<NewsRecord> getMessages() {
        return messages;
    }

    public void setMessages(List<NewsRecord> messages) {
        this.messages = messages;
    }
}
