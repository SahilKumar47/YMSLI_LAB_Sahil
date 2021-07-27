package com.practice.assignment2.student;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of the student"); 
		String name = scanner.nextLine();
		System.out.println("Enter the Id of the student");
		String id = scanner.nextLine();
		System.out.println("Enter the grade and year"); 
		int grade = scanner.nextInt();
		int year = scanner.nextInt();
		Student s = new Student(name, id, grade);   
		System.out.println("Student Details");
		s.display(year);
		scanner.close();
	}
}
