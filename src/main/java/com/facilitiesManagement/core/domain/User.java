package com.facilitiesManagement.core.domain;

import java.time.LocalDateTime;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "Users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	@Id
	private ObjectId id;
	
	private String name;
	
	private String emailAddress;

	private LocalDateTime birthDate;
	
	private UserType userType;
	
	private LocalDateTime dateCreated;
	
	private LocalDateTime dateModified;
}
