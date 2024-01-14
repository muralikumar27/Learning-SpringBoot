package com.murali;

import org.springframework.stereotype.Component;

@Component
public class Addition {
    public int add(String s,int a,int b){
        return a+b;
    }
}
