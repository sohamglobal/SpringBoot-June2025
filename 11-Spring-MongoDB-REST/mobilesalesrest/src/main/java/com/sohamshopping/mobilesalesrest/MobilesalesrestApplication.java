package com.sohamshopping.mobilesalesrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MobilesalesrestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobilesalesrestApplication.class, args);
		System.out.println("SPring REST with MongoDB on AWS running...");
	}

}
