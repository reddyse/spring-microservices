package com.praneethsettipalli.userservice.controller;

import com.praneethsettipalli.userservice.VO.ResponseTemplateVO;
import com.praneethsettipalli.userservice.entity.UserObject;
import com.praneethsettipalli.userservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/")
    public UserObject saveUser(@RequestBody UserObject user){
        log.info("Inside saveUser of UserController");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUSerWithDepartment(@PathVariable("id") Long userId){
        log.info("Inside getUSerWithDepartment of UserController");
        return userService.getUserWithDepartment(userId);
    }
}
