package com.test.Q1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class MerchandiseInventoryTest {
	public static void main(String[] args) {
		// Used ARM for auto closing of resource BufferReader
		try (BufferedReader reader = new BufferedReader(new FileReader("src\\com\\test\\Q1\\input.dat"));) {
			ArrayList<Merchandise> list = new ArrayList<>();
			String line;

			// Reading File
			while ((line = reader.readLine()) != null) {
				String arr[] = line.split(" ");
				// Adding Merchandise Object in list by splitting lines in tokens
				list.add(new Merchandise(arr[0], Integer.parseInt(arr[1]), Double.parseDouble(arr[2])));
			}

			// Passing Comparator to sort by name
			System.out.println("-----------------------------");
			System.out.println("Items in the Ascending order by the Names");
			Collections.sort(list, new MerchandiseSortByName());
			for (Merchandise m : list) {
				System.out.println(m);
			}
			// Passing Comparator to sort by price
			System.out.println("-----------------------------");
			System.out.println("Items in the Descending order by the Price");
			Collections.sort(list, new MerchandiseSortByPrice());
			for (Merchandise m : list) {
				System.out.println(m);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error occured");
			e.printStackTrace();
		}
	}
}
