package com.demo.MRS.Controllers;

import com.demo.MRS.Entities.Review;
import com.demo.MRS.Services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reviews") // Base URL for review-related operations
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping // Endpoint to create a new review
    public ResponseEntity<Review> createReview(@RequestBody Review review) {
        Review createdReview = reviewService.saveReview(review);
        return ResponseEntity.ok(createdReview); // Return the created review
    }

    @GetMapping("/{id}") // Endpoint to get a review by ID
    public ResponseEntity<Review> getReviewById(@PathVariable Long id) {
        Review review = reviewService.findById(id);
        return ResponseEntity.ok(review); // Return the found review
    }

    @GetMapping // Endpoint to get all reviews
    public ResponseEntity<List<Review>> getAllReviews() {
        List<Review> reviews = reviewService.findAllReviews();
        return ResponseEntity.ok(reviews); // Return the list of reviews
    }

    @DeleteMapping("/{id}") // Endpoint to delete a review by ID
    public ResponseEntity<Void> deleteReview(@PathVariable Long id) {
        reviewService.deleteReview(id);
        return ResponseEntity.noContent().build(); // Return 204 No Content
    }

    @GetMapping("/movie/{movieId}") // Endpoint to get reviews by movie ID
    public ResponseEntity<List<Review>> getReviewsByMovieId(@PathVariable Long movieId) {
        List<Review> reviews = reviewService.findReviewsByMovieId(movieId);
        return ResponseEntity.ok(reviews); // Return the list of reviews for the specific movie
    }

    @GetMapping("/user/{userId}") // Endpoint to get reviews by user ID
    public ResponseEntity<List<Review>> getReviewsByUserId(@PathVariable Long userId) {
        List<Review> reviews = reviewService.findReviewsByUserId(userId);
        return ResponseEntity.ok(reviews); // Return the list of reviews by the specific user
    }
}
