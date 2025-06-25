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

}
