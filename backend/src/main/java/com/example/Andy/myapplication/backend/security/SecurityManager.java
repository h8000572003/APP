package com.example.Andy.myapplication.backend.security;

import com.example.Andy.myapplication.backend.OfyService;
import com.example.Andy.myapplication.backend.entry.UserRecord;

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


    private String DEF_ID = "X1234";
    private String DEF_PASSWORD = "X1234";

    private static final Logger log = Logger.getLogger(SecurityManager.class.getName());


    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException, DataAccessException {
        // TODO Auto-generated method stub
        return this.getUser(username);
    }

    private User getUser(String id) {

        if (this.isAccountEmpty()) {
            if (id.equals(DEF_ID)) {


                final UserRecord userRecord = new UserRecord();
                userRecord.setId(DEF_ID);
                userRecord.setName("ADMIN");
                userRecord.setPassword(DEF_PASSWORD);
                userRecord.setLevel("0");
                OfyService.ofy().save().entity(userRecord).now();
                return new User(DEF_ID, DEF_PASSWORD);
            }


        } else {
            User user = null;
            final UserRecord userRecord = OfyService.ofy().load().type(UserRecord.class).id(id).now();

            if (userRecord == null) {
                throw new UsernameNotFoundException("User " + id
                        + " has no GrantedAuthority");
            }
            return new User(userRecord.getId(), userRecord.getPassword());

        }

        throw new UsernameNotFoundException("User " + id
                + " has no GrantedAuthority");
    }

    /**
     * 判斷是否有使用者資料存於資料庫
     *
     * @return
     */
    private boolean isAccountEmpty() {
        return OfyService.ofy().load().type(UserRecord.class).count() == 0;
    }

}
