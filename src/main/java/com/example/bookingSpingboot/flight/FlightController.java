package com.example.bookingSpingboot.flight;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

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

    @GetMapping("/flights")
    public String postForm(Model model) {
        List<Flight> flightList = flightService.findAll();
        model.addAttribute("flightList", flightList);
        return "result";
    }
}
