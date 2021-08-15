package com.skillstorm.telecom.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.telecom.data.UserRepository;
import com.skillstorm.telecom.models.Users;
import com.skillstorm.telecom.services.LoginService;

@RestController
@RequestMapping("login")
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {

	@Autowired
	private LoginService service;

	public LoginController() {

	}

	@GetMapping
	public ResponseEntity<List<Users>> validate() {
		System.out.println("Controller reached");
		
		return null;
	}

}
