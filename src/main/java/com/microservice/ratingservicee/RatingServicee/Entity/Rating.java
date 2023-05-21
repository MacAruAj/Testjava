package com.microservice.ratingservicee.RatingServicee.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="Rating_details")
public class Rating {


    @Id
    private String ratingId;
    private String userId;
    private String hotelId;
    private int rating;
    private String feedback;


}
