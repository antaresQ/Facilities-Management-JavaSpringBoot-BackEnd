package com.facilitiesManagement.core.usecases;


import com.facilitiesManagement.core.domain.Room;
import com.facilitiesManagement.infra.data.RoomRepository;
import org.springframework.stereotype.Service;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;


@Service
public class RoomService {

	@Autowired
	private RoomRepository roomRepository;
	
	public List<Room> allRooms() {
		return roomRepository.findAll();
	}
	
	public Optional<Room> singleRoom(ObjectId id) {
		return roomRepository.findById(id);
	}
	
	public Optional<Room> singleRoom(Integer roomId){
		return roomRepository.findRoomByRoomId(roomId);
	}
}