package com.example.hotel_management.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "Hotel Management API is running! Use /api/hotels for hotel data";
    }
}