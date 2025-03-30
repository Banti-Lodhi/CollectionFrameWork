package com.SpringSystem.controller;

import com.SpringSystem.services.JwtService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    @Autowired
    private JwtService jwtService;

    @PostMapping("/getToken")
    public String login(@RequestParam String username) {
        return jwtService.generateJwtToken(username);
    }
    @PostMapping("/getUser")
    public  String getUsername(@RequestParam String token) {
        return jwtService.getUsername(token);
    }
}
