package com.noel;

public class Ape {
	int age;
	String name;
	Ape(){
		/*
		 * can't include multiple calls to
		 * different constructor, can only be one
		 * at start of constructor
		 */
		//this(10);
		//this("magilla");
		//this();
		/*
		 * recursive calls (call to itself) are not
		 * allowed for constructor in java
		 */
		//this();
		System.out.println("Ape Constructor called");
	}
	
	Ape(int age)
	{/*
	calling the constructor that takes no arguments
	*/
		this();
		
	}
	Ape(String name){
		this();
	}
	
	void eat(){
		new Ape();
	}
}
