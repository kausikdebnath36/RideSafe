package com.debnath.RideSafe.Dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ReviewDto {
    private Long id;

    private Long userId;

    private Long DriverId;

    private Double userRating;

    private String userFeedBack;

    private Double riderRating;

    private String riderFeedBack;

    public ReviewDto(Long id, Long userId, Long driverId, Double userRating, String userFeedBack, Double riderRating, String riderFeedBack) {
        this.id = id;
        this.userId = userId;
        DriverId = driverId;
        this.userRating = userRating;
        this.userFeedBack = userFeedBack;
        this.riderRating = riderRating;
        this.riderFeedBack = riderFeedBack;
    }
}
