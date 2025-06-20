package com.sohamglobal.injectiondemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sohamglobal.injectiondemo.services.CustomerServices;

@Controller
public class SohamController {
	
	@Autowired
	private CustomerServices custserv;
	
	@GetMapping("/")
	public String home()
	{
		return "index.jsp";
	}
	
	@PostMapping("/billing")
	public String calcBill(String customerName,float purchaseAmount,Model m)
	{
		float bill=custserv.calcuateCustomerBill(purchaseAmount);
		m.addAttribute("name", customerName);
		m.addAttribute("bill", bill);
		return "ShowBill.jsp";
	}

}
