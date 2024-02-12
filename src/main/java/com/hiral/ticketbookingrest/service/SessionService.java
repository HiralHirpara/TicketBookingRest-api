package com.hiral.ticketbookingrest.service;

import java.util.List;

import com.hiral.ticketbookingrest.model.Session;
import com.hiral.ticketbookingrest.model.SessionSeat;

public interface SessionService {
	
	List<Session> fetchSessionList();
	
	Session fetchSession(Long id);
	
	Session addSession(Session session);
	
	Session updateSession(Long id, Session session);
	
	void deleteSession(Session session);
	
	List<SessionSeat> getAvailableSessionSeats(Session session);
	
	List<SessionSeat> updateSessionSeats(List<SessionSeat> sessionSeats);
	
	

}
