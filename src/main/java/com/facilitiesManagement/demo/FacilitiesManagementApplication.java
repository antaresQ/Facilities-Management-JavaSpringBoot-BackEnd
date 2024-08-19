package com.facilitiesManagement.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
	
	@Value("${spring.data.mongodb.uri}")
	private String mongoDbUri;

	public static void main(String[] args) {
		SpringApplication.run(FacilitiesManagementApplication.class, args);
	}
	
	@GetMapping("/test")
	public String testPage() {

		System.out.println(mongoDbUri);
		System.out.println(env.getProperty("MONGO_DATABASE"));
		
		return "test page";
	}
}