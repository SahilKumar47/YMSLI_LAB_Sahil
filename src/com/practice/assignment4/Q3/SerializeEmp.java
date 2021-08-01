package com.practice.assignment4.Q3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private String id;
	transient private double salary;

	public Employee(String name, String id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public void display() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [name=");
		builder.append(name);
		builder.append(", id=");
		builder.append(id);
		builder.append(", salary=");
		builder.append(salary);
		builder.append("]");
		return builder.toString();
	}

}

public class SerializeEmp {
	public static void main(String[] args) {
		Employee employee = new Employee("Sahil", "YM269", 50000);
		try (ObjectOutputStream oss = new ObjectOutputStream(
				new FileOutputStream(new File("C:\\Users\\ve00ym269\\Desktop\\employee.ser")));) {

			oss.writeObject(employee);
			System.out.println("success");
			oss.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
