package com.example.Andy.myapplication.backend.service;

import com.example.Andy.myapplication.backend.OfyService;
import com.example.Andy.myapplication.backend.domain.RegistUserDTO;
import com.example.Andy.myapplication.backend.entry.UserRecord;
import com.example.Andy.myapplication.backend.exception.TaskBuiness;

import org.springframework.stereotype.Service;

/**
 * Created by Andy on 2015/12/2.
 */
@Service("registUserService")
public class RegistUserServiceImpl implements RegistUserService {

    @Override
    public void regist(RegistUserDTO dto) {


        final UserRecord checkUser = OfyService.ofy().load().type(UserRecord.class).id(dto.getId()).now();

        if (checkUser != null) {
            throw new TaskBuiness("使用者已經存在！");
        }

        final UserRecord record = new UserRecord();
        record.setName(dto.getName());
        record.setLevel(dto.getLevel());
        record.setRegId("");
        record.setPassword(dto.getPassword());
        record.setId(dto.getId());

        OfyService.ofy().save().entity(record).now();
    }
}
