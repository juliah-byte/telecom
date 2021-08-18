package com.skillstorm.telecom.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.skillstorm.telecom.models.Phone;

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

	List<Phone> findByUsersUsernameAndPassword(String username, String password);
}
