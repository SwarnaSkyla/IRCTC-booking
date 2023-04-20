package com.example.Ticket_Booking.Models;


import jakarta.persistence.*;
import org.apache.catalina.LifecycleState;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="passengers")
public class Passenger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ticketId;

    private int age;

    private String name;

    private String gender;

    private LocalDate date;

    @ManyToOne
    @JoinColumn
    private Train train;

    @OneToMany(mappedBy = "passenger",cascade = CascadeType.ALL)
    private List<FoodOrder> foodOrderList=new ArrayList<>();

    public Passenger() {
    }

    public Passenger(int age, String name, String gender, LocalDate date) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.date = date;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public List<FoodOrder> getFoodOrderList() {
        return foodOrderList;
    }

    public void setFoodOrderList(List<FoodOrder> foodOrderList) {
        this.foodOrderList = foodOrderList;
    }
}
