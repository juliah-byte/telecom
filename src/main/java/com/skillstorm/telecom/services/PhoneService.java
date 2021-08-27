package com.skillstorm.telecom.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.telecom.data.PhoneRepository;
import com.skillstorm.telecom.models.Phone;

@Service
public class PhoneService {
	
	@Autowired
	PhoneRepository pRepo;
	

	public Phone getPhoneNumberByUser( Long userid) {
		return pRepo.getPhoneByUserplan(userid);
	}

}
