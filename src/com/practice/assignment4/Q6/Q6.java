package com.practice.assignment4.Q6;

import java.util.InputMismatchException;
import java.util.Scanner;

class InputException extends Exception {
	private static final long serialVersionUID = 1L;

	public InputException(int n) {
		super("Number can't be grated than " + n);
	}
}

public class Q6 {
	static void checkNumber(int val) throws InputException {
		if (val > 100)
			throw new InputException(100);

		System.out.println("You entered " + val);
	}

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in);) {
			System.out.println("Enter the number: ");
			int val = scanner.nextInt();
			checkNumber(val);
		} catch (InputException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (InputMismatchException e) {
			System.out.println("must be a string");
			e.printStackTrace();
		}
	}
}
