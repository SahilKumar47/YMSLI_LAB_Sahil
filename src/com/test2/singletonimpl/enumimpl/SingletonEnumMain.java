package com.test2.singletonimpl.enumimpl;

//enum singleton resolve all the problems of reflection, serialization and cloning
//There will always be one instance of the enum hence this is the best way to implement singleton
public enum SingletonEnumMain {
	INSTANCE;
	
	int value;
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
}
