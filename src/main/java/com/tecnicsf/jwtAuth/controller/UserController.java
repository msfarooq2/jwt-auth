package com.tecnicsf.jwtAuth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class UserController {

    @GetMapping("status")
    public String fetchMessage(){
        return "Hello World";
    }
}
