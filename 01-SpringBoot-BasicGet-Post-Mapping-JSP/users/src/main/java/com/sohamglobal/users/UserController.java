package com.sohamglobal.users;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
	// for root url -> http://localhost:8080 
	@GetMapping("/")
	public String homePage()
	{
		return "index.html";
	}
	
	@GetMapping("/register")
	public String userRegistration()
	{
		return "UserRegistration.html";
	}
	
	@GetMapping("/userlist")
	public String showUserList()
	{
		return "UserReport.jsp";
	}
	
	
	
	@PostMapping("/login")
	public String loginUser(String uid,String psw)
	{
		System.out.println("UserID : "+uid);
		System.out.println("Password : "+psw);
		
		return "UserHome.jsp";
	}

}
