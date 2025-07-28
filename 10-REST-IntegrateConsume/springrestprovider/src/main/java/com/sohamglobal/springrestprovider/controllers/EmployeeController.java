package com.sohamglobal.springrestprovider.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sohamglobal.springrestprovider.models.Employee;
import com.sohamglobal.springrestprovider.services.EmployeeServices;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeServices empServices;
	
	@GetMapping("/allemps")
	public List<Employee> allEmps()
	{
		return empServices.getAllEmployees();
	}

}
