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

    @ApiMethod(name = "getUserRecord", path = "userInfo/get")
    public UserRecord getUserInfo(
            //
            @Named("id") String id,
            @Named("password") String password) {

        return OfyService.ofy().load().type(UserRecord.class)//
                .filter("id=", id)//
                .filter("password", password).first().now();

    }

    @ApiMethod(name = "save", path = "userInfo/save")
    public UserRecord save(
            //
            @Named("id") String id,
            @Named("password") String password,
            @Named("name") String name,
            @Named("regId") String regId
    ) {

        UserRecord userRecord = new UserRecord();
        userRecord.setId(id);
        userRecord.setLevel(-1);
        userRecord.setName(name);
        userRecord.setPassword(password);
        userRecord.setRegId(regId);


        OfyService.ofy().save().entity(userRecord).now();

        return userRecord;
    }

}
