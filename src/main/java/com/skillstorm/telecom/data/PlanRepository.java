package com.skillstorm.telecom.data;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.skillstorm.telecom.models.Plan;

@Repository
public interface PlanRepository extends JpaRepository<Plan, Long>{

	

	@Query("select u from Plan u where u.name = ?1")
	Plan findByName(String name);
	
	
	//Tried to use JPQL for this method, however it required @MappedSuperClass Annotation in Plan class, which inhibited @Enitty
	/**@Query("select u.rate from Plan u "
			+ "inner join u.plan_id pp "
			+ "inner join pp.user_id s "
			+ "where s.username = ?1 and s.user_password = ?2")
	Plan findPlanByUsernameAndPassword(String Username, String Password);*/
	
	@Query(value ="select plan_name, rate\r\n"
			+ "from plan\r\n"
			+ "inner join user_plan\r\n"
			+ "on plan.plan_id = user_plan.plan_id\r\n"
			+ "inner join users\r\n"
			+ "on user_plan.user_id = users.user_id\r\n"
			+ "where users.username = 'b' and users.user_password = 'a';", nativeQuery=true)
	List<Object> findPlanByUsernameAndPassword(String Username, String Password);


	
}
