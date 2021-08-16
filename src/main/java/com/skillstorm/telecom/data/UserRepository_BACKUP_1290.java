package com.skillstorm.telecom.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.skillstorm.telecom.models.Users;

@Repository
<<<<<<< HEAD
public interface UserRepository extends JpaRepository<Users, Long>{
	
	
	@Query("select u.balance from User u where u.id = ?1")
	Long findByBalance(Long id);
	
=======

public interface UserRepository extends JpaRepository<Users, Long>{

	@Query("select u.balance from Users u where u.id = ?1")
	Long findByBalance(Long id);	
>>>>>>> 33c8d04715c615e74e408f2a0d84b712aa92d5fb
	
	@Query("select u.lines from Users u where u.id = ?1")
	Long findByLine(Long id);
<<<<<<< HEAD

=======
>>>>>>> 33c8d04715c615e74e408f2a0d84b712aa92d5fb
	
}
