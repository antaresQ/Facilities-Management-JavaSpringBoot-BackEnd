package com.facilitiesManagement.Adaptors.api;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.facilitiesManagement.core.domain.Room;
import com.facilitiesManagement.core.domain.RoomType;



@CrossOrigin(origins="*")
@RestController
@RequestMapping("/api/v1/rooms")
public class RoomController {

	@GetMapping
	public ResponseEntity<List<Room>> allRooms() {
		
		List<Room> rooms = new ArrayList<Room>();


		Room r1 = new Room(new ObjectId(), "Room 1", RoomType.Classroom, 1, 1, 24, 0, 0, 0, 0);
		rooms.add(r1);
		
		Room r2 = new Room(new ObjectId(), "Room 2", RoomType.Classroom, 1, 1, 0, 0, 9, 18, 0);
		rooms.add(r2);
		
		Room r3 = new Room(new ObjectId(), "Room 3", RoomType.Classroom, 0, 1, 10, 0, 1, 0, 1);
		rooms.add(r3);
		
		Room r4 = new Room(new ObjectId(), "Pantry", RoomType.Pantry, 0, 0, 0, 0, 2, 0, 0);
		rooms.add(r4);

		Room r5 = new Room(new ObjectId(), "Pantry", RoomType.Washroom, 0, 0, 0, 0, 0, 0, 0);
		rooms.add(r5);
		
		
		return new ResponseEntity<List<Room>>(rooms, HttpStatus.OK);
	}
}
