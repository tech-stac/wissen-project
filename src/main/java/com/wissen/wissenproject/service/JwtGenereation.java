package com.wissen.wissenproject.service;


import com.wissen.wissenproject.entity.jwt.User;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface JwtGenereation {

    Map<String , String> genereateToken(User user);

}
