package com.hiral.ticketbookingrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hiral.ticketbookingrest.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
