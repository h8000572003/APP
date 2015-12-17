package com.example.Andy.myapplication.backend.bean;

import com.example.Andy.myapplication.backend.domain.SettingUserDTO;
import com.example.Andy.myapplication.backend.service.SettingUserService;

import java.io.Serializable;
import java.util.logging.Logger;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 * Created by Andy on 2015/12/2.
 */


@ManagedBean
@ViewScoped
public class SettingUserBean implements Serializable {

    private static final Logger LOG = Logger.getLogger(SettingUserBean.class.getName());


    private SettingUserDTO dto = new SettingUserDTO();


    @ManagedProperty(value = "#{settingUserService}")
    private transient SettingUserService service;


    public SettingUserDTO getDto() {
        return dto;
    }

    public void setDto(SettingUserDTO dto) {
        this.dto = dto;
    }

    public String setEditMode() {
        this.dto.setEditMode(true);
        return null;
    }


    /**
     * 查詢使用者
     *
     * @return
     */
    public String query() {
        this.service.query(dto);


        return null;
    }

    public String modfiy() {
        this.service.modify(dto);
        FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO, "修改成功", null);
        FacesContext.getCurrentInstance().addMessage(null, facesMsg);
        dto.setEditMode(false);
        return null;
    }

    public String delete() {
        this.service.delete(dto);
        FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO, "刪除成功", null);
        FacesContext.getCurrentInstance().addMessage(null, facesMsg);
        dto.setEditMode(false);
        return null;
    }

    public static Logger getLog() {
        return LOG;
    }


    public static Logger getLOG() {
        return LOG;
    }

    public void setService(SettingUserService service) {
        this.service = service;
    }

    public SettingUserService getService() {
        return service;
    }


}
