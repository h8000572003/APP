package com.example.Andy.myapplication.backend.bean;

import com.example.Andy.myapplication.backend.OfyService;
import com.example.Andy.myapplication.backend.domain.SettingUserDTO;
import com.example.Andy.myapplication.backend.entry.UserRecord;
import com.example.Andy.myapplication.backend.service.SettingUserService;
import com.googlecode.objectify.cmd.LoadType;

import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.logging.Logger;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 * Created by Andy on 2015/12/2.
 */


//@ManagedBean
//@javax.faces.bean.ViewScoped
public class SettingUserBean implements Serializable {

    private static final Logger LOG = Logger.getLogger(SettingUserBean.class.getName());


    private SettingUserDTO dto = new SettingUserDTO();


    //    @ManagedProperty(value = "#{settingUserService}")
//    @Inject
    private transient SettingUserService service;


    //    @ManagedProperty("#{settingUserServiceBean}")
//    private transient SettingUserServiceBean service2;
//
////
//    @ManagedProperty("settingUserServiceBean")
//    private transient SettingUserServiceBean settingUserServiceBean;


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
        //  this.service.query(dto);

        FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO,
                "select: " + service


                , null);
        FacesContext.getCurrentInstance().addMessage(null, facesMsg);

        final LoadType<UserRecord> loadType =
                OfyService.ofy().load().type(UserRecord.class);

        if (StringUtils.isNotBlank(dto.getId())) {
            loadType.id(dto.getId());
        }
        dto.setQueryList(loadType.list());
        return null;
    }

    public String modfiy() {
//        this.service.modify(dto);
        FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO, "修改成功", null);
        FacesContext.getCurrentInstance().addMessage(null, facesMsg);
        dto.setEditMode(false);
        return null;
    }

    public String delete() {
//        this.service.delete(dto);
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
}
