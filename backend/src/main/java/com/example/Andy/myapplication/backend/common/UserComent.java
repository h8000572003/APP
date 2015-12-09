package com.example.Andy.myapplication.backend.common;

import com.example.Andy.myapplication.backend.entry.UserRecord;

import java.util.List;

/**
 * Created by Andy on 2015/12/3.
 */
public interface UserComent {
    UserRecord checkUserIsExit(String id, String password);

    List<UserRecord> getUserRecords(String level);
}
