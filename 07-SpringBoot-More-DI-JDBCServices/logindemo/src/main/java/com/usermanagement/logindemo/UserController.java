package com.usermanagement.logindemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.usermanagement.logindemo.services.UserServices;

@Controller
public class UserController {
	
	@Autowired
	private UserServices userv;
	
	@GetMapping("/login")
	public String homePage()
	{
		return "index.jsp";
	}
	
	@PostMapping("/authenticate")
	public String auth(String username,String password)
	{
		String page="";
		page=userv.checkUser(username, password);
		return page;
	}
	

}
