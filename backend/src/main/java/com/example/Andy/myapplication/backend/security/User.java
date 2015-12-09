package com.example.Andy.myapplication.backend.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by Andy on 2015/12/4.
 */
public class User implements UserDetails {
    private static final Logger LOG = Logger.getLogger(User.class.getName());
    private String id = "";
    private String password = "";


    public User(String id, String password) {
        this.id = id;
        this.password = password;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
        grantedAuthorities.add(new GrantedAuthorityImpl("ROLE_USER"));
        return grantedAuthorities;
    }

    @Override
    public String getPassword() {
        LOG.info("call getPassword():" + password);

        return this.password;
    }

    @Override
    public String getUsername() {

        LOG.info("call getUsername:" + id);
        return this.id;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
