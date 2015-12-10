package com.example.Andy.myapplication.backend.bean;

import com.example.Andy.myapplication.backend.domain.RegistUserDTO;
import com.example.Andy.myapplication.backend.exception.TaskBuiness;
import com.example.Andy.myapplication.backend.service.RegistUserService;

import java.io.Serializable;
import java.util.logging.Logger;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;


public class RegistUserBean implements Serializable {

    private static final Logger LOG = Logger.getLogger(RegistUserBean.class.getName());




    private RegistUserDTO dto = new RegistUserDTO();



    private transient RegistUserService service;



    public void RegistUserBean() {
        LOG.info("init");

    }
    public String registUser() {


        try {
            this.service.regist(dto);
            FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO, "新增成功", null);
            FacesContext.getCurrentInstance().addMessage(null, facesMsg);
        } catch (TaskBuiness e) {
            FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_WARN, e.getMessage(), null);
            FacesContext.getCurrentInstance().addMessage(null, facesMsg);
        }


        return null;
    }

    public RegistUserService getService() {
        return service;
    }

    public void setService(RegistUserService service) {
        this.service = service;
    }

    public RegistUserDTO getDto() {
        return dto;
    }

    public void setDto(RegistUserDTO dto) {
        this.dto = dto;
    }
}
