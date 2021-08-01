package com.practice.assignment4.Q5;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Q5 {
	static void checkNumber(int val) throws Exception {
		if(val > 100)
			throw new Exception("Number can't be greater than 100");
		System.out.println("You entered " + val);
	}
	
	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in);) {
			System.out.println("Enter the number: ");
			int val = scanner.nextInt();
			checkNumber(val);
		}catch (InputMismatchException e) {
			System.out.println("must be a string");
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
