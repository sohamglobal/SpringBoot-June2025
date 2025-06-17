package com.sharayu.requestdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sharayu.requestdemo.entities.User;

@Controller
public class SharayuController {
	
	@GetMapping("/")
	public String index()
	{
		return "index.html";
	}
	
	@PostMapping("/login")
	public String login(String email,String password)
	{
		String page="";
		
		if(password.equals("liverpool"))
			page="UserHome.jsp";
		else
			page="Failure.jsp";
		
		return page;
	}
	
	@GetMapping("/register")
	public String registerForm()
	{
		return "UserRegister.html";
	}
	
	@PostMapping("/adduser")
	public String registerStatus(User obj,Model m)
	{
		System.out.println(obj.getName());
		System.out.println(obj.getEmail());
		m.addAttribute("obj",obj);
		return "RegisterStatus.jsp";
	}

}
