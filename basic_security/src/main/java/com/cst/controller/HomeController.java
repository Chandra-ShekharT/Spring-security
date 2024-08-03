package com.cst.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @GetMapping("/")
    public String getHomeData() {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "/";
    }
}
