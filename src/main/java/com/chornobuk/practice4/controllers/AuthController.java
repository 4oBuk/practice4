package com.chornobuk.practice4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chornobuk.practice4.entities.User;
import com.chornobuk.practice4.services.UsersServiceImpl;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("auth")
public class AuthController {

    UsersServiceImpl usersService;
    private static String loginFailedMessage = "login failed. Wrong email or passsword";

    public AuthController(UsersServiceImpl usersService) {
        this.usersService = usersService;
    }

    @GetMapping("/login")
    public String getLoginPage(Model model) {
        return "login";
    }

    @PostMapping("/login")
    public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpServletRequest request) {
        // get data from form as user
        User user = usersService.authorizeUser(email, password);
        if (user != null) {
            request.getSession().setAttribute("user", user);
            return "redirect:/";
        }
        // default page is login page, if user is authenticated
        // show page with users I can create a controller for a default page
        // do redirect to prevent log in multiple times
        model.addAttribute("errorMessage", loginFailedMessage);
        return "login";
    }

    @GetMapping("/logout")
    public String postMethodName(HttpServletRequest request) {
        request.getSession().invalidate();
        return "login";
    }
}
