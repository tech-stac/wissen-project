package com.wissen.wissenproject.service.impl;

import com.wissen.wissenproject.entity.jwt.User;
import com.wissen.wissenproject.service.JwtGenereation;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Value;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class JwtGenereationTokenImpl implements JwtGenereation {

    @Value("${jwt.secret}")
    private String secret;

    @Value("${app.jwttoken.message}")
    private String message;

    @Override
    public Map<String, String> genereateToken(User user) {
        String jwtToken = "";
        jwtToken = Jwts.builder().setSubject(user.getUserName()).setIssuedAt(new Date()).signWith(SignatureAlgorithm.HS256, "secret").compact();
        Map<String, String> token = new HashMap<>();
        token.put("jwtToken", jwtToken);
        token.put("message", message);
        return token;
    }
}
