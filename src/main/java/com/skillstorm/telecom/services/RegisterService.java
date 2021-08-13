package com.skillstorm.telecom.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.telecom.data.UserRepository;
import com.skillstorm.telecom.models.User;

@Service
public class RegisterService {
	
	@Autowired
	private UserRepository repository;
	
	public RegisterService() {
		System.out.println("Searching database");
	}
	
	public User save(User user) {		
		return repository.save(user);
	}
	
	public List<User> findAll()
	{
		return repository.findAll();
	}

}
