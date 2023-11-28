package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Userdetail {
	@Id
	private int id ;
	private String name;
	private String password;
	private String email;
	
	
	
	@Override
	public String toString() {
		return "Userdetail [id=" + id + ", name=" + name + ", password=" + password + ", emailid=" + email + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
