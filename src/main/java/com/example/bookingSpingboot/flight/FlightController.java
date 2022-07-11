package com.example.bookingSpingboot.flight;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

@Controller
public class FlightController {

    private final FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    //FORM TO SEARCH FLIGHTS
    @GetMapping("/searchForm")
    public String getForm(Flight flight) {
        return "searchFlightForm";
    }

    @PostMapping("/searchForm")
    public String postForm(@RequestParam("placeDeparture") String placeDeparture,
                           @RequestParam("placeArrive") String placeArrive,
                           @RequestParam("dateDeparture")
                               @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
                                       LocalDate dateDeparture,
                           @RequestParam("dateArrive")
                               @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
                                       LocalDate dateArrive,
                           Model model) {
        List<Flight> flights = flightService.getFlightByPlaceAndDate(placeDeparture, placeArrive, dateDeparture, dateArrive);
        model.addAttribute("flights", flights);
        return "resultSearch";
    }

    //ALL FLIGHTS
    @GetMapping("/flights")
    public String postForm(Model model) {
        List<Flight> flightList = flightService.findAll();
        model.addAttribute("flightList", flightList);
        return "result";
    }
}
