package com.noel;

public class Donkey {
	int age;
	String name;
	double weight;
	
	
	/*
	 * initialiser blocks
	 * these always implement before the constructor
	 * and they implement in the order they are in
	 * the class
	 */
	{
		System.out.println("first initialiser called");
	}
	public Donkey(int age, String name, double weight) {
		super();
		this.age = age;
		this.name = name;
		this.weight = weight;
		System.out.println("Donkey constructor called");
	}
	{
		System.out.println("second initialiser called");
	}
	
	Donkey(){
		
	}
	/*
	 * this is not a constructor, this is a method
	 * called Donkey
	 * because a constructor has NO RETURN type
	 */
	void Donkey(){
		System.out.println("this is not a constructor");
	}

}
