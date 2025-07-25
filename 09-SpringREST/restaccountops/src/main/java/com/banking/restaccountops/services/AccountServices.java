package com.banking.restaccountops.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.restaccountops.entities.Account;
import com.banking.restaccountops.repositories.AccountRepo;

@Service
public class AccountServices {
	
	@Autowired
	private AccountRepo accRepo;
	
	public List<Account> getAllAccounts()
	{
		return accRepo.findAll();
	}
	
	public Account getAccountOnNumber(int accno)
	{
		return accRepo.findByAccno(accno);
	}
	
	public String deleteAccount(int accno)
	{
		String status="";
		Account obj=accRepo.findByAccno(accno);
		if(obj!=null)
		{
			accRepo.delete(obj);
			status="success";
		}
		else
		{
			status="failed";
		}
		return status;
	}
	
	public String depositAmt(int accno,float amount)
	{
		String status="";
		Account obj=accRepo.findByAccno(accno);
		if(obj!=null)
		{
			obj.setBalance(obj.getBalance()+amount);
			accRepo.save(obj);
			status="success";
		}
		else
		{
			status="failed";
		}
		return status;
	}
	
	public String transfer(int fromacc,int toacc,float amount)
	{
		Account obj1=accRepo.findByAccno(fromacc);
		Account obj2=accRepo.findByAccno(toacc);
		String status="";
		
		if(obj1!=null && obj2!=null)
		{
			obj1.setBalance(obj1.getBalance()-amount);
			obj2.setBalance(obj2.getBalance()+amount);
			accRepo.save(obj1);
			accRepo.save(obj2);
			status="success";
		}
		else
			status="failed";
		
		return status;
	}

}
