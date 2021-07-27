package com.practice.assignment2;

import java.util.Scanner;

class Vehical {
	private int numberOfWheel;
	private int numberOfPassenger;
	private int model;
	private String make;

	public Vehical(int numberOfWheels, int numberOfPassengers, int model, String make) {
		this.numberOfPassenger = numberOfPassengers;
		this.numberOfWheel = numberOfWheels;
		this.model = model;
		this.make = make;
	}

	public void display() {
		System.out.println("Details---");
		System.out.println("Make: " + make + " Model: " + model + " number of wheel: " + numberOfWheel
				+ " Number of Passenger: " + numberOfPassenger);

	}
}

class Car extends Vehical {
	private int numberOfDoor;

	public Car(int numberOfWheels, int numberOfPassengers, int model, String make, int numberOfDoor) {
		super(numberOfWheels, numberOfPassengers, model, make);
		this.numberOfDoor = numberOfDoor;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Number of Door: " + numberOfDoor);
	}
}

class Convertible extends Car {
	private boolean isHoodOpen;

	public Convertible(int numberOfWheels, int numberOfPassengers, String make, int numberOfDoor, int model,
			boolean isHoodOpen) {
		super(numberOfWheels, numberOfPassengers, model, make, numberOfDoor);
		this.isHoodOpen = isHoodOpen;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Is the Hood Open: " + isHoodOpen);
	}
}

class SportCar extends Car {
	public SportCar(int numberOfWheels, int numberOfPassengers, int model, String make) {
		super(numberOfWheels, numberOfPassengers, model, make, 2);
	}

	@Override
	public void display() {
		super.display();
	}
}

public class ApplicationVehical {
	public static void main(String[] args) {
		int ch = 5;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the make time");
		String make = scanner.nextLine();
		System.out.println("Enter the model");
		int model = scanner.nextInt();
		System.out.println("Enter the number of wheel");
		int wheel = scanner.nextInt();
		System.out.println("Enter the number of Passengers");
		int passenger = scanner.nextInt();
		do {
			System.out.println("Enter your choice");
			System.out.println("1. Vehical 2. Car 3. Convertible 4. Sport Car 0. Exit");
			int val = scanner.nextInt();
			switch (val) {
			case 1:
				Vehical vehical = new Vehical(wheel, passenger, model, make);
				vehical.display();
				break;
			case 2:
				System.out.println("Enter number of door");
				int door = scanner.nextInt();
				Car car = new Car(wheel, passenger, model, make, door);
				car.display();
				break;
			case 3:
				System.out.println("Enter number of door");
				door = scanner.nextInt();
				System.out.println("Is the hood open");
				boolean isHoodOpen = scanner.nextBoolean();
				Convertible convertible = new Convertible(wheel, passenger, make, door, model, isHoodOpen);
				convertible.display();
				break;
			case 4:
				SportCar sportCar = new SportCar(wheel, passenger, model, make);
				sportCar.display();
				break;
			case 0: System.out.println("Exiting");
					ch = 0;
			default:
				System.out.println("Wrong choice");
				break;
			}

		} while (ch != 0);
		scanner.close();
	}
}
