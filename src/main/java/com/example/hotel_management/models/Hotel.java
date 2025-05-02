package com.example.hotel_management.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "hotels")
public class Hotel {
    @Id
    private String id;
    private String name;
    private String location;
    private Integer rating;

    // Constructors
    public Hotel() {}

    public Hotel(String name, String location, Integer rating) {
        this.name = name;
        this.location = location;
        this.rating = rating;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
    public Integer getRating() { return rating; }
    public void setRating(Integer rating) { this.rating = rating; }
}