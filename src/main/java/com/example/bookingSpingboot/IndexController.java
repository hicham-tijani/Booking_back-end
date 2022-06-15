package com.example.bookingSpingboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class IndexController {
    @GetMapping("/home")
    String index(){
        return "index";
    }
}

