package com.example.Andy.myapplication.backend.common;

import com.example.Andy.myapplication.backend.OfyService;
import com.example.Andy.myapplication.backend.entry.UserRecord;
import com.example.Andy.myapplication.backend.exception.TaskBuiness;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Andy on 2015/12/3.
 */

@Component("userComentImpl")
public class UserComentImpl implements UserComent {
    @Override
    public UserRecord checkUserIsExit(String id, String password) {

        final UserRecord record = OfyService.ofy().load().type(UserRecord.class)//
                .filter("id", id)//
                .filter("password", password).first().now();//

        if (record == null) {
            throw new TaskBuiness("帳號或密碼錯誤");
        }
        return record;
    }

    @Override
    public List<UserRecord> getUserRecords(String level) {
        return OfyService.ofy().load().type(UserRecord.class)//
                .filter("level", level)//
                .list();//
    }
}
