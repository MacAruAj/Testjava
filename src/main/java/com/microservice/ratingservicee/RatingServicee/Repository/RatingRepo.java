package com.microservice.ratingservicee.RatingServicee.Repository;

import com.microservice.ratingservicee.RatingServicee.Entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingRepo extends JpaRepository<Rating,String> {

List<Rating> getByUserId(String userId);

List<Rating> getByHotelId(String hotelId);

}
