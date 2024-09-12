package com.facilitiesManagement.adaptors.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/objectid/{id}")
	@Operation(summary="Get Individual Room", description="Returns Details of Individual Room")
	public ResponseEntity<Optional<Room>> getSingleRoom(@PathVariable ObjectId id){
		
		return new ResponseEntity<Optional<Room>>(roomService.singleRoom(id), HttpStatus.OK);
	}
	
	@GetMapping("/{roomId}")
	@Operation(summary="Get Individual Room by RoomId", description="Returns Details of Individual Room")
	public ResponseEntity<Optional<Room>> getSingleRoomByRoomId(@PathVariable Integer roomId){
		
		return new ResponseEntity<Optional<Room>>(roomService.singleRoom(roomId), HttpStatus.OK);
	}
}
