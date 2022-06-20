package com.example.bookingSpingboot.reservation;

import java.time.LocalDate;

public class Reservation {
    private String place_departure;
    private String place_arrive;
    private LocalDate date_departure;
    private LocalDate date_arrive;
    private Integer number_of_passenger;
    private String travel_class;

    public Reservation(String place_departure, String place_arrive, LocalDate date_departure, LocalDate date_arrive, Integer number_of_passenger, String travel_class) {
        this.place_departure = place_departure;
        this.place_arrive = place_arrive;
        this.date_departure = date_departure;
        this.date_arrive = date_arrive;
        this.number_of_passenger = number_of_passenger;
        this.travel_class = travel_class;
    }

    public String getPlace_departure() {
        return place_departure;
    }

    public void setPlace_departure(String place_departure) {
        this.place_departure = place_departure;
    }

    public String getPlace_arrive() {
        return place_arrive;
    }

    public void setPlace_arrive(String place_arrive) {
        this.place_arrive = place_arrive;
    }

    public LocalDate getDate_departure() {
        return date_departure;
    }

    public void setDate_departure(LocalDate date_departure) {
        this.date_departure = date_departure;
    }

    public LocalDate getDate_arrive() {
        return date_arrive;
    }

    public void setDate_arrive(LocalDate date_arrive) {
        this.date_arrive = date_arrive;
    }

    public Integer getNumber_of_passenger() {
        return number_of_passenger;
    }

    public void setNumber_of_passenger(Integer number_of_passenger) {
        this.number_of_passenger = number_of_passenger;
    }

    public String getTravel_class() {
        return travel_class;
    }

    public void setTravel_class(String travel_class) {
        this.travel_class = travel_class;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "place_departure='" + place_departure + '\'' +
                ", place_arrive='" + place_arrive + '\'' +
                ", date_departure=" + date_departure +
                ", date_arrive=" + date_arrive +
                ", number_of_passenger=" + number_of_passenger +
                ", travel_class='" + travel_class + '\'' +
                '}';
    }
}
