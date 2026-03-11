package com.example.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet() {
        return "Hello Welcome back to Capgemini!!!";
    }

    @RequestMapping("/about")
    public String about() {
        return "This is About Section";
    }
}
