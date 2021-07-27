package com.practice.assignment2;

public class TestCircle {
	public static void main(String[] args) {
		Circle c = new Circle();
		System.out.println("Area of the default circle is " + c.getArea());
		
		Circle d = new Circle(12.0);
		System.out.println("Radius " + d.getRadius());
		System.out.println("Area " + d.getArea());
		
	}
}
