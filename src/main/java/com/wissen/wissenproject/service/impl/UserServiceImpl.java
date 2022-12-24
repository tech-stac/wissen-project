package com.wissen.wissenproject.service.impl;

import com.wissen.wissenproject.entity.jwt.User;
import com.wissen.wissenproject.repository.UserRepository;
import com.wissen.wissenproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public void saveUser(User user) {
      userRepository.save(user);
    }

    @Override
    public User getUserByNameAndPassword(String name, String password) throws  Exception {
        User user = userRepository.findByUserNameAndPassword(name,password);
        if(user == null){
            throw new Exception("Invalid id and password");
        }
        return user;
    }
}
