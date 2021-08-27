package com.skillstorm.telecom.models;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "phones")
public class Phone {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "phoneid")
	private Long id;

	@Column(name = "pnumber")
	private String number;

	@Column(name = "device")
	private String device;
	
	/**@Column(name = "userplan_juncid", insertable = false,  updatable = false)
	private int userplanid;*/
	
	@OneToMany(mappedBy = "phone", cascade = CascadeType.ALL)
	private Set<UserPlan> userPlans;
	
	
	
	/**
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "phoneid", insertable = false,  updatable = false)
	private UserPlan userplan;*/
	
	
	/*@Column(name = "planid")
	private int planid;*/
	
	
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
