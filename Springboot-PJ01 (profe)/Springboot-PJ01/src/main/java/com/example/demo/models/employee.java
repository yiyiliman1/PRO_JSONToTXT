package com.example.demo.models;

public class employee {
	String firstName;    
    String lastName;
    String website;
    public employee(
    		String firstName,    
    	    String lastName,
    	    String website) {
    	this.firstName=firstName;
    	this.lastName=lastName;
    	this.website=website;
    }
    public String getFirstName() {
		return firstName;
	}
    public String getLastName() {
		return lastName;
	}
    public String getWebsite() {
		return website;
	}
    
    @Override public String toString() {
    	return 
    	"firstname=" + firstName + "\n" +
    	"lastname=" + lastName + "\n" +
    	"website=" + website ;
    	}
    }

