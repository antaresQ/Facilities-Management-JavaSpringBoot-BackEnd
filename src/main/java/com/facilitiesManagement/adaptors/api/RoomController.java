package com.facilitiesManagement.adaptors.api;

import java.util.ArrayList;
import java.util.List;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.facilitiesManagement.core.domain.Room;
import com.facilitiesManagement.core.usecases.RoomService;



@CrossOrigin(origins="*")
@RestController
@RequestMapping("/api/v1/room")
@Tag(name="Rooms API", description = "API for Rooms CRUD")
public class RoomController {
	
	@Autowired
	private RoomService roomService;

	@GetMapping("/allRooms")
	@Operation(summary="Get All Rooms", description="Returns list of All Rooms")
	public ResponseEntity<List<Room>> allRooms() {
		
		List<Room> rooms = roomService.allRooms();
		
		return new ResponseEntity<List<Room>>(rooms, HttpStatus.OK);
	}
}
