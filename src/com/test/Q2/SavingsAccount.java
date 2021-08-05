package com.test.Q2;


//Extending the account class
public class SavingsAccount extends Account {
	private float interestRate;

	public SavingsAccount() {
		super();
		System.out.println("default ctr of Savings");
	}

	public SavingsAccount(SavingsAccount s1) {
		super(s1);
		this.interestRate = s1.interestRate;
		
	}
	
	public void input() {
		//Take the input
		System.out.println("Take the input");
	}
	
	public void print() {
		System.out.println("Printing the value");
		System.out.println(this.toString());
	}

	//Overriding toString method
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SavingsAccount [intrestRate=");
		builder.append(interestRate);
		builder.append("]");
		return builder.toString();
	}
	
	public float getInterest() {
		return interestRate;
	}

}
