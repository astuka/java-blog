// package com.example.blog.controller;

// import com.example.blog.entity.User;
// import com.example.blog.repository.UserRepository;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.jdbc.core.JdbcTemplate;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;

// @RestController
// public class TestController {

//     @Autowired
//     private JdbcTemplate jdbcTemplate;

//     @Autowired
//     private UserRepository userRepository;

//     @GetMapping("/test-db")
//     public String testDatabase() {
//         try {
//             // Test basic connection
//             jdbcTemplate.execute("SELECT 1");
            
//             // Test entity creation
//             User user = new User();
//             user.setUsername("testuser");
//             user.setEmail("test@example.com");
//             user.setPassword("password123");
//             userRepository.save(user);
            
//             return "Database connection successful and user created!";
//         } catch (Exception e) {
//             return "Database connection failed: " + e.getMessage();
//         }
//     }
// } 