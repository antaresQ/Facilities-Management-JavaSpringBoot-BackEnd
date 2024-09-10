package com.facilitiesManagement.core.usecases;


import com.facilitiesManagement.core.domain.Room;
import com.facilitiesManagement.infra.data.RoomRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;


@Service
public class RoomService {

	@Autowired
	private RoomRepository roomRepository;
	
	public List<Room> allRooms() {
		return roomRepository.findAll();
	}
}