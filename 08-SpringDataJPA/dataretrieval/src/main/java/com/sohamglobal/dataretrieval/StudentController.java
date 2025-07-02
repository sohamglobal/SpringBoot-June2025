package com.sohamglobal.dataretrieval;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sohamglobal.dataretrieval.entities.Student;
import com.sohamglobal.dataretrieval.services.StudentServices;

@Controller
public class StudentController {
	
	@Autowired
	private StudentServices studServ;
	
	@GetMapping("/")
	public String home()
	{
		return "index.html";
	}
	
	@GetMapping("/all")
	public String showStudents(Model m)
	{
		List<Student> list=studServ.getAllStudents();
		//list.stream().forEach(obj->System.out.println(obj.getStudnm()));
		m.addAttribute("stlist", list);
		return "AllStudents.jsp";
	}
	
	@PostMapping("/search")
	public String search(String course,Model m)
	{
		List<Student> list=studServ.searchOnCourse(course);
		m.addAttribute("stlist", list);
		//return "SearchResult.jsp";
		return "AllStudents.jsp";
	}
	
	@PostMapping("/searchrange")
	public String searchRange(int min,int max,Model m)
	{
		List<Student> list=studServ.searchOnRollnoRange(min, max);
		m.addAttribute("stlist", list);
		return "AllStudents.jsp";
	}

}
