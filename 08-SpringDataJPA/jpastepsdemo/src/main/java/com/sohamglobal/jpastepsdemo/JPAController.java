package com.sohamglobal.jpastepsdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sohamglobal.jpastepsdemo.entities.Account;
import com.sohamglobal.jpastepsdemo.services.AccountServices;

@Controller
public class JPAController {
	
	@Autowired
	private AccountServices accServ;
	
	@GetMapping("/")
	public String homePage()
	{
		return "index.jsp";
	}
	
	@PostMapping("/addacc")
	public String addAccount(Account obj,Model m)
	{
		String status=accServ.addNewAccount(obj);
		m.addAttribute("status",status);
		return "ActivityStatus.jsp";
	}

}
