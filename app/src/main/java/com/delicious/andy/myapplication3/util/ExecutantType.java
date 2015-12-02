package com.delicious.andy.myapplication3.util;

import com.example.andy.myapplication.backend.userRecordEndpoint.model.UserRecord;

/**
 * Created by Andy on 2015/12/1.
 */
public class ExecutantType {
    private static  UserRecord userRecord;

    public static UserRecord getUserRecord() {
        return userRecord;
    }

    public static void setUserRecord(UserRecord userRecord) {
        ExecutantType.userRecord = userRecord;
    }
}
