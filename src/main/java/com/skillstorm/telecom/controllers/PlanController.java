package com.skillstorm.telecom.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.skillstorm.telecom.data.PlanRepository;
import com.skillstorm.telecom.models.Plan;

@RestController
public class PlanController {
	
	@Autowired
	private PlanRepository repository;
	
	@GetMapping("/plans")
	public List<Plan> findAll(){
		return repository.findAll();
	}
	
	@GetMapping("/plan/{id}")
	public Optional<Plan> getById( @PathVariable Long id) {
		return repository.findById(id);
	}
	
	/**@GetMapping("plan/{name}")
	public Plan getByName(@PathVariable String name) {
		return repository.findByName(name);
	}*/
}
