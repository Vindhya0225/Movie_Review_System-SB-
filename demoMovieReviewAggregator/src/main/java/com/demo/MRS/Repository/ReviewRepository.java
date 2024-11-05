package com.demo.MRS.Repository;
import com.demo.MRS.Entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
	List<Review> findByMovieId(Long movieId); // Example method to find reviews by movie ID
    List<Review> findByUserId(Long userId); // Example method to find reviews by user ID

}
