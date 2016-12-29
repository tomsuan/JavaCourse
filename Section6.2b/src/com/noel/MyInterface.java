package com.noel;

public interface MyInterface {
	
	void fly();
	void walk();
	default void run(){
		System.out.println("MyInterface run");
	}
	//statics dont' cause any issues

}
interface interface2 {
	void fly();
	default void run(){
		System.out.println("interface2 run");
	}
	
}

interface interface3 extends interface2,
MyInterface{
	void fly();
	/*
	you have to give a default implementation
	to run() in this interface as both 
	interface2 and MyInterface both have 
	default run() methods and java can't tell
	which one to use
	 */
	default void run(){
		System.out.println("interface3 run");
		/*
		 * can use super but in this case
		 * you need to tell java which interface
		 * default method to use
		 */
		interface2.super.run();
		MyInterface.super.run();
	}
	
}
