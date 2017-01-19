package com.noel;

public class Animal {
	
	int eat(){
		
		return 0;	
	}
	/*
	 * this is an overloaded method
	 * as this eat method has a different parameter
	 * list, this takes and int but the above takes
	 * no parameters. RETURN TYPE DOES NOT MATTER
	 */
	void eat(int num){
		
	}
	/*
	 * overloaded method that takes a double and 
	 * an int
	 */
	int eat(double dnun,int num){
		
		return 0;
	}
	/*
	 * access modifer protected DOES NOT MATTER
	 * RETURN TYPE DOES NOT MATTER
	 */
	protected void eat(String str,int num){
		
	}
	/*
	 * different orders also works
	 * this is private so only available inside
	 * the animal class
	 */
	private void eat(int num, String str){
		
	}
	
	void drink(){
		System.out.println("animal Drinking");
	}
	
/*	void drink(){
		
	}*/
}

class Dog extends Animal{
	/*
	 * overloaded the drink method in the Animal class
	 */
	void drink(int num){
		
	}
	/*
	 * overriding the drink()method in the Animal
	 * class that has no parameters
	 */
	void drink(){
		System.out.println("Dog drinking");
	}
}
