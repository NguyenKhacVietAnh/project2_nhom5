package com.example.project2.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class testhomeController {

    @GetMapping("the_anh")
    public String showViewhome(){
        return "/test_home/test_home";
    }
}

