package com.practice.assignment3.problem1;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpRecSys {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Employee> list = new ArrayList<Employee>();
		int ch = 5;
		do {
			System.out.println("1. Add Employee and rate 2. Display salary 3.increase rate 4. Exit");
			int v = scanner.nextInt();
			switch (v) {
			case 1:
				System.out.println("Choose option");
				System.out.println("1. Add Salary Employee 2. Hourly Employee 3. Commision Employee");
				int val = scanner.nextInt();
				System.out.println("Enter first name");
				String firstName = scanner.nextLine();
				System.out.println("Enter last name");
				String lastName = scanner.nextLine();
				System.out.println("Enter EIN");
				int ein = scanner.nextInt();

				switch (val) {
				case 1:
					System.out.println("Enter rate");
					double rate = scanner.nextDouble();
					SalariedEmp emp1 = new SalariedEmp(rate, firstName, lastName, ein);
					list.add(emp1);
					break;
				case 2:
					System.out.println("Enter total hours");
					int totalHours = scanner.nextInt();
					System.out.println("Enter hourly rate");
					double hourlyRate = scanner.nextDouble();
					HourlyEmp emp2 = new HourlyEmp(hourlyRate, totalHours, firstName, lastName, ein);
					list.add(emp2);
					break;
				case 3:
					System.out.println("Enter total hours");
					int weeklySales = scanner.nextInt();
					System.out.println("Enter sales percentage");
					double salesPercentage = scanner.nextDouble();
					CommisionEmp emp3 = new CommisionEmp(firstName, lastName, ein, weeklySales, salesPercentage);
					list.add(emp3);
					break;
				default:
					System.out.println("Wrong Employee choice");
					break;
				}
				break;

			case 2:
				for (Employee employee : list) {
					employee.display();
				}
				break;
			case 3:
				System.out.println("1.Add Salary Rate 2. Hourly Rate 3. Commision Rate");
				int c = scanner.nextInt();
				System.out.println("Enter rate");
				double r = scanner.nextDouble();
				for (Employee employee : list) {
					if (c == 1) {
						if (employee instanceof SalariedEmp) {
							((SalariedEmp) employee).setRate(r);
						}
					} else if (c == 2) {
						if (employee instanceof HourlyEmp) {
							((HourlyEmp) employee).setHourlyRate(r);
						}
					} else if (c == 3) {
						if (employee instanceof CommisionEmp) {
							((CommisionEmp) employee).setSalesPercentage(r);
						}
					} else {
						System.out.println("Wrong Choice");
						break;
					}
				}

				break;
			case 4:
				ch = 0;
				break;
			default:
				break;
			}
		} while (ch != 0);
		scanner.close();

	}
}
