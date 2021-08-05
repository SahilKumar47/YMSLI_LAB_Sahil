package com.test.Q2;


//Extending the account class
public class CurrentAccount extends Account{
	private float minimumBalance;

	public CurrentAccount() {
		super();
		System.out.println("Default ctr of Current account");
	}
	
	public CurrentAccount(CurrentAccount c1) {
		super(c1);
		System.out.println("copy ctr of Current Account");
		this.minimumBalance = c1.minimumBalance;
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
		builder.append("CurrentAccount [minimumBalance=");
		builder.append(minimumBalance);
		builder.append("]");
		return builder.toString();
	}
	
	public float getCharges() {
		return minimumBalance;
	}
}
