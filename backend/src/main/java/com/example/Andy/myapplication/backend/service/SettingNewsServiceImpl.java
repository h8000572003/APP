package com.example.Andy.myapplication.backend.service;

import com.example.Andy.myapplication.backend.OfyService;
import com.example.Andy.myapplication.backend.common.CommonUtils;
import com.example.Andy.myapplication.backend.domain.SettingNewsDTO;
import com.example.Andy.myapplication.backend.domain.SettingNewsItemDTO;
import com.example.Andy.myapplication.backend.entry.NewsRecord;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by Andy on 2015/12/9.
 */
@Service("settingNewsService")
public class SettingNewsServiceImpl implements SettingNewsService {
    @Override
    public String addMessage(SettingNewsDTO dto) {


        NewsRecord record = new NewsRecord();
        try {
            BeanUtils.copyProperties(record, dto.getRecord());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


        record.setBeginDate(CommonUtils.getStringDate(dto.getRecord().getBeginDate()));
        record.setEndDate(CommonUtils.getStringDate(dto.getRecord().getEndDate()));
        record.setYyyymmdd(CommonUtils.getNowDate());

        OfyService.ofy().save().entity(record).now();


        dto.setRecord(new SettingNewsItemDTO());
        return null;
    }

}
