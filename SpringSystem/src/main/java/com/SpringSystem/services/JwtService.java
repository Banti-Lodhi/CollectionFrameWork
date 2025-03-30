package com.SpringSystem.services;


import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class JwtService {
    @Value("${jwt.key}")
    private String algorithmKey;
    @Value("${jwt.issur}")
    private String issur;
    @Value(("${jwt.expiry}"))
    private int expiry;

Algorithm algorithm = null;
    @PostConstruct
    public void postConstruct() {
         algorithm = Algorithm.HMAC256(algorithmKey);
    }
    public String generateJwtToken(String username) {
        return JWT.create()
                .withClaim("username", username)
                .withExpiresAt(new Date(System.currentTimeMillis() + expiry))
                .withIssuer(issur)
                .sign(algorithm);

    }
    // Method to validate and extract the username from a JWT
    public String getUsername(String token) {
        DecodedJWT decodedJWT = JWT.require(algorithm)
                .withIssuer(issur)
                .build()
                .verify(token);
        return decodedJWT.getClaim("username").toString();
    }
}
