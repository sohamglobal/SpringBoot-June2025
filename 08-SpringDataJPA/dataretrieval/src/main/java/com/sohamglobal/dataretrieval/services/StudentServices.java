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
	
	public List<Student> searchOnCourse(String course)
	{
		List<Student> list=studRepo.findByCourse(course);
		return list;
	}
	
	public List<Student> searchOnRollnoRange(int min,int max)
	{
		List<Student> list=studRepo.findStudentsInRollnoRange(min,max);
		return list;
	}

}
