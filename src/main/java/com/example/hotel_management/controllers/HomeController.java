package com.example.hotel_management.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "<html>" +
                "<head><title>Hotel Management API</title></head>" +
                "<body style='display:flex; justify-content:center; align-items:center; height:100vh;'>" +
                "<div style='text-align:center; font-family:sans-serif;'>" +
                "<h1>Hotel Management API is runn wenawa uttaneeee!</h1>" +
                "<p>Use <code>/api/hotels</code> for hotel data</p>" +
                "</div>" +
                "</body>" +
                "</html>";
    }
}
