package com.facilitiesManagement.core.domain;

import java.time.LocalDateTime;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "Bookings")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Booking {
	
	@Id
	private ObjectId id;
	
	private String eventName;
	
	private String description;
	
	private ObjectId speakerId;
	
	private String speakerName;
	
	private LocalDateTime startDate;
	
	private LocalDateTime endDate;
	
	private List<Integer> roomIds;

	private ObjectId userId;
	
	private LocalDateTime dateCreated;
	
	private LocalDateTime dateModified;
	
}
