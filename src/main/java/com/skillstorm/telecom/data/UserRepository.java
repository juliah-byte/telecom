package com.skillstorm.telecom.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.skillstorm.telecom.models.Users;

@Repository
<<<<<<< HEAD
public interface UserRepository extends JpaRepository<Users, Long>{

=======
public interface UserRepository extends JpaRepository<User, Long>{
	
	
	@Query("select u.balance from User u where u.id = ?1")
	Long findByBalance(Long id);
	
	
	@Query("select u.lines from User u where u.id = ?1")
	Long findByLine(Long id);
>>>>>>> 02a03ca89d946f225fa58a5fb550501a278a3b71
	
}
