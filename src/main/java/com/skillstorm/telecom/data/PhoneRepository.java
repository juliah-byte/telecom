package com.skillstorm.telecom.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.skillstorm.telecom.models.Phone;

@Repository
public interface PhoneRepository extends JpaRepository <Phone, Long> {
	
	

	@Query(value = "select pnumber, device, plan.plan_name \r\n"
			+ "From phones \r\n"
			+ "left join users \r\n"
			+ "On phones.user_id = users.user_id \r\n"
			+ "inner join user_plan\r\n"
			+ "on users.user_id = user_plan.user_id\r\n"
			+ "inner join plan\r\n"
			+ "on user_plan.plan_id = plan.plan_id\r\n"
			+ "where users.username = :username and users.user_password = :password", nativeQuery=true)
	List<Object> getPhonesByCredentials(@Param("username") String username, @Param("password") String password);
	
	
	Long deletePhoneByNumber(String number);
	
	@Modifying
	@Transactional
	@Query(value = "insert into phones(pnumber, device, user_id) values (?1, ?2, ?3)", nativeQuery = true)
	void addDevice(String number, String device, Long id);
	
	@Query("select p.number from Phone p")
	String[] getPhoneNumbers();

	

}
