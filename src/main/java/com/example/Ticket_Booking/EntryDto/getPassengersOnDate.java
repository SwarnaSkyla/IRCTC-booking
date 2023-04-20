package com.example.Ticket_Booking.EntryDto;

import java.time.LocalDate;

public class getPassengersOnDate {

    private String source;

    private String Destination;

    private LocalDate date;

    public getPassengersOnDate() {
    }

    public getPassengersOnDate(String source, String destination, LocalDate date) {
        this.source = source;
        Destination = destination;
        this.date = date;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
