package com.demo.MRS.Entities;
import jakarta.persistence.*;

@Entity
@Table(name = "movies") // This is the table for movies in the database
public class Movie {
	
	@Id // This marks the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // This automatically generates the ID
    private Long id; // Unique identifier for each movie

    @Column(nullable = false) // This column cannot be null
    private String title; // Title of the movie

    @Column(nullable = false) // This column cannot be null
    private String genre; // Genre(s) of the movie

    @Column(nullable = false) // This column cannot be null
    private String director; // Name of the movie's director

    @Column(length = 500) // This column can be up to 500 characters
    private String synopsis; // Brief description of the movie

    // Getters and Setters
    public Long getId() {
        return id; // Returns the movie ID
    }

    public void setId(Long id) {
        this.id = id; // Sets the movie ID
    }

    public String getTitle() {
        return title; // Returns the movie title
    }

    public void setTitle(String title) {
        this.title = title; // Sets the movie title
    }

    public String getGenre() {
        return genre; // Returns the movie genre
    }

    public void setGenre(String genre) {
        this.genre = genre; // Sets the movie genre
    }

    public String getDirector() {
        return director; // Returns the movie director
    }

    public void setDirector(String director) {
        this.director = director; // Sets the movie director
    }

    public String getSynopsis() {
        return synopsis; // Returns the movie synopsis
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis; // Sets the movie synopsis
    }

    @Override
    public String toString() {
        return "Movie [id=" + id + ", title=" + title + ", genre=" + genre + ", director=" + director + ", synopsis=" + synopsis + "]"; // Returns a string representation of the movie
    }

    // Constructor with parameters
    public Movie(Long id, String title, String genre, String director, String synopsis) {
        super();
        this.id = id; // Initializes movie ID
        this.title = title; // Initializes movie title
        this.genre = genre; // Initializes movie genre
        this.director = director; // Initializes movie director
        this.synopsis = synopsis; // Initializes movie synopsis
    }

    // Default constructor
    public Movie() {
        super();
        // This is an empty constructor
    }

}
