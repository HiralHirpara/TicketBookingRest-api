package com.hiral.ticketbookingrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.hiral.ticketbookingrest.model.Cinema;

@Repository
public interface CinemaRepository extends JpaRepository<Cinema,Long>{

}
