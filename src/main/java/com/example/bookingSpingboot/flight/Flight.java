package com.example.bookingSpingboot.flight;


import com.sun.istack.NotNull;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "flight")
public class Flight {
    @Id
    @GeneratedValue
    private Long idFlight;
    @Column(name = "place_departure", length = 45)
    @NotNull
    private String placeDeparture;
    @Column(name = "place_arrive", length = 45)
    @NotNull
    private String placeArrive;
    @Column(name = "date_departure")
    @NotNull
    private LocalDate dateDeparture;
    @Column(name = "date_arrive")
    @NotNull
    private LocalDate dateArrive;

    public Flight() {}

    public Flight(Long idFlight, String placeDeparture, String placeArrive, LocalDate dateDeparture, LocalDate dateArrive) {
        this.idFlight = idFlight;
        this.placeDeparture = placeDeparture;
        this.placeArrive = placeArrive;
        this.dateDeparture = dateDeparture;
        this.dateArrive = dateArrive;
    }

    public Long getIdFlight() {
        return idFlight;
    }

    public void setIdFlight(Long idFlight) {
        this.idFlight = idFlight;
    }

    public String getPlaceDeparture() {
        return placeDeparture;
    }

    public void setPlaceDeparture(String placeDeparture) {
        this.placeDeparture = placeDeparture;
    }

    public String getPlaceArrive() {
        return placeArrive;
    }

    public void setPlaceArrive(String placeArrive) {
        this.placeArrive = placeArrive;
    }

    public LocalDate getDateDeparture() {
        return dateDeparture;
    }

    public void setDateDeparture(LocalDate dateDeparture) {
        this.dateDeparture = dateDeparture;
    }

    public LocalDate getDateArrive() {
        return dateArrive;
    }

    public void setDateArrive(LocalDate dateArrive) {
        this.dateArrive = dateArrive;
    }
}
