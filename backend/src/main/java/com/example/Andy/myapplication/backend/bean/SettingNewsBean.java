package com.example.Andy.myapplication.backend.bean;

import com.example.Andy.myapplication.backend.common.CommonUtils;
import com.example.Andy.myapplication.backend.domain.SettingNewsDTO;
import com.example.Andy.myapplication.backend.service.SettingNewsService;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 * Created by Andy on 2015/12/9.
 */
public class SettingNewsBean implements Serializable {

    private SettingNewsDTO dto = new SettingNewsDTO();

    private SettingNewsService service;

    public String addMessage() {


        dto.getRecord().setYyyymmdd(CommonUtils.getNowDate());
        service.addMessage(dto);
        FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO, "新增成功", null);
        FacesContext.getCurrentInstance().addMessage(null, facesMsg);

        return null;
    }

    public void sendMessage() {


    }

    public SettingNewsDTO getDto() {
        return dto;
    }

    public void setDto(SettingNewsDTO dto) {
        this.dto = dto;
    }

    public SettingNewsService getService() {
        return service;
    }

    public void setService(SettingNewsService service) {
        this.service = service;
    }
}
