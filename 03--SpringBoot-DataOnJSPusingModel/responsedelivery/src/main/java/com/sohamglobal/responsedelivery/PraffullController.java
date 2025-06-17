package com.sohamglobal.responsedelivery;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PraffullController {
	
	@GetMapping("/")
	public String home()
	{
		return "index.html";
	}
	
	@GetMapping("/showdata")
	public String show(Model m)
	{
		String nm="sharayu";
		String ct="dubai";
		
		Product p=new Product("galaxy F55","samsung",19000);
		
		m.addAttribute("usernm", nm);
		m.addAttribute("city", ct);
		m.addAttribute("pro",p);
		return "ShowJavaData.jsp";
	}
	

}
