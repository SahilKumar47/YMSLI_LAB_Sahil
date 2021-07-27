package com.practice.assignment2.banking;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		System.out.println("Welcome to Bank");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the user name");
		String memberName = scanner.nextLine();
		int val, x = 5;
		do { 
			System.out.println("Choose account type 1. Savings 2. Current 0. Exit");
			val = scanner.nextInt();
			switch (val) {
			case 1:
				System.out.println("Welcome to savings account");
				System.out.println("Enter the initial balance (min 500)");
				double bal = scanner.nextDouble();
				if (bal < 500)
					System.out.println("Minimum balance must be over 500");
				else {
					System.out.println("Enter maximum amount can be withdraw at once");
					int maxAmt = scanner.nextInt();
					SavingsAccount acc = new SavingsAccount(memberName, bal, maxAmt);
					int ch = 5;
					do {
						System.out.println("Press 1. Deposite 2. Withdraw 3. View Balance 0. Exit");
						int val2 = scanner.nextInt();
						switch (val2) {
						case 1:
							System.out.println("Enter the amount");
							double amt = scanner.nextDouble();
							acc.deposit(amt);
							break;
						case 2:
							System.out.println("Enter the amount to withdraw");
							amt = scanner.nextDouble();
							acc.withdraw(amt);
							break;
						case 3:
							System.out.println(acc.getBalance());
							break;
						case 0:
							ch = 0;
							break;
						default:
							System.out.println("Wrong Choice");
							break;
						}
					} while (ch != 0);

				}
				break;
			case 2:
				System.out.println("Welcome to current account");
				System.out.println("Enter the initial balance");
				bal = scanner.nextInt();
				System.out.println("Enter the trader License number");
				int Lnum = scanner.nextInt();
				CurrentAccount acc = new CurrentAccount(Lnum, memberName, bal);
				int ch = 5;
				do {
					System.out.println("Press 1. Deposite 2. Withdraw 3. View Balance 0. Exit");
					int val2 = scanner.nextInt();
					switch (val2) {
					case 1:
						System.out.println("Enter the amount");
						double amt = scanner.nextDouble();
						acc.deposit(amt);
						break;
					case 2:
						System.out.println("Enter the amount to withdraw");
						amt = scanner.nextDouble();
						acc.withdraw(amt);
						break;
					case 3:
						System.out.println(acc.getBalance());
						break;
					case 0:
						ch = 0;
						break;
					default:
						System.out.println("Wrong Choice");
						break;
					}
				} while (ch != 0);
				break;
			case 0:
				x = 0;
				break;
			default:
				System.out.println("Wrong choice");
				break;
			}
		} while (x != 0);
		scanner.close();
	}
}
