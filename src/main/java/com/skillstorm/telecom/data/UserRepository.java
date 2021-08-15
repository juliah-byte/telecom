package com.skillstorm.telecom.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.telecom.models.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long>{

	
}
