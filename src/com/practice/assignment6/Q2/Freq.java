package com.practice.assignment6.Q2;


import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class Freq {
	public static void main(String[] args) {
		try {
			String lineString;
			//Writing in file
			BufferedWriter buffer = new BufferedWriter(new FileWriter("demoFile.txt"));
			buffer.write("Hello World this is is a java code");
			System.out.println("Success");
			//Reading file
			BufferedReader reader = new BufferedReader(new FileReader("demoFile.txt"));
			Map<String, Integer> map = new TreeMap<>();
			// Traversing file
			while((lineString = reader.readLine()) != null) {
				String arr[] = lineString.split(" ");
				for(int i = 0; i < arr.length; i++) {
					if(map.containsKey(arr[i])) {
						map.put(arr[i], map.get(arr[i]) + 1);
					}
					else {
						map.put(arr[i], 1);
					}
				}
			}
			//Iterating using entryset
			for(Map.Entry<String, Integer> entry : map.entrySet()) {
				System.out.println(entry.getKey() + " -- " + entry.getValue());
			}
			buffer.close();
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
