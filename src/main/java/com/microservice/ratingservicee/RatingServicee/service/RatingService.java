package com.microservice.ratingservicee.RatingServicee.service;


import com.microservice.ratingservicee.RatingServicee.Entity.Rating;

import java.util.List;

public interface RatingService {

     Rating createRating(Rating rating);

     List<Rating> getAllRatings();

    List<Rating> getByUserId(String userId);

    List<Rating> getByHotelId(String hotelId);


}
