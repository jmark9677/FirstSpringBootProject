package com.Service;


import com.Repositories.UserRepository;
import com.controllers.UserController;
import com.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {


    @Autowired
    UserRepository userRepository;


    public boolean saveUser(User user){

        userRepository.save(user);

        return true;
    }

    public List<User> getUsers(){


        return userRepository.findAll();

    }
}
