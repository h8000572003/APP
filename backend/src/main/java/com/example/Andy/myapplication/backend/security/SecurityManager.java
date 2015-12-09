package com.example.Andy.myapplication.backend.security;

import org.springframework.dao.DataAccessException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

/**
 * Created by Andy on 2015/12/4.
 */

@Component("securityManager")
public class SecurityManager implements UserDetailsService {

    private static final Logger log = Logger.getLogger(SecurityManager.class.getName());


    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException, DataAccessException {
        // TODO Auto-generated method stub
        return this.getUser(username);
    }

    private User getUser(String id) {
        return new User(id, "123");

//        final UserRecord userRecord =
//                OfyService.ofy().load().type(UserRecord.class).id(id).now();
//
//        if (userRecord == null) {
//            throw new UsernameNotFoundException("User " + id
//                    + " has no GrantedAuthority");
//        }
//        return new User(userRecord.getId(), userRecord.getPassword());
    }
}
