package com.practice.assignment4.Q4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in);) {
			System.out.println("Please enter a number or enter ‘-1’ if you want to quit");
			int val = scanner.nextInt();
			if(val == -1)
				System.exit(0);
			else if(val %2 != 0)
				System.out.println("You have entered an odd number");
			else {
				System.out.println("You have entered an even number");
			}
		} catch (InputMismatchException e) {
			System.out.println("You must enter an integer");
		}
		
	}
}
