package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
public class Demo16767Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo16767Application.class, args);
	}
	 @CrossOrigin(origins = {"http://localhost:4200/"})
	@GetMapping("/hello")
    public String hello() {
		 return "{\"message\": \"Hello, World!\"}";
    }

}
