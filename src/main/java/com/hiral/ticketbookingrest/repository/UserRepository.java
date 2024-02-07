package com.hiral.ticketbookingrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hiral.ticketbookingrest.model.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
