package com.example.bookingSpingboot.flight;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;


@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
    List<Flight> findAllByPlaceDepartureEqualsAndPlaceArriveEqualsAndDateDepartureEqualsAndDateArriveEquals(
            String placeDeparture,
            String placeArrive,
            LocalDate dateDeparture,
            LocalDate dateArrive
    );
}