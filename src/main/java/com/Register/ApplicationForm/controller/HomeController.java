package com.Register.ApplicationForm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index()
    {
return "index";
    }
    @GetMapping("/signin")
    public String login()
    {
        return "login";
    }
    @GetMapping("/register")
    public String register()
    {
        return "register";
    }

    @GetMapping("/forgotPassword")
    public String forgotPassword()
    {
        return "forgotPassword";
    }
}
