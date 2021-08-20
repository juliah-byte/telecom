package com.skillstorm.telecom.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.telecom.data.UserRepository;
import com.skillstorm.telecom.models.Users;
import com.skillstorm.telecom.services.LoginService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {

	@Autowired
	private LoginService service;

	public LoginController() {

	}

	@RequestMapping(value="/login", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Users>> validate() {
		System.out.println("Login Controller reached");
		
		
		return new ResponseEntity<List<Users>>(service.findAll(), HttpStatus.OK);
	}

}
