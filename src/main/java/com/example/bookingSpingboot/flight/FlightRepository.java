package com.example.bookingSpingboot.flight;

import com.example.bookingSpingboot.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {
}
