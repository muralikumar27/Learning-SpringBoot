package com.murali.basicspringsecurity.service;

import com.murali.basicspringsecurity.entity.User;
import com.murali.basicspringsecurity.model.UserModel;
import org.springframework.stereotype.Service;


public interface UserService {
    public User registerUser(UserModel userModel);

    void saveUserToken(User user, String token);

   String verifyUser(String token);
}
