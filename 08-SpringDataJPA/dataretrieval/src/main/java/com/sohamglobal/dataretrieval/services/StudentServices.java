package com.sohamglobal.dataretrieval.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sohamglobal.dataretrieval.entities.Student;
import com.sohamglobal.dataretrieval.repos.StudentRepository;

@Service
public class StudentServices {
	
	@Autowired
	private StudentRepository studRepo;
	
	public List<Student> getAllStudents()
	{
		List<Student> list=studRepo.findAll();
		return list;
	}

}
