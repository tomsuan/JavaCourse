package com.noel;

public interface Movement {
	/*
	 * in java 8 two new features were introduced
	 * to interfaces, first feature is setting
	 * a default method in an interface
	 */
	//this is a standard abstract method
	void walk();
	/*
	 * when defining a default method in an interface
	 * you have to use the keyword default, and you
	 * have to give the method a body{}
	 * when you define a default method in a 
	 * interface, you do not have to override it
	 * in the implementing class
	 */
	default void run(){
		System.out.println("I am running");
	}

}
