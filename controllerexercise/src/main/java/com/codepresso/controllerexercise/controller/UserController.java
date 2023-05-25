package com.codepresso.controllerexercise.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @RequestMapping(value = "/paid")
    public String getPaidUser(){
        return "I'm a paid User.";
    }
    @RequestMapping(value = "/enterprise")
    public String getEnterpriseUser(){
        return "I'm a Enterprise User.";
    }
    
}
