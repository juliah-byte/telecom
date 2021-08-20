package com.skillstorm.telecom.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.skillstorm.telecom.models.Phone;

@Repository
public interface PhoneRepository extends JpaRepository <Phone, Long> {
	
	

	@Query(value ="select pnumber, device, plan.plan_name "
			+ "from phones inner join plan "
			+ "on phones.plan_id = plan.plan_id "
			+ " inner join user_plan "
			+ "on plan.plan_id = user_plan.plan_id "
			+ " inner join users "
			+ "on user_plan.user_id = users.user_id "
			+ "where users.username = :username and users.user_password = :password", nativeQuery=true)
	List<Object> getPhonesByCredentials(@Param("username") String username, @Param("password") String password);
	
	
	Long deletePhoneByNumber(String number);

	

}
