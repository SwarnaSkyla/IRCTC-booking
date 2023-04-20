package com.example.Ticket_Booking.Models;


import jakarta.persistence.*;

@Entity
@Table(name="orders")
public class FoodOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int price;

    private int train_d;


    @ManyToOne
    @JoinColumn
    private Passenger passenger;

    public FoodOrder() {
    }

    public FoodOrder(int price, int train_d) {
        this.price = price;
        this.train_d = train_d;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTrain_d() {
        return train_d;
    }

    public void setTrain_d(int train_d) {
        this.train_d = train_d;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
}
