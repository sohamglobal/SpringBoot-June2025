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

}
