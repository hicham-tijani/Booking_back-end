package com.example.bookingSpingboot.user;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public User loginUser(String username, String pwd) {
        return userRepository.loginUser(username, pwd);
    }
}