package com.practice.assignment4.Q1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ByteFormat {
	public static void main(String[] args) {
		try {
			File filePath = new File("C:\\Users\\ve00ym269\\Desktop", "demo.txt");
			InputStream file = new FileInputStream(filePath);
			byte[] allBytes = new byte[(int) filePath.length()];
			file.read(allBytes);
			String s = new String(allBytes);
			System.out.println("File Content: " + s);
			file.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
