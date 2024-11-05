package com.demo.MRS.Repository;
import com.demo.MRS.Entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
	List<Movie> findByGenre(String genre); // Example method to find movies by genre

}
