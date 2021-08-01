package com.practice.assignment4.Q2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2 {
	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter writer = new BufferedWriter(
						new FileWriter("C:\\Users\\ve00ym269\\Desktop\\demo.txt"));) {
			System.out.println("Enter the text");
			String name = reader.readLine();
			System.out.println(name);
			writer.write(name);
			System.out.println("Success");
		} catch (IOException e) {
			System.out.println("Exception occured");
			e.printStackTrace();
		}

	}
}
