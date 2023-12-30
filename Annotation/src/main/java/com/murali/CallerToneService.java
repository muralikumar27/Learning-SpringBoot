package com.murali;

import org.springframework.stereotype.Component;

@Component("callerTone")
public class CallerToneService implements Service{


    @Override
    public void service() {
        System.out.println("PROVIDE CALLER TONE SERVICE...!");
    }
}
