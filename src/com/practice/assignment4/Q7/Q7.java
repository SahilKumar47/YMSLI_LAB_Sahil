package com.practice.assignment4.Q7;

import java.io.IOException;

class InputException extends Exception {
	private static final long serialVersionUID = 1L;

	public InputException() {
		super("Input Exception occcured ");
	}
}

class TestExp {
	public void throwException(int val) throws InputException, IOException {
		if(val == 1)
			throw new InputException();
		else
			throw new IOException();
	}
}

public class Q7 {
	public static void main(String[] args) {
		TestExp testExp = new TestExp();
		try {
			testExp.throwException(1);
		} catch (InputException e) {
			System.out.println("input Exception occured");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IO Exception Occured");
			e.printStackTrace();
		}
	}
}
/*
 * If we throw more than one exception from a method then we need to catch those exception in separate catch blocks
 * We should not generalize different exception in one catch block because we might need to perform different task for different type of exceptions
 * It's better to use two catch block to handle two exceptions
 */
  
