package com.example.bookingSpingboot.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String getHome() {
        return "index";
    }

    @GetMapping("/signUp")
    public String getRegistra(User user) {
        return  "signUp";
    }

    @PostMapping("/signUp")
    public String postRegistra( User user) {
        userService.saveUser(user);
        return  "result";
    }
}
