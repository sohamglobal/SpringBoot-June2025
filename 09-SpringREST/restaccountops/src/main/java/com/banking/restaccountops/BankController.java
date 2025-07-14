package com.banking.restaccountops;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banking.restaccountops.entities.Account;
import com.banking.restaccountops.services.AccountServices;

@RestController
@RequestMapping("/bank/api")
public class BankController {
	
	@Autowired
	private AccountServices accServices;
	
	@GetMapping("/test")
	public String getMessage()
	{
		return "rest banking app";
	}
	
	@GetMapping("/allaccounts")
	public List<Account> getAccounts()
	{
		return accServices.getAllAccounts();
	}
	
	@GetMapping("/search/number/{accno}")
	public Account getAccountInfo(@PathVariable int accno)
	{
		return accServices.getAccountOnNumber(accno);
	}
	
	@DeleteMapping("/acc/delete")
	public String closeAccount(int accno)
	{
		return accServices.deleteAccount(accno);
	}
	
	@PutMapping("/acc/deposit")
	public String deposit(int accno,float amount)
	{
		return accServices.depositAmt(accno, amount);
	}

}
