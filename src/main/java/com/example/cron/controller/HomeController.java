package com.example.cron.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("home")
    public String homePage() {
        return "Welcome to Home Page!!";
    }
}
