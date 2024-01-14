package com.murali;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context=new AnnotationConfigApplicationContext(Configuration.class);
        Original org = context.getBean(Original.class);
        org.display();
    }
}