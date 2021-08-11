package com.skillstorm.telecom.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.telecom.models.Plan;

@Repository
public interface PlanRepository extends JpaRepository<Plan, Integer>{

}
