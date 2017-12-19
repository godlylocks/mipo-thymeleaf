package com.firstfewlines.service;

import com.firstfewlines.domain.User;
import com.firstfewlines.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User addUser(User user) {
        userRepository.save(user);
        return user;
    }

    public Iterable<User> getUsers(){
        return userRepository.findAll();
    }
}
