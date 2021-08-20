package com.test2.singletonimpl;

public class SingletonCloneMain {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getSingletonObject();
		//Trying to clone the object
		try {
			singleton.clone();
		}catch (CloneNotSupportedException e) {
			System.out.println("Exception occurred");
			e.printStackTrace();
		}
		//
	}
}
