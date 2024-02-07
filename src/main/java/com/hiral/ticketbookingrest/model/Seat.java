package com.hiral.ticketbookingrest.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "seat")
public class Seat {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column(name="seat_number")
	private int seatNumber;
	
	@OneToOne
	@JoinColumn(name="cinema_room_id")
	private CinemaRoom cinemaRoom;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public CinemaRoom getCinemaRoom() {
		return cinemaRoom;
	}

	public void setCinemaRoom(CinemaRoom cinemaRoomId) {
		this.cinemaRoom = cinemaRoom;
	}
	
	

}
