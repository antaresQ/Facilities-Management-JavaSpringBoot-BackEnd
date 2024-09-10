package com.facilitiesManagement.core.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Document(collection = "Rooms")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Room {
	
	@Id
	private ObjectId id;
	
	private String name;
	
	private RoomType roomType;
	
	private String imageUrl;
	
	private String videoUrl;

	private Integer teacherDesks;
	
	private Integer teacherChairs;
	
	private Integer tabletChairs;
	
	private Integer stackedTabletChairs;
	
	private Integer desks;
	
	private Integer chairs;
	
	private Integer stackedChairs;
}
