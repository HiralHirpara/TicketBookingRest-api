package com.hiral.ticketbookingrest.service.jpa;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hiral.ticketbookingrest.constant.Status;
import com.hiral.ticketbookingrest.model.Seat;
import com.hiral.ticketbookingrest.model.Session;
import com.hiral.ticketbookingrest.model.SessionSeat;
import com.hiral.ticketbookingrest.repository.SessionRepository;
import com.hiral.ticketbookingrest.repository.SessionSeatRepository;
import com.hiral.ticketbookingrest.service.SessionService;

@Service
public class SessionServiceImpl implements SessionService{

	@Autowired
	private SessionRepository sessionRepository;
	
	@Autowired
	private SessionSeatRepository sessionSeatRepository;
	
	@Override
	public List<Session> fetchSessionList() {
		
		return  sessionRepository.findAll();
	}

	@Override
	public Session fetchSession(Long id) {
		Optional<Session> session = sessionRepository.findById(id);
		
		if (session.isPresent()) {
			return session.get();
		}
		
		return null;
	}

	@Override
	public Session addSession(Session session) {
		Session sessionAdded = sessionRepository.saveAll(session);
		
		if (sessionAdded != null) {
			_createSessionSeats(sessionAdded);
		}
		
		return sessionAdded;
	}

	private List<SessionSeat> _createSessionSeats(Session sessionAdded) {
		List<Seat> seats = sessionAdded.getCinemaRoom().getSeats();
		List<SessionSeat> sessionSeatsList = new ArrayList<>();
		
		for(Seat seat : seats) {
			SessionSeat sessionSeat = new SessionSeat();
			sessionSeat.setSeat(seat);
			sessionSeat.setSeasion(sessionAdded);
			sessionSeat.setStatus(Status.AVAILABLE);
			
			sessionSeatsList.add(sessionSeat);
		}
		
		if(sessionSeatsList.size()> 0) {
			return sessionSeatRepository.saveAll(sessionSeatsList);
		}
		
		return null;
		
	}

	@Override
	public Session updateSession(Long id, Session booking) {
		
		if (booking.getId() != id) {
			return null;
		}
		
		Optional<SessionSeat> oldSession = sessionRepository.findById(id);
		
		if (oldSession.isPresent()) {
			return sessionRepository.save(booking);
		}
		
		return null;
	}

	@Override
	public void deleteSession(Session session) {
		sessionRepository.deleteById(session.getId());
		
	}

	@Override
	public List<SessionSeat> getAvailableSessionSeats(Session session) {
		List<SessionSeat> seats = session.getSessionSeats();
		
	    return seats.stream()
	    	    .filter(s -> s.getStatus()
	    	    		.equalsIgnoreCase(Status.AVAILABLE))
	    	    		.collect(Collectors.toList());
	}

	@Override
	public List<SessionSeat> updateSessionSeats(List<SessionSeat> sessionSeats) {
		return sessionSeatRepository.saveAll(sessionSeats);
	}

}
