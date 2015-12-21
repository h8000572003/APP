package com.example.Andy.myapplication.backend.bean;

import com.example.Andy.myapplication.backend.common.CommonUtils;
import com.example.Andy.myapplication.backend.common.ExecutantType;
import com.example.Andy.myapplication.backend.domain.MessageDTO;
import com.example.Andy.myapplication.backend.entry.NewsRecord;
import com.example.Andy.myapplication.backend.service.MessageService;
import com.example.Andy.myapplication.backend.service.UserService;

import java.io.Serializable;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

/**
 * Created by Andy on 2015/12/9.
 */

@ManagedBean
@RequestScoped
public class MessageBean implements Serializable {
    private static final Logger LOG = Logger.getLogger(MessageBean.class.getName());

    private ExecutantType type;

    private MessageDTO dto = new MessageDTO();


    @ManagedProperty(value = "#{userService}")
    private transient UserService userService;

    @ManagedProperty(value = "#{messageService}")
    private transient MessageService service;

    public MessageDTO getDto() {
        return dto;
    }

    public void setDto(MessageDTO dto) {
        this.dto = dto;
    }

    public MessageService getService() {
        return service;
    }

    public void setService(MessageService service) {
        this.service = service;
    }

    @PostConstruct
    public void init() {

        this.type = this.userService.getExecutant();
        this.dto.setYyyymmdd(CommonUtils.getNowDate());
        this.service.loadTodayNews(this.getDto());
    }


    public void deletMessage(NewsRecord record) {
        dto.setSelectNewsRecord(record);

    }

    public static Logger getLOG() {
        return LOG;
    }

    public ExecutantType getType() {
        return type;
    }

    public void setType(ExecutantType type) {
        this.type = type;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}

