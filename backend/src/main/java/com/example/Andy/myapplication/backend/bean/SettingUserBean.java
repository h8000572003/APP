package com.example.Andy.myapplication.backend.bean;

import com.example.Andy.myapplication.backend.common.ExecutantFactory;
import com.example.Andy.myapplication.backend.common.ExecutantType;
import com.example.Andy.myapplication.backend.domain.SettingUserDTO;
import com.example.Andy.myapplication.backend.service.SettingUserService;

import java.io.Serializable;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

/**
 * Created by Andy on 2015/12/2.
 */

@ManagedBean
@ViewScoped
public class SettingUserBean implements Serializable {

    private static final Logger log = Logger.getLogger(SettingUserBean.class.getName());


    private SettingUserDTO dto = new SettingUserDTO();


    @ManagedProperty(value = "#{settingUserService}")
    private transient SettingUserService service;

    private ExecutantType type;

    @PostConstruct
    public void init() {

        this.type = ExecutantFactory.get();
    }


    public SettingUserDTO getDto() {
        return dto;
    }

    public void setDto(SettingUserDTO dto) {
        this.dto = dto;
    }

    /**
     * 查詢使用者
     * @return
     */
    public String query() {
        this.service.query(dto, type);
        return null;
    }
    public String modfiy(){
        this.service.modify(dto,type);
        return null;
    }
    public String delete(){
        this.service.delete(dto,type);
        return null;
    }

    public static Logger getLog() {
        return log;
    }

    public SettingUserService getService() {
        return service;
    }

    public void setService(SettingUserService service) {
        this.service = service;
    }

    public ExecutantType getType() {
        return type;
    }

    public void setType(ExecutantType type) {
        this.type = type;
    }
}
