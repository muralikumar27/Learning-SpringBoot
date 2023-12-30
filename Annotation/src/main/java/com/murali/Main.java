package com.murali;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);

        User user = context.getBean("user",User.class);
        user.using();
    }
}