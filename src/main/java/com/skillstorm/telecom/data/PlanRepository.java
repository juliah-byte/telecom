package com.skillstorm.telecom.data;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.skillstorm.telecom.models.Plan;

@Repository
public interface PlanRepository extends JpaRepository<Plan, Long>{

	/**@Query("select u from User u where u.name = ?1")
	Plan findByName(String name);*/

}
