package com.practice.assignment2;

public class Circle {
	private double radius;
	private String color;

	public Circle() {
		this.radius = 1.0;
		this.color = "red";
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		double area = Math.PI * radius * radius;
		return area;
	}
}
