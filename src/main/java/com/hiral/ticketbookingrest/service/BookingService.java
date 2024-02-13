package com.hiral.ticketbookingrest.service;

import java.util.List;

import com.hiral.ticketbookingrest.model.Booking;

public interface BookingService {
	
	List<Booking> fetchBookingList();
	
	Booking fetchBooking(Long id);
	
	Booking addBooking(Booking booking);
	
	Booking updateBooking(Long id, Booking booking);
	
	void deleteBookings(Long id);
	
	List<Booking> findUserBooking(Long userId);

}
