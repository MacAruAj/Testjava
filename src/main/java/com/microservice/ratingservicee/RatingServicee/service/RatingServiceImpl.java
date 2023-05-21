package com.microservice.ratingservicee.RatingServicee.service;

import com.microservice.ratingservicee.RatingServicee.Entity.Rating;
import com.microservice.ratingservicee.RatingServicee.Repository.RatingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {

@Autowired
    private RatingRepo repo;

    @Override
    public Rating createRating(Rating rating) {
        return repo.save(rating);
    }

    @Override
    public List<Rating> getAllRatings() {
        return repo.findAll();
    }

    @Override
    public List<Rating> getByUserId(String userId) {
        return repo.getByUserId(userId);
    }

    @Override
    public List<Rating> getByHotelId(String hotelId) {
        return repo.getByHotelId(hotelId);
    }
}
