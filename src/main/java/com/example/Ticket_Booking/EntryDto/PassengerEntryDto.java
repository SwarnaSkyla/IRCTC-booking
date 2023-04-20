package com.example.Ticket_Booking.EntryDto;

import java.time.LocalDate;

public class PassengerEntryDto {
    private int ticketId;

    private int age;

    private String name;

    private String gender;

    private LocalDate date;

    private int trainNo;


    public PassengerEntryDto() {
    }

    public PassengerEntryDto(int ticketId, int age, String name, String gender, LocalDate date) {
        this.ticketId = ticketId;
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.date = date;
    }

    public int getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(int trainNo) {
        this.trainNo = trainNo;
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
}
