package com.test.Q1;

public class Merchandise {
	private String itemCode;
	private int quantity;
	private double unitPrice;

	public Merchandise(String itemCode, int quantity, double unitPrice) {
		//Parameterized ctr of the merchandise class
		this.itemCode = itemCode;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	//getter of itemCode
	public String getItemCode() {
		return itemCode;
	}

	//getter of unitPrice
	public double getUnitPrice() {
		return unitPrice;
	}

	//Overriding the toString method 
	@Override
	public String toString() {
		return "[itemCode=" + itemCode + ", quantity=" + quantity + ", unitPrice=" + unitPrice + "]";
	}
}
