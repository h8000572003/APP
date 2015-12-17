package com.example.Andy.myapplication.backend.bean;

import java.io.IOException;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Created by Andy on 2015/12/15.
 */
@SessionScoped
@ManagedBean
public class UserBean implements Serializable {
    private String id = "";
    private String name = "";
    private String loginTime = "";

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }


    public String login() throws ServletException, IOException {
        //do any job with the associated values that you've got from the user, like persisting attempted login, etc.
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ExternalContext extenalContext = facesContext.getExternalContext();
        RequestDispatcher dispatcher = ((ServletRequest) extenalContext.getRequest()).getRequestDispatcher("j_spring_security_check");
        dispatcher.forward((ServletRequest) extenalContext.getRequest(), (ServletResponse) extenalContext.getResponse());
        facesContext.responseComplete();
        return null;
    }
}
