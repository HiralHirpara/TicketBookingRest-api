package com.hiral.ticketbookingrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hiral.ticketbookingrest.exception.NoSeatsAvailableException;
import com.hiral.ticketbookingrest.exception.NumberOfSeatsNotAvailableException;
import com.hiral.ticketbookingrest.model.Booking;
import com.hiral.ticketbookingrest.model.dto.BookingDTO;
import com.hiral.ticketbookingrest.service.BookingService;

@RestController
@RequestMapping("/booking")
public class BookingController {
	
	@Autowired
	private BookingService bookingService;
	
	@PostMapping()
	public Booking addBooking(@RequestBody BookingDTO bookingDTO) throws NoSeatsAvailableException, NumberOfSeatsNotAvailableException {
		return bookingService.addBooking(bookingDTO);
	}

}
