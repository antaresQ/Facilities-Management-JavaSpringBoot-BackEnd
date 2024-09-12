package com.facilitiesManagement.core.usecases;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.facilitiesManagement.core.domain.Booking;
import com.facilitiesManagement.infra.data.BookingRepository;

@Service
public class BookingService {
	
	@Autowired
	private BookingRepository bookingRepository;
	
	//@Autowired
	//private MongoTemplate mongoTemplate;

	
	public List<Booking> allBookings() {
		return bookingRepository.findAll();
	}
	
	public Booking createBooking(Booking booking) {
		
		Booking savedBooking = bookingRepository.insert(booking);
		
		//mongoTemplate.update(Room.class)
		//	.matching(Criteria.where("roomId").is(roomId))
		//	.apply(new Update().push("bookingIds").value(booking))
		//	.first();
		
		return savedBooking;
	}
}
