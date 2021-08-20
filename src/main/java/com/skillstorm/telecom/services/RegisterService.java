package com.skillstorm.telecom.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.telecom.data.UserRepository;
import com.skillstorm.telecom.models.Users;

@Service
public class RegisterService {
	
	@Autowired
	private UserRepository repository;
	
	public RegisterService() {
		
	}
	
	public Users save(Users user) {
		user.setLines(0L);
		user.setBalance(0L);
		System.out.println(user.toString());		
		
		return repository.save(user);
	}
	
	public String generateNumber() {
		
		return null;
	}
	
	public List<Users> findAll()
	{
		return repository.findAll();
	}

}
