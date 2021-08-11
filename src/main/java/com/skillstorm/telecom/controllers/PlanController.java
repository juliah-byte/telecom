package com.skillstorm.telecom.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.skillstorm.telecom.data.PlanRepository;
import com.skillstorm.telecom.models.Plan;

@RestController
@RequestMapping("/plans")
public class PlanController {
	
	@Autowired
	private PlanRepository repository;

	
	@GetMapping
	public List<Plan> findAll(){
		return repository.findAll();
	}
}
