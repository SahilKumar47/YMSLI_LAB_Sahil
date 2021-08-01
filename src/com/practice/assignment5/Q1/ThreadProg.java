package com.practice.assignment5.Q1;

class GenThread implements Runnable {
	String threadName;
	Thread thread;
	
	public GenThread(String threadName) {
		this.threadName = threadName;
		thread = new Thread(this, this.threadName);
		System.out.println("Thread Started: " + thread);
		thread.start();
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i <= 100; i++) {
				System.out.println(threadName + ": " + i);
				Thread.sleep(100); // for concurrent execution of all the threads
			}
		} catch (Exception e) {
			System.out.println("Interruption occured in " + threadName);
		}
		System.out.println("Thread Terminated:" + threadName);
	}

}

public class ThreadProg {
	public static void main(String[] args) {
		new GenThread("Thread One");
		new GenThread("Thread Two");
		new GenThread("Thread Three");
	}
}
