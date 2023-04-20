package com.example.Ticket_Booking.EntryDto;

public class getFemalePassenger {
    private int x;

    private int y;

    private String destination;

    public getFemalePassenger() {
    }

    public getFemalePassenger(int x, int y, String destination) {
        this.x = x;
        this.y = y;
        this.destination = destination;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
