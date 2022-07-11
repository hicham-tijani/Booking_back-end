package com.example.bookingSpingboot.flight;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class FlightService {
    private final FlightRepository flightRepository;

    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public List<Flight> findAll() {
        return this.flightRepository.findAll();
    }

    public List<Flight> getFlightByPlaceAndDate(String placeDeparture,
                                                String placeArrive,
                                                LocalDate dateDeparture,
                                                LocalDate dateReturn) {
        return this.flightRepository.findAllByPlaceDepartureEqualsAndPlaceArriveEqualsAndDateDepartureEqualsAndDateReturnEquals(placeDeparture, placeArrive, dateDeparture, dateReturn);
    }
}
