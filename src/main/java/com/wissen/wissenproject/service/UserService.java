package com.wissen.wissenproject.service;

import com.wissen.wissenproject.entity.jwt.User;
import org.springframework.stereotype.Service;


@Service
public interface UserService {

    public void saveUser(User user);
    public User getUserByNameAndPassword(String name, String password) throws Exception;
}
