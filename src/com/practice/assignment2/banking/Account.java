package com.practice.assignment2.banking;

public class Account {
	private String memberName;
	private int accountNumber;
	private double accountBalance;

	public Account(String memberName, double accountBalance) {
		this.memberName = memberName;
		accountNumber = accountNumberGenerator();
		this.accountBalance = accountBalance;
	}

	public void deposit(double amt) {
		this.accountBalance += amt;
		System.out.println("Amount added sucessfully");
	}

	private int accountNumberGenerator() {
		int num = 10000 + (int) (Math.random() * 89999);
		return num;
	}

	public double getAccountBalance() {
		return accountBalance;
	}
	
	public void setAccountBalance(double accountBalance) {
			this.accountBalance = accountBalance;
	}

}
