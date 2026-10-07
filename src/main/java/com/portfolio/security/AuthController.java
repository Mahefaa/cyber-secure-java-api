package com.portfolio.security;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestParam String username, @RequestParam String password) {
        // In a real app, use AuthenticationManager and UserDetailsService
        if("admin".equals(username) && "securepassword".equals(password)) {
            String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.MockedTokenPayload.SignatureMock";
            return ResponseEntity.ok("{\"token\": \"" + token + "\"}");
        }
        return ResponseEntity.status(401).body("Invalid credentials");
    }
}
