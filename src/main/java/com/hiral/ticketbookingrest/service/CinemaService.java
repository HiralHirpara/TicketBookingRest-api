package com.hiral.ticketbookingrest.service;

import java.util.List;

import com.hiral.ticketbookingrest.model.Cinema;
import com.hiral.ticketbookingrest.model.CinemaRoom;

public interface CinemaService {
	
	Cinema addCinema(Cinema cinema);
	
	CinemaRoom addCinemaRoom(CinemaRoom cinemaRoom);
	

}
