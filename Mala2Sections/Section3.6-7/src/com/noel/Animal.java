package com.noel;

public class Animal {
	int age;
	String name;
	
	void eat(){
		System.out.println("animal eating");
	}
	
	void drink(){
		System.out.println("Animal eating");
	}
}

class Cow extends Animal{
	/*
	 * this is an example of tightly coupled class
	 */
}
