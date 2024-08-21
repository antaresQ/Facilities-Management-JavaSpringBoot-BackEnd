package com.facilitiesManagement.core.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Document(collection = "rooms")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassRoom extends Room {

	public Integer teacherDesk;
	
	public Integer desks;
}
