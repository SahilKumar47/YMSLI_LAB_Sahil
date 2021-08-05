package com.test.Q2;


public class Account {
	private Owner owner;
	private float balance;
	private String number;
	
	
	public Account() {
		System.out.println("This is default account ctr");
	}
	
	public Account(Owner owner, float balance, String number) {
		this.owner = owner;
		this.balance = balance;
		this.number = number;
	}
	
	public Account(Account a1) {
		System.out.println("Copy Ctr of account");
		this.owner = a1.owner;
		this.balance = a1.balance;
		this.number = a1.number;
	}
	
	public void input() {
		System.out.println("Enter all the inputs");
		//Take input from the user
	}
	
	public void print() {
		System.out.println("Printing the values");
		System.out.println(this.toString());
	}

	//Overriding toString method
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Account [owner=");
		builder.append(owner);
		builder.append(", balance=");
		builder.append(balance);
		builder.append(", number=");
		builder.append(number);
		builder.append("]");
		return builder.toString();
	}
	
	public void deposit() {
		//Deposit logic add the amt to balance
		
	}
	
	public void withdraw() {
		//withdraw amount logic debit the amt from balance
		
	}
	
	public float getBalance() {
		return balance;
	}
	
	
	
}
