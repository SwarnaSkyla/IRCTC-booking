package com.example.Ticket_Booking.Service;


import com.example.Ticket_Booking.Models.Train;
import com.example.Ticket_Booking.Repository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainService {

    @Autowired
    TrainRepository trainRepository;


    public String addTrain(Train train){

        trainRepository.save(train);

        return "Train added successfully";
    }

}
