package com.example.Andy.myapplication.backend;

import com.example.Andy.myapplication.backend.entry.UserRecord;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.config.Named;

@Api(
        name = "userRecordEndpoint",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.myapplication.Andy.example.com",
                ownerName = "backend.myapplication.Andy.example.com",
                packagePath = ""
        )
)

public class UserRecordEndpoint {


    @ApiMethod(name = "getUserRecord")
    public UserRecord getUserInfo(
            //
            @Named("id") String id,
            @Named("password") String password) {

        final UserRecord userRecord = OfyService
                .ofy().load().type(UserRecord.class).id(id).now();

        if (userRecord == null) {
            return null;
        }
        return userRecord.getPassword().equals(password) ? userRecord : null;


    }


}
