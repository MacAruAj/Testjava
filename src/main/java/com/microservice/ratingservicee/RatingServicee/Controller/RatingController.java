package com.microservice.ratingservicee.RatingServicee.Controller;

import com.microservice.ratingservicee.RatingServicee.Entity.Rating;
import com.microservice.ratingservicee.RatingServicee.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userRating")
public class RatingController {

    @Autowired
    private RatingService serv;

    @PostMapping
    public ResponseEntity<Rating> create(@RequestBody Rating rating) {
        return ResponseEntity.status(HttpStatus.CREATED).body(serv.createRating(rating));

    }
    @GetMapping
    public ResponseEntity <List<Rating>> getAllRatings(){
        return ResponseEntity.status(HttpStatus.OK).body(serv.getAllRatings());
    }

    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Rating>> getAllUserById(@PathVariable String userId){
        return ResponseEntity.status(HttpStatus.OK).body(serv.getByUserId(userId));
    }

    @GetMapping("/users/{hotelId}")
    public ResponseEntity <List<Rating>> getAllByHotelId(@PathVariable String hotelId){
        return ResponseEntity.status(HttpStatus.OK).body(serv.getByHotelId(hotelId));
    }

}
