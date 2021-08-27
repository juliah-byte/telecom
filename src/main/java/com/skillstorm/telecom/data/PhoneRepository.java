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
	
	
	

	@Query(value ="select pnumber, device, plan.planname "
			+ "from phones inner join plan "
			+ "on phones.planid = plan.planid "
			+ " inner join userplan "
			+ "on plan.planid = userplan.planid "
			+ " inner join users "
			+ "on userplan.userid = users.userid "
			+ "where users.username = :username and userPassword = :password", nativeQuery=true)
	List<Object> getPhonesByCredentials(@Param("username") String username, @Param("password") String password);
	
	
	Long deletePhoneByNumber(String number);
	
	@Modifying
	@Transactional
	@Query(value = "insert into phones(pnumber, device, planid) values (?1, ?2, ?3)", nativeQuery = true)
	void addDevice(String number, String device, Long planId);
	
	@Query("select p.number from Phone p")
	String[] getPhoneNumbers();
	
	@Query("select p from Phone p "
			+ "join UserPlan up "
			+ "on p.id = up.phoneid "
			+ "where up.userId = :userid")
	Phone getPhoneByUserplan(@Param("userid") Long userid);
	

	

}
