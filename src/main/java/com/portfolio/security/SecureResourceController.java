package com.portfolio.security;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@RequestMapping("/api/secure")
public class SecureResourceController {

    @GetMapping("/data")
    public ResponseEntity<?> getSecureData() {
        return ResponseEntity.ok(Map.of(
            "message", "This is highly sensitive data.",
            "status", "Access Granted"
        ));
    }
}
