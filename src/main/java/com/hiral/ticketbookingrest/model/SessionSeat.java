package com.hiral.ticketbookingrest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "sessionSeat")
public class SessionSeat {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@OneToOne
	private Session seasionId;
	
	private String status;
	
	private float price;
	
	@OneToOne
	private Seat seatId;
	
	@OneToOne
	private Booking bookingId;
	


	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Session getSeasionId() {
		return seasionId;
	}

	public void setSeasionId(Session seasionId) {
		this.seasionId = seasionId;
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

	public Seat getSeatId() {
		return seatId;
	}

	public void setSeatId(Seat seatId) {
		this.seatId = seatId;
	}

	public Booking getBookingId() {
		return bookingId;
	}

	public void setBookingId(Booking bookingId) {
		this.bookingId = bookingId;
	}
}
