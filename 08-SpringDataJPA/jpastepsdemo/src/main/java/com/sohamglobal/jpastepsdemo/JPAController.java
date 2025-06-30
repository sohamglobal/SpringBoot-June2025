package com.sohamglobal.jpastepsdemo;

import java.util.List;

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
		m.addAttribute("msg", "New account creation...");
		m.addAttribute("status",status);
		return "ActivityStatus.jsp";
	}
	
	@GetMapping("/close")
	public String close()
	{
		return "CloseAccountForm.html";
	}
	
	@PostMapping("/closeacc")
	public String closeAcc(int accno,Model m)
	{
		String status;
		status=accServ.deleteAccount(accno);
		m.addAttribute("msg", "Account closing...");
		m.addAttribute("status", status);
		return "ActivityStatus.jsp";
	}
	
	@GetMapping("/deposit")
	public String deposit()
	{
		return "DepositForm.html";
	}
	
	@PostMapping("/depoamt")
	public String depositAmount(int accno,float amount,Model m)
	{
		String stat=accServ.depoAmount(accno, amount);
		m.addAttribute("status", stat);
		m.addAttribute("msg", "Deposit amount...");
		return "ActivityStatus.jsp";
	}
	
	@GetMapping("/search")
	public String search()
	{
		return "Search.html";
	}
	
	@PostMapping("/searchno")
	public String searchNumber(int accno,Model m)
	{
		Account obj=accServ.searchOnNumber(accno);
		m.addAttribute("data", obj);
		return "SearchNumberResult.jsp";
	}
	
	@GetMapping("/report")
	public String showAccountReport(Model m)
	{
		List<Account> list=accServ.getAllAccounts();
		m.addAttribute("acclist", list);
		return "AccountsReport.jsp";
	}

}
