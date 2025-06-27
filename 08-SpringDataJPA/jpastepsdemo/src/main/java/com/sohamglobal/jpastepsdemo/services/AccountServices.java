package com.sohamglobal.jpastepsdemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sohamglobal.jpastepsdemo.entities.Account;
import com.sohamglobal.jpastepsdemo.repositories.AccountRepository;

@Service
public class AccountServices {
	
	@Autowired
	private AccountRepository accRepo;
	
	public String addNewAccount(Account obj)
	{
		String status;
		try
		{
		accRepo.save(obj);
		status="success";
		}
		catch(Exception e)
		{
			status="failed";
		}
		return status;
	}
	
	public String deleteAccount(int accno)
	{
		String status="";
		Account obj=accRepo.findByAccno(accno);
		if(obj!=null)
		{
		System.out.println(obj.getAccnm());
		System.out.println(obj.getBalance());
		accRepo.delete(obj);
		status="success";
		}
		else
		{
			System.out.println("not found");
			status="failed";
		}

		return status;
	}
	
	public String depoAmount(int no,float amt)
	{
		Account obj=accRepo.findByAccno(no);
		String status;
		
		if(obj!=null)
		{
			System.out.println(obj.getBalance());
			obj.setBalance(obj.getBalance()+amt);
			System.out.println(obj.getBalance());
			accRepo.save(obj);
			status="success";
		}
		else
		{
			status="failed";
		}
		return status;
	}

}
