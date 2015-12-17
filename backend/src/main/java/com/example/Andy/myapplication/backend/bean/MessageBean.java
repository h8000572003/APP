package com.example.Andy.myapplication.backend.bean;

import com.example.Andy.myapplication.backend.common.CommonUtils;
import com.example.Andy.myapplication.backend.domain.MessageDTO;
import com.example.Andy.myapplication.backend.service.MessageService;

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


    private MessageDTO dto = new MessageDTO();

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

        this.dto.setYyyymmdd(CommonUtils.getNowDate());
        this.service.loadTodayNews(this.getDto());
    }

    public static Logger getLOG() {
        return LOG;
    }
}
