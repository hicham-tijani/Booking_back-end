package com.example.bookingSpingboot.user;

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

    //INDEX
    @GetMapping("/")
    public String getHome(HttpSession session) {
        User user = (User) session.getAttribute("loggedUser");
        if(user == null) return "index";
        return "homePage";
    }

    //REGISTRAZIONE
    @GetMapping("/signUp")
    public String getRegistra(User user) {
        return  "signUp";
    }

    @PostMapping("/signUp")
    public String postRegistra( User user) {
        userService.saveUser(user);
        return  "redirect:homepage";
    }

    //LOGIN
    @GetMapping("/login")
    public String autenticazione(User user) {
        return "login";
    }

    @PostMapping("/login")
    public String postLogin(@RequestParam("username") String username, @RequestParam("pwd") String pwd, HttpSession session) {
        User user = userService.loginUser(username, pwd);
        if(user == null)
            return "login";
        else {
            session.setAttribute("loggedUser", user);
            return "redirect:homepage";
        }
    }

    //LOGOUT
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        session.setAttribute("loggedUser", null);
        return "redirect:/";
    }

    //HOMEPAGE
    @GetMapping("/homepage")
    public String getHomePage(HttpSession session, Model model){
        User user = (User) session.getAttribute("loggedUser");
        model.addAttribute("username", user.getUsername());
        return "homePage";
    }

}