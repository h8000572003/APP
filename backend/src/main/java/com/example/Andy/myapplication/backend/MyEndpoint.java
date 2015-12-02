package com.example.Andy.myapplication.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;

/**
 * Created by Andy on 2015/11/30.
 */

@Api(name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(ownerDomain = "backend.myapplication.Andy.example.com",
                ownerName = "backend.myapplication.Andy.example.com",
                packagePath = ""))
public class MyEndpoint {
    @ApiMethod(name = "sayHi")
    public MyBean sayHi(@Named("name") String name) {
        MyBean response = new MyBean();
        response.setData("Hi, " + name);
        return response;
    }
}
