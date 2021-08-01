package com.practice.assignment4.Q3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class RecoverSer {
	public static void main(String[] args) {
		try (ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream(new File("C:\\Users\\ve00ym269\\Desktop\\employee.ser")));) {

			Employee employee = (Employee) ois.readObject();
			employee.display();
			ois.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
