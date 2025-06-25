package com.sohamglobal.jpastepsdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sohamglobal.jpastepsdemo.entities.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
	

}
