package com.hiral.ticketbookingrest.model.dto;

import com.hiral.ticketbookingrest.model.CinemaRoom;
import com.hiral.ticketbookingrest.model.Movie;
import com.hiral.ticketbookingrest.model.Session;
import com.hiral.ticketbookingrest.model.User;

public class BookingDTO {
	
	private User user;
	
	private Movie movie;
	
	private CinemaRoom cinemaRoom;
	
	private int numberOfSeats;
	
	private Session session;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public CinemaRoom getCinemaRoom() {
		return cinemaRoom;
	}

	public void setCinemaRoom(CinemaRoom cinemaRoom) {
		this.cinemaRoom = cinemaRoom;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}
	
	
	

}
