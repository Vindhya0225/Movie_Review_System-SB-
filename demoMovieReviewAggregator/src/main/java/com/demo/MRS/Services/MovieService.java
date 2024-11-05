package com.demo.MRS.Services;
import com.demo.MRS.Entities.Movie;

import java.util.List;

public interface MovieService {
	Movie saveMovie(Movie movie); // Save a new movie
    Movie findById(Long id); // Find movie by ID
    List<Movie> findAllMovies(); // Get all movies
    void deleteMovie(Long id); // Delete a movie by ID
    List<Movie> findMoviesByGenre(String genre); // Find movies by genre
}


