package com.example.beans;

import java.lang.Comparable;

public class User implements Comparable<Object>{
	
	// VARIABLES
	String firstname;
	String lastname;
	String id;
	
	// GETTERS AND SETTERS
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	@Override 
	public int compareTo(Object o) {
        User f = (User) o; 
        return this.lastname.compareTo(f.lastname);
    }
	
}
