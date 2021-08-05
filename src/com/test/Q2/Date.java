package com.test.Q2;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date() {
		System.out.println("Default ctr of Date");
	}

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public Date(Date d1) {
		System.out.println("Copy ctr of Date");
		this.day = d1.day;
		this.month = d1.month;
		this.year = d1.year;
	}
	
	public void input() {
		//Take the input
		System.out.println("Enter all the inputs");
	}
	
	public void print() {
		System.out.println("Print values");
		System.out.println(this.toString());
	}

	//Overriding toString method
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Date [day=");
		builder.append(day);
		builder.append(", month=");
		builder.append(month);
		builder.append(", year=");
		builder.append(year);
		builder.append("]");
		return builder.toString();
	}
	
	
}
