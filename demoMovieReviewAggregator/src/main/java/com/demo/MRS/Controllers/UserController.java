package com.demo.MRS.Controllers;

import com.demo.MRS.Entities.User;
import com.demo.MRS.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users") // Base URL for user-related operations
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping // Endpoint to create a new user
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User createdUser = userService.saveUser(user);
        return ResponseEntity.ok(createdUser); // Return the created user
    }

    @GetMapping("/{id}") // Endpoint to get a user by ID
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        User user = userService.findById(id);
        return ResponseEntity.ok(user); // Return the found user
    }

    @GetMapping // Endpoint to get all users
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.findAllUsers();
        return ResponseEntity.ok(users); // Return the list of users
    }

    @DeleteMapping("/{id}") // Endpoint to delete a user by ID
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build(); // Return 204 No Content
    }
}
