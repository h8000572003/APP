package com.example.Andy.myapplication.backend.service;

import com.example.Andy.myapplication.backend.OfyService;
import com.example.Andy.myapplication.backend.domain.SettingUserDTO;
import com.example.Andy.myapplication.backend.entry.UserRecord;
import com.example.Andy.myapplication.backend.exception.TaskBuiness;
import com.googlecode.objectify.cmd.LoadType;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * Created by Andy on 2015/12/2.
 */

@Service("settingUserService")
public class SettingUserServiceImpl implements SettingUserService {
    @Override
    public void query(SettingUserDTO dto) throws TaskBuiness {

        final LoadType<UserRecord> loadType =
                OfyService.ofy().load().type(UserRecord.class);

        if (StringUtils.isNotBlank(dto.getId())) {
            loadType.id(dto.getId());
        }
        dto.setQueryList(loadType.list());


    }

    @Override
    public void modify(SettingUserDTO dto) throws TaskBuiness {
        OfyService.ofy().save().entity(dto.getSelectUserRecord()).now();
    }

    @Override
    public void delete(SettingUserDTO dto) throws TaskBuiness {
        OfyService.ofy().delete().entity(dto.getSelectUserRecord()).now();
    }
}
