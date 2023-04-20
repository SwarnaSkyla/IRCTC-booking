package com.example.Ticket_Booking.Controller;


import com.example.Ticket_Booking.EntryDto.PassengerEntryDto;
import com.example.Ticket_Booking.EntryDto.getFemalePassenger;
import com.example.Ticket_Booking.EntryDto.getPassengersOnDate;
import com.example.Ticket_Booking.Models.Passenger;
import com.example.Ticket_Booking.Service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/passenger")
public class PassengerController {

    @Autowired
    PassengerService passengerService;

    public String addPassenger(@RequestBody PassengerEntryDto passengerEntryDto){
        return passengerService.addPassenger(passengerEntryDto);
    }

    @GetMapping("/get_Passengers")
    public List<Passenger> getPassenger(@RequestBody getPassengersOnDate getPassengersDate){
        List<Passenger> passengers=passengerService.getPassengers(getPassengersDate);
        return passengers;
    }
    @GetMapping("/get_females")
    public List<Passenger> getFemale(@RequestBody getFemalePassenger getFemalePassenger){
        List<Passenger> passengers=passengerService.getFemale(getFemalePassenger);
        return passengers;
    }
}
