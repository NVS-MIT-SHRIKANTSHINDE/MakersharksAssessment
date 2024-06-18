package com.MakersharksAssessment.makersharksassessment.userapi.service;


import org.springframework.stereotype.Service;

import com.MakersharksAssessment.makersharksassessment.userapi.exception.UserAlreadyExistsException;
import com.MakersharksAssessment.makersharksassessment.userapi.exception.UserNotFoundException;
import com.MakersharksAssessment.makersharksassessment.userapi.model.User;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    private final Map<String, User> userStorage = new HashMap<>();

    public void registerUser(User user) {
        if (userStorage.containsKey(user.getUsername())) {
            throw new UserAlreadyExistsException("User already exists with username: " + user.getUsername());
        }
        userStorage.put(user.getUsername(), user);
    }

    public User fetchUser(String username) {
        User user = userStorage.get(username);
        if (user == null) {
            throw new UserNotFoundException("User not found with username: " + username);
        }
        return user;
    }
}
