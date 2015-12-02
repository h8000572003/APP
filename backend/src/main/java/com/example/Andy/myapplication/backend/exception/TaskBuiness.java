package com.example.Andy.myapplication.backend.exception;

/**
 * Created by Andy on 2015/12/2.
 */
public class TaskBuiness extends RuntimeException {
    private String message = "";


    public TaskBuiness(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
