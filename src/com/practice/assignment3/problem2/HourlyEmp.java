package com.practice.assignment3.problem2;

public class HourlyEmp extends Employee{
	private double hourlyRate;
	private int totalHours;
	
	public HourlyEmp(double hourlyRate, int totalHours, String firstName, String lastName, int ein) {
		super(firstName, lastName, ein);
		this.hourlyRate = hourlyRate;
		this.totalHours = totalHours;
	}
	
	
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
		System.out.println("Rate chaged!");

	}


	@Override
	public double earning() {
		return (double)(totalHours * hourlyRate);
	}
	
	@Override
	public double getPayment() {
		System.out.println("-----Hourly Employee-----");
		super.display();
		return earning();
	}
	
	@Override
	public void display() {
		System.out.println("-----Hourly Employee-----");
		super.display();
		System.out.println(" Weekly Salary: " + earning());
	}
}
