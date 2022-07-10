package com.example.bookingSpingboot.flight;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FlightController {

    private final FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping("/searchForm")
    public String getForm(Flight flight) {
        return "searchFlightForm";
    }

    @PostMapping("/searchForm")
    public String postForm(Flight flight) {
        return "redirect:result";
    }

    @GetMapping("/result")
    public String getRuslt(Flight flight) {
        return "result";
    }
}
