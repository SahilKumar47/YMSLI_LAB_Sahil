package com.practice.assignment6.Q4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class MaxData {
	public static void main(String[] args) {
		File file = new File("data.txt");
		double res = 0.0;
		try {
			Scanner scanner = new Scanner(file);
			
			while(scanner.hasNextDouble()) {
				double data = scanner.nextDouble();
				res = Math.max(data, res);
			}
			System.out.println("Maximum Number: " + res);
		} catch (FileNotFoundException e) {
			System.out.println("Error occured");
		}
	}
}
