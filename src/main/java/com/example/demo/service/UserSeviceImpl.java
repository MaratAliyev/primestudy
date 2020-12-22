package com.example.demo.service;

import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserSeviceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;


}
