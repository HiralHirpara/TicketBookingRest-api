package com.hiral.ticketbookingrest.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "session")
public class Session {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Date date;
	
	private Date startTime;
	
	private Date endTime;
	
	@OneToOne
	private CinemaRoom cinemaRoomId;
	
	@OneToOne
	private Movie movieId;
	
	@OneToMany(mappedBy="session")
	private List<Booking> bookings;
	
	@OneToMany(mappedBy="session")
	private List<SessionSeat> sessionSeats;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public CinemaRoom getCinemaRoomId() {
		return cinemaRoomId;
	}

	public void setCinemaRoomId(CinemaRoom cinemaRoomId) {
		this.cinemaRoomId = cinemaRoomId;
	}

	public Movie getMovieId() {
		return movieId;
	}

	public void setMovieId(Movie movieId) {
		this.movieId = movieId;
	}

	public List<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}

	public List<SessionSeat> getSessionSeats() {
		return sessionSeats;
	}

	public void setSessionSeats(List<SessionSeat> sessionSeats) {
		this.sessionSeats = sessionSeats;
	}
	
	
	
}
