package com.murali;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component //default name will be jio
public class Jio implements ServiceProvider{

    @Autowired
    @Qualifier("Internet")
    private Service service;
    @Override
    public void sim() {
        System.out.println("JIO SIM");
        service.service();
    }
}
