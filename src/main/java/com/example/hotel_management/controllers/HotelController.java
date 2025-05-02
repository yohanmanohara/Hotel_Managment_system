package com.example.hotel_management.controllers;

import com.example.hotel_management.models.Hotel;
import com.example.hotel_management.repositories.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hotels")
public class HotelController {

    @Autowired
    private HotelRepository hotelRepository;

    @GetMapping
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    @PostMapping
    public Hotel createHotel(@RequestBody Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @GetMapping("/location/{location}")
    public List<Hotel> getHotelsByLocation(@PathVariable String location) {
        return hotelRepository.findByLocation(location);
    }

    @GetMapping("/rating-above/{rating}")
    public List<Hotel> getHotelsWithRatingAbove(@PathVariable Integer rating) {
        return hotelRepository.findByRatingGreaterThan(rating);
    }
}