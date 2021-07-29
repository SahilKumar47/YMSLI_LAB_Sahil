package com.practice.assignment3.problem1;

public abstract class Employee {
	private int ein;
	private String firstName;
	private String lastName;
	
	public Employee(String firstName, String lastName, int ein) {
		this.firstName =  firstName;
		this.lastName = lastName;
		this.ein = ein;
	}
	
	public void display() {
		System.out.print("EIN: " + ein + " First Name: " + firstName + " Last Name: " + lastName);
	}
	
	//abstract method 
	public abstract double earning();
}
