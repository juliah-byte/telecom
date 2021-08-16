package com.skillstorm.telecom.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.skillstorm.telecom.models.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long>{
	
	
	@Query("select u.balance from User u where u.id = ?1")
	Long findByBalance(Long id);
	
	
	@Query("select u.lines from User u where u.id = ?1")
	Long findByLine(Long id);

	
}
