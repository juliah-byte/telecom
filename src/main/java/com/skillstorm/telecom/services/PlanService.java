package com.skillstorm.telecom.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.telecom.data.UserRepository;
import com.skillstorm.telecom.models.Users;

@Service
public class PlanService {

	@Autowired
	private UserRepository repository;

//	public Users getUserByUsername() {
//		System.out.println("getUserByUsername reached");
////		return repository.getUserbyUsername();
//		return null;
//	}

	public int addBasicPlan(Users u) {
		System.out.println("addBasicPlan reached");
		String planData = "35GB";
		String phoneNumber = "";
		String device = "";
		Long rate = 35L;
		Long numlines = 1L;
		System.out.println(u.getUsername());
		String username = u.getUsername();		
		repository.updateUser(rate, numlines, username);
		return 0;
	}

}
