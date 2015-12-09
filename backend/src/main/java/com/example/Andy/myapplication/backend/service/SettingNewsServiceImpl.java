package com.example.Andy.myapplication.backend.service;

import com.example.Andy.myapplication.backend.OfyService;
import com.example.Andy.myapplication.backend.domain.SettingNewsDTO;
import com.example.Andy.myapplication.backend.entry.NewsRecord;

/**
 * Created by Andy on 2015/12/9.
 */
public class SettingNewsServiceImpl implements SettingNewsService {
    @Override
    public String addMessage(SettingNewsDTO dto) {


        OfyService.ofy().save().entity(dto.getRecord()).now();


        dto.setRecord(new NewsRecord());
        return null;
    }

}
