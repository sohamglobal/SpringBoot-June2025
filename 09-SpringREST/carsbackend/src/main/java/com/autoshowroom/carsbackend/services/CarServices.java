package com.autoshowroom.carsbackend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.autoshowroom.carsbackend.entities.Car;
import com.autoshowroom.carsbackend.repositories.CarRepository;

@Service
public class CarServices {
	
	@Autowired
	private CarRepository carRepo;
	
	public List<Car> getAllCars()
	{
		return carRepo.findAll();
	}
	
	public List<Car> searchCars(String company)
	{
		return carRepo.findByCompany(company);
	}
	
	public Car addNewCar(Car car)
	{
		return carRepo.save(car);
	}

}
