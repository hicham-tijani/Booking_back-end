package com.example.bookingSpingboot.flight;


import com.sun.istack.NotNull;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "flight")
public class Flight {
    @Id
    @GeneratedValue
    private Long idFlight;
    @Column(name = "placeDeparture", length = 45)
    @NotNull
    private String placeDeparture;
    @Column(name = "placeArrive", length = 45)
    @NotNull
    private String placeArrive;
    @Column(name = "dateDeparture")
    @NotNull
    private LocalDateTime dateDeparture;
    @Column(name = "dateArrive")
    @NotNull
    private LocalDateTime dateArrive;

    public Flight() {}

    public Flight(Long idFlight, String placeDeparture, String placeArrive, LocalDateTime dateDeparture, LocalDateTime dateArrive) {
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

    public LocalDateTime getDateDeparture() {
        return dateDeparture;
    }

    public void setDateDeparture(LocalDateTime dateDeparture) {
        this.dateDeparture = dateDeparture;
    }

    public LocalDateTime getDateArrive() {
        return dateArrive;
    }

    public void setDateArrive(LocalDateTime dateArrive) {
        this.dateArrive = dateArrive;
    }
}