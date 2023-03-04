package com.myfirst.rest.services.restfulwebservices.users;

import java.time.LocalDate;

public class User {
	private String name;
	private int id;
	private LocalDate birthDate;
	
	
	public User(String name, int id, LocalDate birthDate) {
		super();
		this.name = name;
		this.id = id;
		this.birthDate = birthDate;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", birthDate=" + birthDate + "]";
	}
	
	

}
