package com.example.bookingSpingboot.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

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

    //REGISTRAZIONE
    @GetMapping("/signUp")
    public String getRegistra(User user) {
        return  "signUp";
    }

    @PostMapping("/signUp")
    public String postRegistra( User user) {
        userService.saveUser(user);
        return  "result";
    }
    //LOGIN
    @GetMapping("/login")
    public String autenticazione(User user) {
        return "login";
    }
    @PostMapping("/submitlogin")

    public String postLogin(@RequestParam("username") String username, @RequestParam("pwd") String pwd, Model model, HttpSession session) {
        User user = userService.loginUser(username, pwd);
        if(user == null)
            return "redirect:/user/login";
        else {
            System.out.println("login funziona");
            return "redirect:/";
        }
    }
}