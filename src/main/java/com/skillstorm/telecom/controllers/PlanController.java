package com.skillstorm.telecom.controllers;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.telecom.data.PhoneRepository;
import com.skillstorm.telecom.data.PlanRepository;
//import com.skillstorm.telecom.data.UserPlanRepository;
import com.skillstorm.telecom.data.UserRepository;
import com.skillstorm.telecom.models.Phone;
import com.skillstorm.telecom.models.Plan;
//import com.skillstorm.telecom.models.UserPlan;
import com.skillstorm.telecom.models.Users;
import com.skillstorm.telecom.services.PlanService;
import com.skillstorm.telecom.services.RegisterService;

@RestController
@Transactional
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("plans")
public class PlanController {

	@Autowired
	private PlanRepository repository;

	@Autowired
	private UserRepository repository1;

	@Autowired
	private PhoneRepository repository2;


	@Autowired
	private PlanService service;

	public PlanController() {
		
	}

	
	//Plan
	
	@GetMapping("plan/username/{username}/password/{password}")
	public ResponseEntity<Object> getPlanByCredentials(@PathVariable String username, @PathVariable String password){
		return new ResponseEntity<>(repository.findPlanByUsernameAndPassword(username, password), HttpStatus.OK);
	}
	
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

	
	@GetMapping("/user/id/{id}/balance")
	public Long getBalance(@PathVariable Long id) {
		return repository1.findByBalance(id);
		
	}


	// User

	@PostMapping
	@RequestMapping("addBasic")
	public ResponseEntity<Integer> addBasic(@RequestBody Users user) {

		System.out.println("Add Basic reached");
		Users u = new Users();
		u.setUsername(user.getUsername());
		return new ResponseEntity<>(service.addBasicPlan(u), HttpStatus.OK);
	}
	

	@PostMapping
	@RequestMapping("addPremium")
	public ResponseEntity<Integer> addPremium(@RequestBody Users user) {
		System.out.println("Add Premium reached");
		Users u = new Users();
		u.setUsername(user.getUsername());
		return new ResponseEntity<>(service.addPremiumPlan(u), HttpStatus.OK);
	}
	@PostMapping
	@RequestMapping("addDeluxe")
	public ResponseEntity<Integer> addDeluxe(@RequestBody Users user) {
		System.out.println("Add Deluxe Reached");
		Users u = new Users();
		u.setUsername(user.getUsername());
		return new ResponseEntity<>(service.addDeluxePlan(u), HttpStatus.OK);
	 
	}




	
	//Phone
	

	@GetMapping("/phone/username/{username}/password/{password}")
	public ResponseEntity<Object> getPhones(@PathVariable String username, @PathVariable String password) {
		System.out.println(username);
		//System.out.println(repository2.getPhones(username,password));
		return new ResponseEntity<>(repository2.getPhonesByCredentials(username,password), HttpStatus.OK);
		}
		
	@DeleteMapping("/phone/number/{number}")
	public ResponseEntity<Long> deletePhoneByPhoneNumber(@PathVariable String number) {
		System.out.println("Delete");
		return new ResponseEntity<Long>(repository2.deletePhoneByNumber(number),HttpStatus.NO_CONTENT);
	}


}

