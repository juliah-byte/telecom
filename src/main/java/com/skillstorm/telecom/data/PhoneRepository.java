package com.skillstorm.telecom.data;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.skillstorm.telecom.models.Phone;

@Repository
public interface PhoneRepository extends JpaRepository<Phone, Long> {
	
	
}
