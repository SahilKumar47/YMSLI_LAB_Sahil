package com.practice.assignment5.Q2;

import java.util.Random;

class AddSum implements Runnable {
	int sum;
	
	public AddSum(int sum) {
		this.sum = sum;
		
	}
	
	
	@Override
	public void run() {
		this.addRandomVal();
		
	}
	
	public void addRandomVal() {
		Random random = new Random();
		int num = random.nextInt(10) + 1;
		System.out.println("Number generated: " + num);
			sum += num;
	}
}


public class ThreadProg2 {
	public static void main(String[] args) {
		AddSum add = new AddSum(0);
		Thread thread1 = new Thread(add);
		Thread thread2 = new Thread(add);
		Thread thread3 = new Thread(add);
		Thread thread4 = new Thread(add);
		Thread thread5 = new Thread(add);
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		
		try {
	        thread1.join();
	        thread2.join();
	        thread3.join();
	        thread4.join();
	        thread5.join();
	    } catch (InterruptedException e) {
	    	System.out.println("Interruption Occured");
	        e.printStackTrace();
	    }
		System.out.println("Total Sum: " + add.sum);
	}
}
