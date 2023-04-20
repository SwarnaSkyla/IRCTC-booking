package com.example.Ticket_Booking.Service;


import com.example.Ticket_Booking.EntryDto.PassengerEntryDto;
import com.example.Ticket_Booking.EntryDto.getFemalePassenger;
import com.example.Ticket_Booking.EntryDto.getPassengersOnDate;
import com.example.Ticket_Booking.Models.Passenger;
import com.example.Ticket_Booking.Models.Train;
import com.example.Ticket_Booking.Repository.PassengerRepository;
import com.example.Ticket_Booking.Repository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PassengerService {

    @Autowired
    PassengerRepository passengerRepository;

    @Autowired
    TrainRepository trainRepository;


    public String addPassenger(PassengerEntryDto passengerEntryDto){

        Passenger passenger=new Passenger();
        passenger.setTicketId(passengerEntryDto.getTicketId());
        passenger.setAge(passengerEntryDto.getAge());
        passenger.setDate(passengerEntryDto.getDate());
        passenger.setGender(passengerEntryDto.getGender());
        passenger.setName(passengerEntryDto.getName());

        Train train=trainRepository.findById(passengerEntryDto.getTrainNo()).get();

        passenger.setTrain(train);
        train.getPassengerList().add(passenger);

        trainRepository.save(train);

        return "Passenger Added successfully";

    }

    public List<Passenger> getPassengers(getPassengersOnDate getpassengersDate){

        List<Passenger> passengers=passengerRepository.findAll();
        List<Passenger> updated=new ArrayList<>();

        for(Passenger p:passengers){

            if((p.getTrain().getSource().equals(getpassengersDate.getSource()))&&
                    p.getTrain().getDestination().equals(getpassengersDate.getDestination())&&
                    p.getDate().equals(getpassengersDate.getDate())){
                updated.add(p);
            }
        }
        return updated;

    }

    public List<Passenger> getFemale(getFemalePassenger getFemalePassenger){

        List<Passenger> passengers=passengerRepository.findAll();
        List<Passenger> update=new ArrayList<>();

        for (Passenger p:passengers){

            if((p.getTrain().getDestination().equals(getFemalePassenger.getDestination()))&&
                    (p.getAge()>=getFemalePassenger.getX())&&(p.getAge()<=getFemalePassenger.getY())&&
                    (p.getGender().equals("F"))){
                update.add(p);
            }

        }
        return update;


    }



}
