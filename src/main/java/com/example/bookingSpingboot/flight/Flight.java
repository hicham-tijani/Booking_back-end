package com.example.bookingSpingboot.flight;


import com.sun.istack.NotNull;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

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

    @Column(name = "time_departure")
    @NotNull
    private LocalTime timeDeparture;

    @Column(name = "date_return")
    @NotNull
    private LocalDate dateReturn;

    @Column(name = "time_return")
    @NotNull
    private LocalTime timeReturn;


    public Flight() {}

    public Flight(Long idFlight, String placeDeparture, String placeArrive, LocalDate dateDeparture, LocalTime timeDeparture, LocalDate dateReturn, LocalTime timeReturn) {
        this.idFlight = idFlight;
        this.placeDeparture = placeDeparture;
        this.placeArrive = placeArrive;
        this.dateDeparture = dateDeparture;
        this.timeDeparture = timeDeparture;
        this.dateReturn = dateReturn;
        this.timeReturn = timeReturn;
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

    public LocalTime getTimeDeparture() {
        return timeDeparture;
    }

    public void setTimeDeparture(LocalTime timeDeparture) {
        this.timeDeparture = timeDeparture;
    }

    public LocalDate getDateReturn() {
        return dateReturn;
    }

    public void setDateReturn(LocalDate dateReturn) {
        this.dateReturn = dateReturn;
    }

    public LocalTime getTimeReturn() {
        return timeReturn;
    }

    public void setTimeReturn(LocalTime timeReturn) {
        this.timeReturn = timeReturn;
    }
}
