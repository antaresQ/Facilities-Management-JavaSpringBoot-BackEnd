package com.facilitiesManagement.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FacilitiesManagementApplication {
	
	@Autowired
    private Environment env;

	public static void main(String[] args) {
		SpringApplication.run(FacilitiesManagementApplication.class, args);
	}
	
	@GetMapping("/test")
	public String testPage() {

		System.out.println(env.getProperty("Facilities_Management_MongoDB_Uri"));
		
		return "test page";
	}
}