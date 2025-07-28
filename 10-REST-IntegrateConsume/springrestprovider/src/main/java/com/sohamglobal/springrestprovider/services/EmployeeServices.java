package com.sohamglobal.springrestprovider.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sohamglobal.springrestprovider.models.Employee;

@Service
public class EmployeeServices {
	
	public List<Employee> getAllEmployees()
	{
		List<Employee> list=new ArrayList<>();
		Employee e1=new Employee(101,"Lewis Hamilton","Marketing","London",35600.00);
		Employee e2=new Employee(102,"Fernando Alonso","Finance","Paris",28900.00);
		Employee e3=new Employee(103,"Max Verstappen","Sales","Berlin",31500.00);
		Employee e4=new Employee(104,"Charles Leclerc","Admin","Monaco",28400.00);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		return list;
		
	}

}
