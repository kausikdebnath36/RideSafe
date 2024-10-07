package com.debnath.RideSafe.Mapper;

import com.debnath.RideSafe.Dto.ReviewDto;
import com.debnath.RideSafe.Entity.Review;

public class ReviewMapper {
    public static Review mapToReview(ReviewDto reviewDto){
        Review review= new Review(reviewDto.getId(),
                reviewDto.getUserId(),
                reviewDto.getDriverId(),
                reviewDto.getUserRating(),
                reviewDto.getUserFeedBack(),
                reviewDto.getRiderRating(),
                reviewDto.getRiderFeedBack());

        return review;
    }

    public static ReviewDto mapToReviewDto(Review review){
        ReviewDto reviewDto= new ReviewDto(review.getId(),
                review.getUserId(),
                review.getDriverId(),
                review.getUserRating(),
                review.getUserFeedBack(),
                review.getRiderRating(),
                review.getRiderFeedBack());

        return reviewDto;
    }
}
