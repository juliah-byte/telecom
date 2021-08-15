package com.skillstorm.telecom.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "users")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
<<<<<<< HEAD:src/main/java/com/skillstorm/telecom/models/Users.java
	private int id;
=======
	private Long id;
	
	
	@OneToMany(mappedBy ="user", cascade = CascadeType.ALL)
>>>>>>> 02a03ca89d946f225fa58a5fb550501a278a3b71:src/main/java/com/skillstorm/telecom/models/User.java

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private Set<UserPlan> userPlans = new HashSet<UserPlan>();

	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email")
	private String email;

	@Column(name = "lines")
<<<<<<< HEAD:src/main/java/com/skillstorm/telecom/models/Users.java
	private int lines;

	@Column(name = "balance")
	private int balance;
=======
	private Long lines;
	
	@Column(name = "balance")
	private Long balance;
	
	
	
	/**@OneToMany(mappedBy = "user")*/
	
>>>>>>> 02a03ca89d946f225fa58a5fb550501a278a3b71:src/main/java/com/skillstorm/telecom/models/User.java

	/** @OneToMany(mappedBy = "user") */

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

<<<<<<< HEAD:src/main/java/com/skillstorm/telecom/models/Users.java
	public Users(Set<UserPlan> userPlans, String username, String password, String firstName, String lastName,
			String email, int lines, int balance) {
=======


	public User(Set<UserPlan> userPlans, String username, String password, String firstName, String lastName, String email,
			Long lines, Long balance) {
>>>>>>> 02a03ca89d946f225fa58a5fb550501a278a3b71:src/main/java/com/skillstorm/telecom/models/User.java
		super();
		this.userPlans = userPlans;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.lines = lines;
		this.balance = balance;
	}

<<<<<<< HEAD:src/main/java/com/skillstorm/telecom/models/Users.java
	public int getId() {
		return id;
	}

	public void setId(int id) {
=======


	public Long getId() {
		return id;
	}



	public void setId(Long id) {
>>>>>>> 02a03ca89d946f225fa58a5fb550501a278a3b71:src/main/java/com/skillstorm/telecom/models/User.java
		this.id = id;
	}

	public Set<UserPlan> getPlans() {
		return userPlans;
	}

	public void setPlans(Set<UserPlan> userPlans) {
		this.userPlans = userPlans;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

<<<<<<< HEAD:src/main/java/com/skillstorm/telecom/models/Users.java
	public int getLines() {
		return lines;
	}

	public void setLines(int lines) {
		this.lines = lines;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
=======


	public Long getLines() {
		return lines;
	}



	public void setLines(Long lines) {
		this.lines = lines;
	}



	public Long getBalance() {
		return balance;
	}



	public void setBalance(Long balance) {
>>>>>>> 02a03ca89d946f225fa58a5fb550501a278a3b71:src/main/java/com/skillstorm/telecom/models/User.java
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", email=" + email + ", lines=" + lines + ", balance=" + balance + "]";
	}

}
