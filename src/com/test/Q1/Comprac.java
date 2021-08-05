package com.test.Q1;

import java.util.Comparator;

// Comparators for merchandise class 


//sort the merchandise in ascending order of their itemCode
class MerchandiseSortByName implements Comparator<Merchandise> {
	@Override
	public int compare(Merchandise o1, Merchandise o2) {
		int val =o1.getItemCode().compareTo(o2.getItemCode());
		return val;
	}
}

//sort the merchandise in descending order of their unitPrice
class MerchandiseSortByPrice implements Comparator<Merchandise> {
	@Override
	public int compare(Merchandise o1, Merchandise o2) {
		return Double.compare(o2.getUnitPrice(), o1.getUnitPrice());
	}
}
