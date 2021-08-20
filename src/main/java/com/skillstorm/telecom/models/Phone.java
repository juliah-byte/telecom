package com.skillstorm.telecom.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "phones")
public class Phone {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "phone_id")
	private Long id;

	@Column(name = "pnumber")
	private String number;

	@Column(name = "device")
	private String device;
	
	@Column(name = "plan_id")
	private String plan_id;
	
	
	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Phone(String number, String device) {
		super();
		this.number = number;
		this.device = device;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}


	@Override
	public String toString() {
		return "Phones [id=" + id + ", number=" + number + ", device=" + device + "]";
	}

}
