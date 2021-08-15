package com.skillstorm.telecom.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.telecom.data.UserRepository;
import com.skillstorm.telecom.models.Users;
import com.skillstorm.telecom.services.RegisterService;

@RestController
@RequestMapping("register")
@CrossOrigin(origins = "http://localhost:4200")
public class RegisterController {
	
	@Autowired
	UserRepository repository;
	
	@Autowired
	private RegisterService service;
	
	public RegisterController() {
		
	}
	
	@PostMapping
	public ResponseEntity<Users> save(@RequestBody Users user) {
		System.out.println("Registering user");
		
		List<Users> users = repository.findAll();
		
		for(Users u : users)
		{
			if(u.getUsername().equals(user.getUsername()))
			{
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			}
		}
		
		return new ResponseEntity<>(service.save(user), HttpStatus.CREATED);		
	}
	

}
