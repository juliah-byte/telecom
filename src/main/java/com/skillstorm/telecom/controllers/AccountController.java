package com.skillstorm.telecom.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.telecom.models.Users;
import com.skillstorm.telecom.services.AccountService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AccountController {
	
	@Autowired
	AccountService service;
	
	

	public AccountController() {

	}
	
		// User
	@GetMapping("/user/username/{username}")
	public ResponseEntity<Long> setIdbyUsername(@PathVariable String username) {
		return new ResponseEntity<Long>(service.getIdByUser(username), HttpStatus.OK);
	}
		
	
	
	@RequestMapping(value="/account", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Integer> getBalance(@RequestBody String username) {
		System.out.println("Get Balance Controller reached, balance is " + service.getBillByUser(username));		
		
		return new ResponseEntity<Integer>(service.getBillByUser(username), HttpStatus.OK);
	} 

}
