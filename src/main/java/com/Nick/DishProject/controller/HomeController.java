package com.Nick.DishProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;

@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping
    public String home() {
        return "home";
    }

}
