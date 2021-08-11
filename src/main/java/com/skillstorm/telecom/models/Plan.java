package com.skillstorm.telecom.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
public class Plan {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "rate")
	private int rate;
	
	@Column(name = "minutes")
	private String minutes;
	
	@Column(name = "text")
	private String text;
	
	@Column(name = "international")
	private String international;
	
	@Column(name = "data")
	private String data;
	
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;


	public Plan() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Plan(String name, int rate, String minutes, String text, String international, String data, User user) {
		super();
		this.name = name;
		this.rate = rate;
		this.minutes = minutes;
		this.text = text;
		this.international = international;
		this.data = data;
		this.user = user;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public String getMinutes() {
		return minutes;
	}

	public void setMinutes(String minutes) {
		this.minutes = minutes;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String isInternational() {
		return international;
	}

	public void setInternational(String international) {
		this.international = international;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}



	@Override
	public String toString() {
		return "Plan [id=" + id + ", rate=" + rate + ", minutes=" + minutes + ", text=" + text + ", international="
				+ international + ", data=" + data + ", user=" + user + "]";
	}

	
	
	
	
	
	
	
}
