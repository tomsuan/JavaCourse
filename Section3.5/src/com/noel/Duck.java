package com.noel;

public class Duck {
	int age;
	String name;
	double weight;
	public Duck(int age, String name, double weight) {
	
		System.out.println("duck constructor that "
				+ "takes an int, a string and a double");
		this.age = age;
		this.name = name;
		this.weight = weight;
	}
	
	Duck()
	{
		System.out.println("no argument constrcutors");
	}
	/*
	 * also a valid overloaded constructor
	 */
	Duck(String name, double weight, int age){
		System.out.println("takes a string, double and int");
		
	}

}
