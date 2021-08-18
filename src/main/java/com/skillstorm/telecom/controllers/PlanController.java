package com.skillstorm.telecom.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.telecom.data.PhoneRepository;
import com.skillstorm.telecom.data.PlanRepository;
//import com.skillstorm.telecom.data.UserPlanRepository;
import com.skillstorm.telecom.data.UserRepository;
import com.skillstorm.telecom.models.Phone;
import com.skillstorm.telecom.models.Plan;
//import com.skillstorm.telecom.models.UserPlan;
import com.skillstorm.telecom.models.Users;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PlanController {
	
	@Autowired
	private PlanRepository repository;
	
	@Autowired
	private UserRepository repository1;
	
	@Autowired
	private PhoneRepository repository2;
	
	
	
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
//		return repository1.findByBalance(id);
		return null;
	}
	
	@GetMapping("/user/id/{id}/lines")
	public Long getLine(@PathVariable Long id) {
//		return repository1.findByLine(id);
		return null;
	}
	
	//Phone
	
	@GetMapping("/phone/username/{username}/password/{password}")
	public ResponseEntity<List<Object>> getPhones(@PathVariable String username, @PathVariable String password) {
		System.out.println(username);
		//System.out.println(repository2.getPhones(username,password));
		return new ResponseEntity<>(repository2.getPhonesByCredentials(username,password), HttpStatus.OK);
	}
	
	
/**	
	@DeleteMapping("/phone/number/{number}"){
		return repository2.deletebyName(number);
	}
	
	
	@PostMapping("/userplan/{user_id/plan_id")
	public UserPlan savebyId(Long user_id, Long plan_id) {
		return repository3.saveById(user_id, plan_id);
	}
*/
}
