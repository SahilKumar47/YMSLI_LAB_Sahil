package com.test2.singletonimpl;

import java.io.Serializable;

class Singleton implements Cloneable, Serializable {

	//Created static reference 
	private static volatile Singleton singletonObject = null;

	//Private constructor restricting the class to itself
	private Singleton() {}
	//double locking mechanism resolved 
	public static  Singleton getSingletonObject() {

		if (singletonObject == null){
			//Thread safe and lazy initialization
		synchronized(Singleton.class)
		{
			if (singletonObject== null)
			{
				System.out.println("getInstance(): First time getInstance was invoked!");
				singletonObject = new Singleton();
			}
		}            
	}

	return singletonObject;

	}
	//Prevent from cloning the object

	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	//preventing serialization
	protected Object readResolve() {
		return singletonObject;
	}

}