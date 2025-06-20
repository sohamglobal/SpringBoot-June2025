package com.sohamglobal.injectiondemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InjectiondemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(InjectiondemoApplication.class, args);
		System.out.println("running...");
	}

}
