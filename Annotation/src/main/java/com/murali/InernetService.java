package com.murali;

import org.springframework.stereotype.Component;

@Component("Internet")
public class InernetService implements Service{
    @Override
    public void service() {
        System.out.println("PROVIDE INTERNET SERVICE...!");
    }
}
