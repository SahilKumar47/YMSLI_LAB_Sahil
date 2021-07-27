package com.practice.assignment2.banking;

public class CurrentAccount extends Account {
	private int tradeLicenseNumber;

	public CurrentAccount(int tradeLicenseNumber, String memberName, double accountBalance) {
		super(memberName, accountBalance);
		this.tradeLicenseNumber = tradeLicenseNumber;
	}

	public double getBalance() {
		return getAccountBalance();
	}

	public void withdraw(double amt) {
		if (amt > getAccountBalance())
			System.out.println("Low balance");
		else {
			setAccountBalance(getAccountBalance() - amt);
		}
	}
}
