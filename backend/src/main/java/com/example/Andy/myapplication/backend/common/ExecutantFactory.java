package com.example.Andy.myapplication.backend.common;

/**
 * Created by Andy on 2015/12/2.
 */
public class ExecutantFactory {
    private static ExecutantType type;

    public static ExecutantType get() {
        if (type == null) {
            type = new ExecutantType();

        }
        return type;

    }

    private ExecutantFactory() {

    }
}
