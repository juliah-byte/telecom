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
		return repository.addBasicPlan(u.getUsername());
	}

}
