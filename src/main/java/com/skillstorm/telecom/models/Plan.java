package com.skillstorm.telecom.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "plan")
public class Plan {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@OneToMany
	@JoinColumn(name = "phone_id")
	private Set<Phone> phone = new HashSet<Phone>();

	@Column(name = "name")
	private String name;

	@Column(name = "rate")
	private long rate;

	@Column(name = "minutes")
	private String minutes;

	@Column(name = "text")
	private String text;

	@Column(name = "international")
	private String international;

	@Column(name = "data")
	private String data;

	@OneToMany(mappedBy = "plan", cascade = CascadeType.ALL)
	private Set<UserPlan> userPlans;

	public Plan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Plan(String name, int rate, String minutes, String text, String international, String data,
			Set<UserPlan> plans) {
		super();
		this.name = name;
		this.rate = rate;
		this.minutes = minutes;
		this.text = text;
		this.international = international;
		this.data = data;
		this.userPlans = plans;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getRate() {
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

	public String getInternational() {
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

	public Set<UserPlan> getPlans() {
		return userPlans;
	}

	public void setPlans(Set<UserPlan> plans) {
		this.userPlans = plans;
	}

	@Override
	public String toString() {
		return "Plan [id=" + id + ", name=" + name + ", rate=" + rate + ", minutes=" + minutes + ", text=" + text
				+ ", international=" + international + ", data=" + data + "]";
	}

}
