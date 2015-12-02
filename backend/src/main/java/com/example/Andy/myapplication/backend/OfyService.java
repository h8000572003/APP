package com.example.Andy.myapplication.backend;

import com.example.Andy.myapplication.backend.entry.NewsRecord;
import com.example.Andy.myapplication.backend.entry.RegistrationRecord;
import com.example.Andy.myapplication.backend.entry.UserRecord;
import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.ObjectifyService;

/**
 * Objectify service wrapper so we can statically register our persistence classes
 * More on Objectify here : https://code.google.com/p/objectify-appengine/
 */
public class OfyService {

    static {
        ObjectifyService.register(RegistrationRecord.class);
        ObjectifyService.register(NewsRecord.class);
        ObjectifyService.register(UserRecord.class);
    }

    public static Objectify ofy() {
        return ObjectifyService.ofy();
    }

    public static ObjectifyFactory factory() {
        return ObjectifyService.factory();
    }
}
