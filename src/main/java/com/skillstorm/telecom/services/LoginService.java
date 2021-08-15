package com.skillstorm.telecom.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.telecom.data.UserRepository;
import com.skillstorm.telecom.models.Users;

@Service
public class LoginService {

	@Autowired
	private UserRepository repository;
	
	public List<Users> findAll()
	{
		return repository.findAll();
	}

}
