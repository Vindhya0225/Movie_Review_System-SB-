package com.demo.MRS.Services;
import com.demo.MRS.Entities.User;
import com.demo.MRS.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user); // Save user
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElse(null); // Find user by ID
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll(); // Get all users
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id); // Delete user by ID
    }

}
