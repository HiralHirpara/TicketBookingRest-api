package com.hiral.ticketbookingrest.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name ="booking")
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private int numberOfSeats;
	
	private String status;
	
	@OneToOne
	private User userId;
	
	@OneToOne
	private Session sessionId;
	
	@OneToOne
	private Payment paymentId;
	
	@OneToMany(mappedBy = "booking")
	private List<SessionSeat> sessionSeats;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public Session getSessionId() {
		return sessionId;
	}

	public void setSessionId(Session sessionId) {
		this.sessionId = sessionId;
	}

	public Payment getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Payment paymentId) {
		this.paymentId = paymentId;
	}

	public List<SessionSeat> getSessionSeats() {
		return sessionSeats;
	}

	public void setSessionSeats(List<SessionSeat> sessionSeats) {
		this.sessionSeats = sessionSeats;
	}
	
	
	

}
