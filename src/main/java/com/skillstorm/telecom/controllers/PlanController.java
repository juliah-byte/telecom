package com.skillstorm.telecom.controllers;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.telecom.data.PhoneRepository;
import com.skillstorm.telecom.data.PlanRepository;
//import com.skillstorm.telecom.data.UserPlanRepository;
import com.skillstorm.telecom.data.UserRepository;
import com.skillstorm.telecom.models.Phone;
import com.skillstorm.telecom.models.Plan;
//import com.skillstorm.telecom.models.UserPlan;
import com.skillstorm.telecom.models.Users;
import com.skillstorm.telecom.services.AccountService;
import com.skillstorm.telecom.services.PlanService;
import com.skillstorm.telecom.services.RegisterService;

import jdk.internal.org.jline.utils.Log;

@RestController
@Transactional
@CrossOrigin(origins = "http://localhost:4200")
public class PlanController {

	@Autowired
	private PlanRepository repository;

	@Autowired
	private UserRepository repository1;

	@Autowired
	private PhoneRepository repository2;

	@Autowired
	private PlanService pService;
	
	@Autowired
	private AccountService aService;
	
	

	public PlanController() {

	}

	//private Logger logger = Logger.getLogger(this.getClass());

	// Plan

	@GetMapping("plan/username/{username}/password/{password}")
	public ResponseEntity<Object> getPlanByCredentials(@PathVariable String username, @PathVariable String password) {
		return new ResponseEntity<>(repository.findPlanByUsernameAndPassword(username, password), HttpStatus.OK);
	}

	@GetMapping("/plans")
	public List<Plan> findAll() {
		return repository.findAll();
	}

	@GetMapping("/plan/id/{id}")
	public Optional<Plan> getById(@PathVariable Long id) {
		return repository.findById(id);
	}


	// User
	@GetMapping("/user/username/{username}")
	public ResponseEntity<Long> setIdbyUsername(@PathVariable String username) {
		return new ResponseEntity<Long>(aService.getIdByUser(username), HttpStatus.OK);
	}
	
	
	
	@GetMapping("/user/username/{username}/password/{password}")
	public ResponseEntity<Users> getIdByUsernameAndPassword(@PathVariable String username, @PathVariable String password) {
		//System.out.println(s);
		//Long UsersId = s.getId();
		////return new ResponseEntity<>(UsersId, HttpStatus.OK);
		
		return new ResponseEntity<Users>(repository1.getUsersByUsernameAndPassword(username, password), HttpStatus.OK);
	}

	@RequestMapping(value = "/plans/addBasic", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Integer> addBasic(@RequestBody Users user) {
		//Log.debug("Add Basic Reached");
		Users u = new Users();
		u.setUsername(user.getUsername());
		return new ResponseEntity<>(pService.addBasicPlan(u), HttpStatus.OK);
	}

	@RequestMapping(value = "/plans/addPremium", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Integer> addPremium(@RequestBody Users user) {
		//Log.debug("Add Premium Reached");
		Users u = new Users();
		u.setUsername(user.getUsername());
		return new ResponseEntity<>(pService.addPremiumPlan(u), HttpStatus.OK);
	}

	@RequestMapping(value = "/plans/addDeluxe", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Integer> addDeluxe(@RequestBody Users user) {
		//Log.debug("Add Deluxe Reached");
		System.out.println("Add Deluxe Reached");
		Users u = new Users();
		u.setUsername(user.getUsername());
		return new ResponseEntity<>(pService.addDeluxePlan(u), HttpStatus.OK);

	}

	// Phone

	@GetMapping("/phone/username/{username}/password/{password}")
	public ResponseEntity<Object> getPhones(@PathVariable String username, @PathVariable String password) {
		//Log.debug("getPhones method initialized");
		// System.out.println(repository2.getPhones(username,password));
		return new ResponseEntity<>(repository2.getPhonesByCredentials(username, password), HttpStatus.OK);
	}

	@DeleteMapping("/phone/number/{number}")
	public ResponseEntity<Long> deletePhoneByPhoneNumber(@PathVariable String number) {
		//Log.debug("deleteByPhone Number intialized");
		return new ResponseEntity<Long>(repository2.deletePhoneByNumber(number), HttpStatus.NO_CONTENT);
	}

}
