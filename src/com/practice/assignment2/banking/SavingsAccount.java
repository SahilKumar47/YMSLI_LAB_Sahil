package com.practice.assignment2.banking;

public class SavingsAccount extends Account {
	private int interest = 5;
	private int maxWthAmt;

	public SavingsAccount(String memberName, double accountBalance, int maxWthAmt) {
		super(memberName, accountBalance);// calling Account class constructor
		this.maxWthAmt = maxWthAmt;
	}

	public double getBalance() {
		return (((interest + 100) * getAccountBalance()) / 100);
	}

	public void withdraw(double amt) {
		if (amt > maxWthAmt)
			System.out.println("Max amount exceeded");
		else if ((getAccountBalance() - amt) > 500) {
			setAccountBalance(getAccountBalance() - amt);
			System.out.println(amt + " amount debited");
		} else {
			System.out.println("Minimum balance reached can not withdraw amount");
		}
	}
}
