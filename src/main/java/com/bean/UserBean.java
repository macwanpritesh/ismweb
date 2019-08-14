package com.bean;

import javax.validation.constraints.NotEmpty;

import com.sun.istack.internal.NotNull;

public class UserBean {

	@NotEmpty(message = "please enter firstname")
	private String firstName;
	@NotEmpty(message = "please enter lastname")
	private String lastName;
	@NotEmpty(message = "please enter password")
	private String password;
	@NotEmpty(message = "please enter repassword")
	private String repassword;
	@NotEmpty(message = "please select gender")
	private String gender;
	@NotEmpty(message = "please check hobbies")
	private String hobbies;
	
	
	
	
	
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRepassword() {
		return repassword;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	
	
	
	
}
