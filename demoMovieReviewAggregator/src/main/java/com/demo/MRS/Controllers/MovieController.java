package com.demo.MRS.Controllers;

import com.demo.MRS.Entities.Movie;
import com.demo.MRS.Services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movies") // Base URL for movie-related operations
public class MovieController {

    @Autowired
    private MovieService movieService;

    @PostMapping // Endpoint to create a new movie
    public ResponseEntity<Movie> createMovie(@RequestBody Movie movie) {
        Movie createdMovie = movieService.saveMovie(movie);
        return ResponseEntity.ok(createdMovie); // Return the created movie
    }

    @GetMapping("/{id}") // Endpoint to get a movie by ID
    public ResponseEntity<Movie> getMovieById(@PathVariable Long id) {
        Movie movie = movieService.findById(id);
        return ResponseEntity.ok(movie); // Return the found movie
    }

    @GetMapping // Endpoint to get all movies
    public ResponseEntity<List<Movie>> getAllMovies() {
        List<Movie> movies = movieService.findAllMovies();
        return ResponseEntity.ok(movies); // Return the list of movies
    }

    @DeleteMapping("/{id}") // Endpoint to delete a movie by ID
    public ResponseEntity<Void> deleteMovie(@PathVariable Long id) {
        movieService.deleteMovie(id);
        return ResponseEntity.noContent().build(); // Return 204 No Content
    }

    @GetMapping("/genre/{genre}") // Endpoint to find movies by genre
    public ResponseEntity<List<Movie>> getMoviesByGenre(@PathVariable String genre) {
        List<Movie> movies = movieService.findMoviesByGenre(genre);
        return ResponseEntity.ok(movies); // Return the list of movies
    }
}
