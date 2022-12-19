package com.chornobuk.practice4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("auth")
public class AuthController {
    
    @PostMapping("/login")
    public String loginUser() {
        return "";
    }

    @PostMapping("/logout")
    public String postMethodName() {
        return "";
    }
}

