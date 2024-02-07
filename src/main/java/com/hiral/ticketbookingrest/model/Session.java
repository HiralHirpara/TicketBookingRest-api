package com.hiral.ticketbookingrest.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
	
	@Column(name="start_time")
	private Date startTime;
	
	@Column(name="end_time")
	private Date endTime;
	
	@OneToOne
	@JoinColumn(name = "cinema_room_id")
	private CinemaRoom cinemaRoom;
	
	@OneToOne
	@JoinColumn(name = "movie_id")
	private Movie movie;
	
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


	public CinemaRoom getCinemaRoom() {
		return cinemaRoom;
	}

	public void setCinemaRoom(CinemaRoom cinemaRoom) {
		this.cinemaRoom = cinemaRoom;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
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
