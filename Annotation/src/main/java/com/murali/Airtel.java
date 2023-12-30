package com.murali;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Airtel implements ServiceProvider{

    @Autowired
    @Qualifier("callerTone")
    private Service service;

    @Override
    public void sim() {
        System.out.println("AIRTEL SIM");
        service.service();
    }
}
