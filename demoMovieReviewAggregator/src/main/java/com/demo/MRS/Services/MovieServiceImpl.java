package com.demo.MRS.Services;

import com.demo.MRS.Entities.Movie;
import com.demo.MRS.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie); // Save movie
    }

    @Override
    public Movie findById(Long id) {
        return movieRepository.findById(id).orElse(null); // Find movie by ID
    }

    @Override
    public List<Movie> findAllMovies() {
        return movieRepository.findAll(); // Get all movies
    }

    @Override
    public void deleteMovie(Long id) {
        movieRepository.deleteById(id); // Delete movie by ID
    }

    @Override
    public List<Movie> findMoviesByGenre(String genre) {
        return movieRepository.findByGenre(genre); // Find movies by genre
    }
}
