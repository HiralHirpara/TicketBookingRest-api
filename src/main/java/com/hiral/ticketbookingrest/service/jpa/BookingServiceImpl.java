package com.hiral.ticketbookingrest.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hiral.ticketbookingrest.model.Booking;
import com.hiral.ticketbookingrest.model.dto.BookingDTO;
import com.hiral.ticketbookingrest.repository.BookingRepository;
import com.hiral.ticketbookingrest.service.BookingService;

@Service
public class BookingServiceImpl implements BookingService{

	@Autowired
	private BookingRepository bookingRepository;
	
	
	@Override
	public List<Booking> fetchBookingList() {
		
		return bookingRepository.findAll();
	}

	@Override
	public Booking fetchBooking(Long id) {
		Optional<Booking> booking = bookingRepository.findById(id);
		
		if(booking.isPresent()) {
			return booking.get();
		}
		return null;
	}

	@Override
	public Booking addBooking(BookingDTO bookingDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Booking updateBooking(Long id, Booking booking) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteBookings(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Booking> findUserBooking(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
