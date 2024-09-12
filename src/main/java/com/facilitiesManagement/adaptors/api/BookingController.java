package com.facilitiesManagement.adaptors.api;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.facilitiesManagement.core.domain.Booking;
import com.facilitiesManagement.core.usecases.BookingService;

@RestController
@RequestMapping("/api/v1/booking")
public class BookingController {
	
	@Autowired
	private BookingService bookingService;
	
	@GetMapping("/allbookings")
	public ResponseEntity<List<Booking>> allBookings(){
		
		return new ResponseEntity<List<Booking>>(bookingService.allBookings(), HttpStatus.OK);
	}
	
	@PostMapping("/createBooking")
	public ResponseEntity<Booking> createBooking(@RequestBody Booking booking){
			
			booking.setDateCreated(LocalDateTime.now());
			booking.setDateModified(LocalDateTime.now());
		
			return new ResponseEntity<Booking>(bookingService.createBooking(booking), HttpStatus.CREATED);
	}

}
