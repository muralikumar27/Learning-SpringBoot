package com.murali.basicspringsecurity.service;

import com.murali.basicspringsecurity.entity.User;
import com.murali.basicspringsecurity.model.UserModel;
import org.springframework.stereotype.Service;


public interface UserService {
    public User registerUser(UserModel userModel);
}
