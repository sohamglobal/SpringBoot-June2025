package com.banking.restaccountops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestaccountopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaccountopsApplication.class, args);
		System.out.println("REST back end app for account operations (MySQL-JPA)");
	}

}
