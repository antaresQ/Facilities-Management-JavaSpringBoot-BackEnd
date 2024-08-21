package com.facilitiesManagement.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.facilitiesManagement.core.domain.ClassRoom;
import com.facilitiesManagement.core.domain.Room;




@RestController
@RequestMapping("/api/v1/rooms")
public class RoomController {

	@GetMapping
	public ResponseEntity<List<Room>> allRooms() {
		
		List<Room> rooms = new ArrayList<Room>();
		
		ClassRoom cl1 = new ClassRoom();
		cl1.name = "Room 1";
		cl1.desks = 24;
		cl1.teacherDesk = 1;
		
		rooms.add(cl1);
		
		ClassRoom cl2 = new ClassRoom();
		cl2.name = "Room 2";
		cl2.desks = 20;
		cl2.teacherDesk = 1;
		
		rooms.add(cl2);
		
		ClassRoom cl3 = new ClassRoom();
		cl2.name = "Room 3";
		cl2.desks = 12;
		cl2.teacherDesk = 1;
		
		rooms.add(cl3);
		
		return new ResponseEntity<List<Room>>(rooms, HttpStatus.OK);
	}
}
