package com.murali;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class User {

    @Autowired
    @Qualifier("jio")
    private ServiceProvider serviceProvider;

    public void using(){
        serviceProvider.sim();
    }
}
