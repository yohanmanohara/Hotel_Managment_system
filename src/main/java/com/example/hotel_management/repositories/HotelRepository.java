package com.example.hotel_management.repositories;

import com.example.hotel_management.models.Hotel;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface HotelRepository extends MongoRepository<Hotel, String> {
    List<Hotel> findByLocation(String location);
    List<Hotel> findByRatingGreaterThan(Integer rating);
}