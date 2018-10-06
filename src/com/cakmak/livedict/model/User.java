package com.cakmak.livedict.model;

public class User extends Person {

	private String username;
	private String email;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "User { email = "+this.email+",username = "+this.username+", Mahalle = "+this.getAddress().getMahalle() +"}";
	}
}
