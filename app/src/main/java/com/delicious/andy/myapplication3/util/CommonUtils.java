package com.delicious.andy.myapplication3.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Andy on 2015/12/1.
 */
public class CommonUtils {


    public static String API_URL = "https://master-smithy-691.appspot.com/_ah/api/";
    public static String SENDER_ID = "450672456643";
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

    public static String getNowDate() {
        return sdf.format(new Date());
    }

    public static String getStringDate(Date date) {
        return sdf.format(date);

    }


}
