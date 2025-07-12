package com.autoshowroom.carsbackend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.autoshowroom.carsbackend.entities.Car;
import com.autoshowroom.carsbackend.services.CarServices;

@RestController
@RequestMapping("/auto/api")
public class AutoController {
	
	@Autowired
	private CarServices carServices;
	
	@GetMapping("/cars")
	public List<Car> getCars()
	{
		return carServices.getAllCars();
	}
	
	@GetMapping("/search/{company}")
	public List<Car> getCarsByCompany(@PathVariable String company)
	{
		return carServices.searchCars(company);
	}

	@PostMapping("/add")
	public Car addCar(@RequestBody Car obj)
	{
		return carServices.addNewCar(obj);
	}
	
	
}
