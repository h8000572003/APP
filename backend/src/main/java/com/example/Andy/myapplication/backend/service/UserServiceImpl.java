package com.example.Andy.myapplication.backend.service;

import com.example.Andy.myapplication.backend.OfyService;
import com.example.Andy.myapplication.backend.common.ExecutantType;
import com.example.Andy.myapplication.backend.entry.UserRecord;
import com.example.Andy.myapplication.backend.security.User;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

/**
 * Created by Andy on 2015/12/18.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public ExecutantType getExecutant() {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        final UserRecord userRecord =
                OfyService.ofy().load().type(UserRecord.class).id(user.getUsername()).now();

        final ExecutantType type = new ExecutantType();
        type.setName(userRecord.getName());
        type.setId(user.getUsername());

        return type;
    }
}
