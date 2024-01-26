package com.murali.basicspringsecurity.controller;


import com.murali.basicspringsecurity.entity.User;
import com.murali.basicspringsecurity.event.UserRegistrationCompleteEvent;
import com.murali.basicspringsecurity.model.UserModel;
import com.murali.basicspringsecurity.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRegistrationController {
    @Autowired
    private UserService userService;
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;
    @PostMapping("/register")
    public String registerUser(@RequestBody UserModel userModel, HttpServletRequest request){
        /*
        * Once the user registers to the website
        * the user data will be stored in the DB
        * by calling the registerUser() service method
         */
        User user = userService.registerUser(userModel);
        /*
        * After the user registration and saving user details
        * to the Database ,an email has to be sent to the user
        * to verify the account before enabling the user
        * by default user will be disabled
        * to send the EMAIL an event will be published and listened by
        * an event listener.For that we need to create a class for publishing
        * and listening as UserRegistrationCompleteEvent ans
        * UserRegistrationCompleteEventListener
         */
        applicationEventPublisher.publishEvent(new UserRegistrationCompleteEvent
                (user,createApplicationUrl(request))
        );
        return "Successful";
    }

    private String createApplicationUrl(HttpServletRequest request) {
        return "http://"+request.getServerName()+":"
                +request.getServerPort()+
                request.getContextPath();
    }
}
