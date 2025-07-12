package com.autoshowroom.carsbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarsbackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarsbackendApplication.class, args);
		System.out.println("auto rest backend running...");
	}

}
