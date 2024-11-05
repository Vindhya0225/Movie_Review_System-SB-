package com.demo.MRS.Entities;
import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "users") // This is the table for users in the database
public class User {
	@Id // This marks the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // This automatically generates the ID
    private Long id; // Unique identifier for each user

    @Column(nullable = false, unique = true) // This column cannot be null and must be unique
    private String username; // Username for login and display

    @Column(nullable = false, unique = true) // This column cannot be null and must be unique
    private String email; // Email address for communication and verification

    @Column(nullable = false) // This column cannot be null
    @JsonIgnore // This prevents the password from being shown when we serialize the user
    private String password; // Password (hashed for security)

    // Getters and Setters
    public Long getId() {
        return id; // Returns the user ID
    }

    public void setId(Long id) {
        this.id = id; // Sets the user ID
    }

    public String getUsername() {
        return username; // Returns the username
    }

    public void setUsername(String username) {
        this.username = username; // Sets the username
    }

    public String getEmail() {
        return email; // Returns the email
    }

    public void setEmail(String email) {
        this.email = email; // Sets the email
    }

    public String getPassword() {
        return password; // Returns the password
    }

    public void setPassword(String password) {
        this.password = password; // Sets the password
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", email=" + email + "]"; // Returns a string representation of the user
    }

    // Constructor with parameters
    public User(Long id, String username, String email, String password) {
        super();
        this.id = id; // Initializes user ID
        this.username = username; // Initializes username
        this.email = email; // Initializes email
        this.password = password; // Initializes password
    }

    // Default constructor
    public User() {
        super();
        // This is an empty constructor
    }
}


