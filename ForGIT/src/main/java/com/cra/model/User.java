package com.cra.model;

public class User {
	String username;
	String password;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String username, String person) {
		super();
		this.username = username;
		this.password = person;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPerson() {
		return password;
	}
	public void setPerson(String person) {
		this.password = person;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", person=" + password + "]";
	}
	
	

}
