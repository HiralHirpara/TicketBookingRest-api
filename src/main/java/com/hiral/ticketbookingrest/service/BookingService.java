package com.hiral.ticketbookingrest.service;

import java.util.List;

import com.hiral.ticketbookingrest.model.Booking;
import com.hiral.ticketbookingrest.model.dto.BookingDTO;

public interface BookingService {
	
	List<Booking> fetchBookingList();
	
	Booking fetchBooking(Long id);
	
	Booking addBooking(BookingDTO bookingDTO);
	
	Booking updateBooking(Long id, Booking booking);
	
	void deleteBookings(Long id);
	
	List<Booking> findUserBooking(Long userId);

}
