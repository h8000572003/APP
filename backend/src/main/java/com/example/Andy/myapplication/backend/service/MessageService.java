package com.example.Andy.myapplication.backend.service;

import com.example.Andy.myapplication.backend.domain.MessageDTO;

/**
 * Created by Andy on 2015/12/9.
 */
public interface MessageService {
     void loadTodayNews(MessageDTO dto);

    void deleteNews(MessageDTO dto);
}
