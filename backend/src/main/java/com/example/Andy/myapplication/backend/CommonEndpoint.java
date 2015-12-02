package com.example.Andy.myapplication.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import java.util.logging.Logger;

import javax.inject.Named;

@Api(
        name = "common",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.myapplication.Andy.example.com",
                ownerName = "backend.myapplication.Andy.example.com",
                packagePath = ""
        )
)
public class CommonEndpoint {
    private static final Logger log = Logger.getLogger(CommonEndpoint.class.getName());


    @ApiMethod(name = "insertNews")
    public void insetNews(@Named("content") String content) {

    }
}

