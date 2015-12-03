package com.example.Andy.myapplication.backend.domain;

import com.example.Andy.myapplication.backend.entry.UserRecord;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andy on 2015/12/2.
 */
public class SettingUserDTO implements Serializable {
    private List<UserRecord> queryList = new ArrayList<UserRecord>();
    private String id;
    private int level;
    private UserRecord selectUserRecord;

    public List<UserRecord> getQueryList() {
        return queryList;
    }

    public void setQueryList(List<UserRecord> queryList) {
        this.queryList = queryList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public UserRecord getSelectUserRecord() {
        return selectUserRecord;
    }

    public void setSelectUserRecord(UserRecord selectUserRecord) {
        this.selectUserRecord = selectUserRecord;
    }
}
