package com.example.bookingSpingboot.reservation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservationController {
    @GetMapping("/home")
    String getReservation(){
        return "index";
    }
}
