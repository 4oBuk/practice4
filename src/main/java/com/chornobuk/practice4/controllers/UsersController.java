package com.chornobuk.practice4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chornobuk.practice4.services.UsersService;
import com.chornobuk.practice4.services.UsersServiceImpl;

@Controller
@RequestMapping("users")
public class UsersController {
    
    UsersService usersService;

    public UsersController(UsersServiceImpl usersService) {
        this.usersService = usersService;
    }

    @GetMapping()
    public String getsUsers(Model model) {
        model.addAttribute("users", usersService.getAllUsers());
        return "users";
    }
}
