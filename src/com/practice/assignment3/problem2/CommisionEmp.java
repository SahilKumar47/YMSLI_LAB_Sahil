package com.practice.assignment3.problem2;

public class CommisionEmp extends Employee {

	private int weeklySales;
	private double salesPercentage;

	public CommisionEmp(String firstName, String lastName, int ein, int weeklySales, double salesPercentage) {
		super(firstName, lastName, ein);
		this.weeklySales = weeklySales;
		this.salesPercentage = salesPercentage;
	}

	public void setSalesPercentage(double salesPercentage) {
		this.salesPercentage = salesPercentage;
		System.out.println("Rate chaged!");
	}

	@Override
	public double earning() {
		return (weeklySales * salesPercentage / 100);
	}

	@Override
	public double getPayment() {
		System.out.println("-----Commision Employee-----");
		super.display();
		return earning();
	}
	@Override
	public void display() {
		System.out.println("-----Commision Employee-----");
		super.display();
		System.out.println(" Weekly Salary: " + earning());
	}
}
