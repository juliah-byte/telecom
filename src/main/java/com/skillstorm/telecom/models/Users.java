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
	@Column(name = "userid")
	private Long id;

	/**@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private Set<UserPlan> userPlans = new HashSet<UserPlan>();*/

	@Column(name = "username")
	private String username;

	@Column(name = "userpassword")
	private String password;

	@Column(name = "firstname")
	private String firstName;

	@Column(name = "lastname")
	private String lastName;

	@Column(name = "email")
	private String email;

	@Column(name = "numlines")
	private Long lines;

	@Column(name = "balance")
	private Long balance;

	/** @param users 
	 * @OneToMany(mappedBy = "user") */
	
	
	public Users() {
		super();
	}

	public Users(Long id, String username, String password, String firstName, String lastName,
			String email, Long lines, Long balance) {
		super();
		this.id = id;
		//this.userPlans = userPlans;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.lines = lines;
		this.balance = balance;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**public Set<UserPlan> getUserPlans() {
		return userPlans;
	}*/

	/**public void setUserPlans(Set<UserPlan> userPlans) {
		this.userPlans = userPlans;
	}*/

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
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", userPlans=" +  ", username=" + username + ", password=" + password
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", lines=" + lines
				+ ", balance=" + balance + "]";
	}

	
}
