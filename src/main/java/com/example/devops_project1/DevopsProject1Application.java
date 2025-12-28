package com.example.devops_project1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DevopsProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(DevopsProject1Application.class, args);
	}
	
	@GetMapping("/")
	public String home() {
		return "<h1>Welcome TCS DevOps Architect</h1>";
	}
	
	@GetMapping("/")
	public String about() {
		return "<h1>I'm learning evOps Architect</h1>";
	}

}
