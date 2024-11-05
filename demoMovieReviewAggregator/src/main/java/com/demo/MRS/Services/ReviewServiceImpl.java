package com.demo.MRS.Services;

import com.demo.MRS.Entities.Review;
import com.demo.MRS.Repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    @Override
    public Review saveReview(Review review) {
        return reviewRepository.save(review); // Save review
    }

    @Override
    public Review findById(Long id) {
        return reviewRepository.findById(id).orElse(null); // Find review by ID
    }

    @Override
    public List<Review> findAllReviews() {
        return reviewRepository.findAll(); // Get all reviews
    }

    @Override
    public void deleteReview(Long id) {
        reviewRepository.deleteById(id); // Delete review by ID
    }

    @Override
    public List<Review> findReviewsByMovieId(Long movieId) {
        return reviewRepository.findByMovieId(movieId); // Find reviews for a specific movie
    }

    @Override
    public List<Review> findReviewsByUserId(Long userId) {
        return reviewRepository.findByUserId(userId); // Find reviews by a specific user
    }
}
