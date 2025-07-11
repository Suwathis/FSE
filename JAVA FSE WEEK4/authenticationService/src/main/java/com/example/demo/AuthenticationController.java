package com.example.demo;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Base64;

@RestController
public class AuthenticationController {

    @GetMapping("/authenticate")
    public ResponseEntity<?> authenticate(HttpServletRequest request) {
        String authHeader = request.getHeader("Authorization");

        if (authHeader != null && authHeader.startsWith("Basic ")) {
            String base64Credentials = authHeader.substring("Basic ".length());
            String credentials = new String(Base64.getDecoder().decode(base64Credentials));
            String[] values = credentials.split(":", 2);

            String username = values[0];
            String password = values[1];

            if (username.equals("user") && password.equals("pwd")) {
                String token = "dummy-jwt-token-123";
                return ResponseEntity.ok().body("{\"token\":\"" + token + "\"}");
            }
        }

        return ResponseEntity.status(401).body("Invalid credentials");
    }
}
