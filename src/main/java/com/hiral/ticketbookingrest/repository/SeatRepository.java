package com.hiral.ticketbookingrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import com.hiral.ticketbookingrest.model.Seat;

@Repository
public interface SeatRepository extends JpaRepository<Seat,Long>{

}
