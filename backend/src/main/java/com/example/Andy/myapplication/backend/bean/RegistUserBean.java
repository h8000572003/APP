package com.example.Andy.myapplication.backend.bean;

import com.example.Andy.myapplication.backend.domain.RegistUserDTO;
import com.example.Andy.myapplication.backend.exception.TaskBuiness;
import com.example.Andy.myapplication.backend.service.RegistUserService;

import java.io.Serializable;

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
public class RegistUserBean implements Serializable {


    private RegistUserDTO dto = new RegistUserDTO();


    @ManagedProperty(value = "#{registUserService}")
    private transient RegistUserService registUserService;

    public String registUser() {


        try {
            this.registUserService.regist(dto);
            FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO, "新增成功", null);
            FacesContext.getCurrentInstance().addMessage(null, facesMsg);
        } catch (TaskBuiness e) {
            FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_WARN, e.getMessage(), null);
            FacesContext.getCurrentInstance().addMessage(null, facesMsg);
        }


        return null;
    }

    public RegistUserService getRegistUserService() {
        return registUserService;
    }

    public void setRegistUserService(RegistUserService registUserService) {
        this.registUserService = registUserService;
    }

    public RegistUserDTO getDto() {
        return dto;
    }

    public void setDto(RegistUserDTO dto) {
        this.dto = dto;
    }
}
