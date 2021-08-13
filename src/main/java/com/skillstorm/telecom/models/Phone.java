package com.skillstorm.telecom.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "phones")
public class Phone {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "phone_id")
		private int id;
		
		@OneToOne
		@JoinColumn(name = "phone_id")
		private Plan plan;

		@Column(name = "numbers")
		private int number;
		
		@Column(name = "device")
		private String device;

		public Phone() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Phone(int number, String device) {
			super();
			this.number = number;
			this.device = device;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getNumber() {
			return number;
		}

		public void setNumber(int number) {
			this.number = number;
		}

		public String getDevice() {
			return device;
		}

		public void setDevice(String device) {
			this.device = device;
		}
		

		public Plan getPlan() {
			return plan;
		}

		public void setPlan(Plan plan) {
			this.plan = plan;
		}

		@Override
		public String toString() {
			return "Phones [id=" + id + ", number=" + number + ", device=" + device + "]";
		}
		
		
}
