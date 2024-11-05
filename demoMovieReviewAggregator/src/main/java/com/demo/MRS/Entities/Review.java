package com.demo.MRS.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "reviews") // This is the table for reviews in the database
public class Review {

    @Id // This marks the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // This automatically generates the ID
    private Long id; // Unique identifier for each review

    @ManyToOne // Many reviews can be associated with one movie
    @JoinColumn(name = "movie_id", nullable = false) // Foreign key column for movie
    private Movie movie; // Reference to the movie being reviewed

    @ManyToOne // Many reviews can be associated with one user
    @JoinColumn(name = "user_id", nullable = false) // Foreign key column for user
    private User user; // Reference to the user who wrote the review

    @Column(nullable = false) // This column cannot be null
    private Integer rating; // Rating given by the user (e.g., 1–5)

    @Column(length = 500) // This column can be up to 500 characters
    private String reviewText; // The user's review text

    // Getters and Setters
    public Long getId() {
        return id; // Returns the review ID
    }

    public void setId(Long id) {
        this.id = id; // Sets the review ID
    }

    public Movie getMovie() {
        return movie; // Returns the associated movie
    }

    public void setMovie(Movie movie) {
        this.movie = movie; // Sets the associated movie
    }

    public User getUser() {
        return user; // Returns the associated user
    }

    public void setUser(User user) {
        this.user = user; // Sets the associated user
    }

    public Integer getRating() {
        return rating; // Returns the rating
    }

    public void setRating(Integer rating) {
        this.rating = rating; // Sets the rating
    }

    public String getReviewText() {
        return reviewText; // Returns the review text
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText; // Sets the review text
    }

    @Override
    public String toString() {
        return "Review [id=" + id + ", movie=" + movie + ", user=" + user + ", rating=" + rating + ", reviewText=" + reviewText + "]"; // Returns a string representation of the review
    }

    // Constructor with parameters
    public Review(Long id, Movie movie, User user, Integer rating, String reviewText) {
        super();
        this.id = id; // Initializes review ID
        this.movie = movie; // Initializes the associated movie
        this.user = user; // Initializes the associated user
        this.rating = rating; // Initializes the rating
        this.reviewText = reviewText; // Initializes the review text
    }

    // Default constructor
    public Review() {
        super();
        // This is an empty constructor
    }
}
