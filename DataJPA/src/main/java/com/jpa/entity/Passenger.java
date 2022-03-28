package com.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Passenger {

	@Id
	private Integer PassengerId;
	@Column(length=15)
	private String firstName;
	@Column(length=15)
	private String lastName;
	@Column(length=20)
	private String emailId;
	
	public Integer getPassengerId() {
		return PassengerId;
	}
	public void setPassengerId(Integer passengerId) {
		PassengerId = passengerId;
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
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
}
