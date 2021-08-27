package com.skillstorm.telecom.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.telecom.data.PhoneRepository;
import com.skillstorm.telecom.models.Phone;
import com.skillstorm.telecom.services.PhoneService;

@RestController
public class PhoneController {
	
	@Autowired
	private PhoneRepository repository;
	
	@Autowired
	private PhoneService service;
	// Phone

	@GetMapping("/phone/username/{username}/password/{password}")
	public ResponseEntity<Object> getPhones(@PathVariable String username, @PathVariable String password) {
		//Log.debug("getPhones method initialized");
		// System.out.println(repository2.getPhones(username,password));
		return new ResponseEntity<>(repository.getPhonesByCredentials(username, password), HttpStatus.OK);
	}

	@DeleteMapping("/phone/number/{number}")
	public ResponseEntity<Long> deletePhoneByPhoneNumber(@PathVariable String number) {
		//Log.debug("deleteByPhone Number intialized");
		return new ResponseEntity<Long>(repository.deletePhoneByNumber(number), HttpStatus.NO_CONTENT);
	}

	
	@GetMapping("/phone/user/{userid}")
	public ResponseEntity<Phone> getPhoneNumberByUserID(@PathVariable Long userid){
		
		return new ResponseEntity<Phone>(service.getPhoneNumberByUser(userid), HttpStatus.OK);
	}

}
