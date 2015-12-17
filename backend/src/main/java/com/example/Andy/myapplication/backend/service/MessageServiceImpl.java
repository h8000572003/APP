package com.example.Andy.myapplication.backend.service;

import com.example.Andy.myapplication.backend.OfyService;
import com.example.Andy.myapplication.backend.domain.MessageDTO;
import com.example.Andy.myapplication.backend.entry.NewsRecord;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Andy on 2015/12/9.
 */
@Service("messageService")
public class MessageServiceImpl implements MessageService {
    @Override
    public void loadTodayNews(MessageDTO dto) {

        List<NewsRecord> newsRecords =
                OfyService.ofy().load().type(NewsRecord.class)//
                        .filter("yyyymmdd", dto.getYyyymmdd())

                        .list();


        dto.setMessages(newsRecords);
    }
}
