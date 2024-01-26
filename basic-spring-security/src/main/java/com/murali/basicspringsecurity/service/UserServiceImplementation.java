package com.murali.basicspringsecurity.service;

import com.murali.basicspringsecurity.entity.User;
import com.murali.basicspringsecurity.model.UserModel;
import com.murali.basicspringsecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public User registerUser(UserModel userModel) {

        User user = new User();
        user.setEmailId(userModel.getEmailId());
        user.setName(userModel.getName());
        user.setPassword(passwordEncoder.encode(userModel.getPassword()));
        user.setRole("user");
        return userRepository.save(user);
    }
}
