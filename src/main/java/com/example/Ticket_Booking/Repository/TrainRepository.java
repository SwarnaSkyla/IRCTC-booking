package com.example.Ticket_Booking.Repository;


import com.example.Ticket_Booking.Models.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainRepository extends JpaRepository<Train,Integer> {
}
