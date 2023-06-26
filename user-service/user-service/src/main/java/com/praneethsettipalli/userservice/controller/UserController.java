package com.praneethsettipalli.userservice.controller;

import com.praneethsettipalli.userservice.entity.User;
import com.praneethsettipalli.userservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/")
    public User saveUser(User user){
        log.info("Inside saveUser of UserController");
        return userService.saveUser(user);
    }
}
