package com.facilitiesManagement.infra.data;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.facilitiesManagement.core.domain.Booking;

@Repository	
public interface BookingRepository extends  MongoRepository<Booking, ObjectId> {

}
