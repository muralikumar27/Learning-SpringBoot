package com.murali.basicspringsecurity.event;

import com.murali.basicspringsecurity.entity.User;
import com.murali.basicspringsecurity.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.UUID;
/*
* This class will be Used to listen to the event that has been
* published by the controller layer ,in this class we will
* create the TOKEN for the user and send as mail ,here for simplicity
* using log to simulate the email and also the token created it will be
* stored in DB as separate table with ONE-TO-ONE relationship with
* the user table with expiry time of the token.After storing the token
* in DB Email will be sent to the user (simulated as log).
*/
@Slf4j
@Component
public class UserRegistrationCompleteEventListener
        implements ApplicationListener<UserRegistrationCompleteEvent> {
    @Autowired
    private UserService userService;
    @Override
    public void onApplicationEvent(UserRegistrationCompleteEvent event) {
        User user = event.getUser();
        String token = UUID.randomUUID().toString();
        userService.saveUserToken(user,token);
        log.info("CLICK TO VERIFY THE ACCOUNT :"+
                event.getApplicationUrl()+"/verifyUser?token="+token);
    }
}
