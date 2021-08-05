package com.test.Q2;

public class Owner {
	private String name;
	private Date dateOfBirth;
	private String nic;
	
	public Owner() {
		System.out.println("This is default owner ctr");
	}
	
	public Owner(String name, Date dateOfBirth, String nic) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.nic = nic;
	}

	public Owner(Owner o1) {
		System.out.println("Copy Ctr of Owner");
		this.name = o1.name;
		this.dateOfBirth = o1.dateOfBirth;
		this.nic = o1.nic;
	}
	

	public void input() {
		//Take the input
		System.out.println("Enter all the inputs");
	}
	
	public void print() {
		//print info
		System.out.println(this.toString());
	}

	//Overriding toString method
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Owner [name=");
		builder.append(name);
		builder.append(", dateOfBirth=");
		builder.append(dateOfBirth);
		builder.append(", nic=");
		builder.append(nic);
		builder.append("]");
		return builder.toString();
	}
	
	
}
