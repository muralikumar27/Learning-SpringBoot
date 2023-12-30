package com.murali;


import org.springframework.stereotype.Component;

@Component("messaging")
public class MessagingService implements Service{
    @Override
    public void service() {
        System.out.println("PROVIDE MESSAGING SERVICE....!");
    }
}
