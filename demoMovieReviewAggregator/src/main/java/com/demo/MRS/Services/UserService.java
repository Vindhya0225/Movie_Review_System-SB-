package com.demo.MRS.Services;
import com.demo.MRS.Entities.User;

import java.util.List;

public interface UserService {
	User saveUser(User user); // Save a new user
    User findById(Long id); // Find user by ID
    List<User> findAllUsers(); // Get all users
    void deleteUser(Long id); // Delete a user by ID

}
