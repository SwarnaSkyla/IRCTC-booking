package com.example.Ticket_Booking.Controller;


import com.example.Ticket_Booking.Models.Train;
import com.example.Ticket_Booking.Service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/train")
public class TrainController {

    @Autowired
    TrainService trainService;

    public String addTrain(@RequestBody Train train){
        return trainService.addTrain(train);
    }

}
