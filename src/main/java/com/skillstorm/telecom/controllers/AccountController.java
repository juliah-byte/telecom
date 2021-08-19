package com.skillstorm.telecom.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.telecom.models.Users;
import com.skillstorm.telecom.services.AccountService;

@RestController
@RequestMapping("account")
@CrossOrigin(origins = "http://localhost:4200")
public class AccountController {
	
	@Autowired
	AccountService service;
	
	public AccountController() {
		
	}
	
	@GetMapping
	public ResponseEntity<Users> getBalance() {
		System.out.println("Get Balance Controller reached");
		
		return null;
	}

}
