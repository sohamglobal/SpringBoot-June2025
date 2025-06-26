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
		accRepo.save(obj);
		return "success";
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

}
