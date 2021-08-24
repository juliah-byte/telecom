package com.skillstorm.telecom.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.telecom.data.UserRepository;
import com.skillstorm.telecom.models.Users;

@Service
public class AccountService {
	
	@Autowired
	private UserRepository repository;
	
	public Integer getBillByUser(String username) {
		System.out.println("Account Service Balance" + repository.getBalanceByUser(username));
		return repository.getBalanceByUser(username);
	}

	
	public Long getIdByUser(String username) {
		return repository.getIdByUser(username);
	}
}
