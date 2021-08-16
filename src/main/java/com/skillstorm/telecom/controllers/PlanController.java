package com.skillstorm.telecom.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.skillstorm.telecom.data.PlanRepository;
import com.skillstorm.telecom.data.UserRepository;
import com.skillstorm.telecom.models.Plan;
import com.skillstorm.telecom.models.Users;

@RestController
public class PlanController {
	
	@Autowired
	private PlanRepository repository;
	
	@Autowired
	private UserRepository repository1;
	
	//Plan
	
	@GetMapping("/plans")
	public List<Plan> findAll(){
		return repository.findAll();
	}
	
	@GetMapping("/plan/id/{id}")
	public Optional<Plan> getById( @PathVariable Long id) {
		return repository.findById(id);
	}
	
	@GetMapping("plan/name/{name}")
	public Plan getByName(@PathVariable String name) {
		return repository.findByName(name);
	}	
		
	//User
		
	@GetMapping("/user/id/{id}")
	public Optional<Users> getByUserId(@PathVariable Long id){
		return repository1.findById(id);
	}
	
	@GetMapping("/user/id/{id}/balance")
	public Long getBalance(@PathVariable Long id) {
		return repository1.findByBalance(id);
	}
	
	@GetMapping("/user/id/{id}/lines")
	public Long getLine(@PathVariable Long id) {
		return repository1.findByLine(id);
	}
}
