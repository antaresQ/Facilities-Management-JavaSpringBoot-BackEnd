package com.facilitiesManagement.infra.Data;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.facilitiesManagement.core.domain.Room;



@Repository	
public interface RoomRepositotry extends MongoRepository<Room, ObjectId>{

}
