package com.practice.assignment2.student;

public class Student {
	private String name;
	private String id;
	private int grade;

	public Student(String id) {
		this.id = id;
	}

	public Student(String name, String id) {
		this(id);
		this.name = name;
	}

	public Student(String name, String id, int grade) {
		this(name, id);
		this.grade = grade;
	}

	public void display() {
		System.out.println("Name: " + name + " ID: " + id + " Grade: " + grade);
	}
	
	public void display(int year) {
		display();
		System.out.println("Student currently in " + year + " year");

	}
}
