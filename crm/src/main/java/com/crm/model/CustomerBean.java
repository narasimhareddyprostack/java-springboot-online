package com.crm.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class CustomerBean {
	
	@Column(length=20)
	@NotEmpty
	private String firstName;
	
	@NotEmpty
	@Email
	private String email;
	
	@NotEmpty
	private String mobile;
	
	@NotEmpty
	private String password;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
