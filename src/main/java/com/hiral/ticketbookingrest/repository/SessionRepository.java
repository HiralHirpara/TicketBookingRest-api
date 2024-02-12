package com.hiral.ticketbookingrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.hiral.ticketbookingrest.model.Session;
import com.hiral.ticketbookingrest.model.SessionSeat;

@Repository
public interface SessionRepository  extends JpaRepository<SessionSeat, Long>{

	Session save(Session booking);

	Session saveAll(Session session);

	void delete(Session session);

}
