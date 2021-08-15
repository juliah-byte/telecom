package com.skillstorm.telecom.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "user_plan")
public class UserPlan {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "junc_id")
	int id;

	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "user_id", insertable = false, updatable = false)
	private Users user;

	@Column(name = "user_id")
	private int userId;

	@Column(name = "plan_id")
	private int planId;

	@ManyToOne
	@JoinColumn(name = "plan_id", referencedColumnName = "id", insertable = false, updatable = false)
	private Plan plan;

	/**
	 * @Column(name = "phone_id") private int phoneId;
	 * 
	 * @ManyToOne
	 * @JoinColumn(name = "phone_id", referencedColumnName = "phone_id",insertable =
	 *                  false, updatable = false)
	 */

	public UserPlan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserPlan(int userId, int planId) {
		super();
		this.userId = userId;
		this.planId = planId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getPlanId() {
		return planId;
	}

	public void setPlanId(int planId) {
		this.planId = planId;
	}

	@Override
	public String toString() {
		return "UserPlan [id=" + id + ", userId=" + userId + ", planId=" + planId + "]";
	}

}
