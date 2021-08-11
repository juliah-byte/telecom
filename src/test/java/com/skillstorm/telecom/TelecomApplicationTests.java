package com.skillstorm.telecom;

import org.jboss.logging.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.skillstorm.telecom.data.PlanRepository;
//import com.skillstorm.telecom.data.UserRepository;
import com.skillstorm.telecom.models.Plan;
import com.skillstorm.telecom.models.User;


@ContextConfiguration
@SpringBootTest
class TelecomApplicationTests {
	
	private Logger log = Logger.getLogger(TelecomApplicationTests.class);
	//private UserRepository repository1;
	
	@Autowired
	private PlanRepository repository;

	@Test
	void contextLoads() {
		Plan plan = repository.save(new Plan("Premium", 35, "limited", "limited", "limited", "limited", new User(1,"Jetta101", "passWord1", "James", "Smith", "jazy1@gmail.com")));
		log.debug(plan);
		//Plan plan = repository.save(new Plan(35, "limited", "limited", "unavailable", "limited"));
	}

}
