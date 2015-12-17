package com.example.Andy.myapplication.backend.bean;

import com.example.Andy.myapplication.backend.common.CommonUtils;
import com.example.Andy.myapplication.backend.domain.SettingNewsDTO;
import com.example.Andy.myapplication.backend.service.SettingNewsService;

import java.io.Serializable;
import java.util.logging.Logger;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 * Created by Andy on 2015/12/9.
 */


@ManagedBean
@RequestScoped
public class SettingNewsBean implements Serializable {

    private static final Logger LOG = Logger.getLogger(SettingUserBean.class.getName());


    @ManagedProperty(value = "#{userBean}")
    private UserBean userBean;

    private SettingNewsDTO dto = new SettingNewsDTO();


    @ManagedProperty(value = "#{settingNewsService}")
    private transient SettingNewsService service;

    public SettingNewsBean() {

        LOG.info("init");
    }

    public String addMessage() {


        dto.getRecord().setYyyymmdd(CommonUtils.getNowDate());
        this.service.addMessage(dto);
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

    public static Logger getLOG() {
        return LOG;
    }


    public SettingNewsService getService() {
        return service;
    }

    public void setService(SettingNewsService service) {
        this.service = service;
    }

    public UserBean getUserBean() {
        return userBean;
    }

    public void setUserBean(UserBean userBean) {
        this.userBean = userBean;
    }
}
