package com.demo.MRS.Services;
import com.demo.MRS.Entities.Review;

import java.util.List;

public interface ReviewService {
	Review saveReview(Review review); // Save a new review
    Review findById(Long id); // Find review by ID
    List<Review> findAllReviews(); // Get all reviews
    void deleteReview(Long id); // Delete a review by ID
    List<Review> findReviewsByMovieId(Long movieId); // Find reviews for a specific movie
    List<Review> findReviewsByUserId(Long userId); // Find reviews by a specific user

}
