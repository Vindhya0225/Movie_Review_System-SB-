package com.demo.MRS.Repository;
import com.demo.MRS.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username); // Example method to find a user by username

}
