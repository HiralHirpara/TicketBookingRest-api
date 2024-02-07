package com.hiral.ticketbookingrest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "session_seat")
public class SessionSeat {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@OneToOne
	@JoinColumn(name= "session_id")
	private Session session;
	
	private String status;
	
	private float price;
	
	@OneToOne
	@JoinColumn(name= "seat_id")
	private Seat seat;
	
	@OneToOne
	@JoinColumn(name= "booking_id")
	private Booking booking;
	


	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Session getSeasion() {
		return session;
	}

	public void setSeasion(Session seasion) {
		this.session = session;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}
}
