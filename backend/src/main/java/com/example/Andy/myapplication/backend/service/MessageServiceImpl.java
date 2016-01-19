package com.example.Andy.myapplication.backend.service;

import com.example.Andy.myapplication.backend.OfyService;
import com.example.Andy.myapplication.backend.domain.MessageDTO;
import com.example.Andy.myapplication.backend.entry.NewsRecord;
import com.googlecode.objectify.cmd.Query;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Andy on 2015/12/9.
 */
@Service("messageService")
public class MessageServiceImpl implements MessageService {
    @Override
    public void loadTodayNews(MessageDTO dto) {


        Query<NewsRecord> q = OfyService.ofy().load().type(NewsRecord.class);

        q = q.filter("beginDate >= ", dto.getYyyymmdd());

        List<NewsRecord> newsRecords =
                q
                        .list();


        dto.setMessages(newsRecords);
    }

    @Override
    public void deleteNews(MessageDTO dto) {


        OfyService.ofy().delete().entities(dto.getSelectNewsRecord()).now();
    }
}
