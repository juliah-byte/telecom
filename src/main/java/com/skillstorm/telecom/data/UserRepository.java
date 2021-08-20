package com.skillstorm.telecom.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.skillstorm.telecom.models.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

	@Query("select u.balance from Users u where u.id = ?1")
	Long findByBalance(Long id);

	@Query("select u.lines from Users u where u.id = ?1")
	Long findByLine(Long id);
	
//	@Query("select u.firstName from Users u where u.username = ?1")
//	Users getUserbyUsername();
//	
	@Modifying
	@Transactional
	@Query("update Users u set u.lines = u.lines + :numlines, u.balance = u.balance + :rate where u.username = :username")
	void updateUser(@Param("numlines") Long lines, @Param("rate") Long balance, @Param("username") String username);
	
	@Query("select u.balance from Users u where u.username = :username")
	Integer getBalanceByUser(@Param("username") String username);
	
	@Query("select u.id from Users u where u.username = :username")
	Long getIdByUser(@Param("username") String username);
	
	@Query("select u from Users u where u.username = :username")
	Users getNameByUsername(@Param("username") String username);
	
	/**@Query("select u.first_name from Users u where u.username = :username and u.user_password :password")
	String getNameByUsernameAndPassword(@Param("username") String username, @Param("user_password") String password);*/
}
