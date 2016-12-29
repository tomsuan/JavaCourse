package com.noel;

public class Vehicle {
	int range;
	String name;
	static int count=0;
	//constructor 1
	Vehicle(){
		super();
		System.out.println("Vehicle blank constructor "
				+ " called");
		count++;
	}
	//constructor 2
	Vehicle(int range,String name){
		this.range=range;
		this.name=name;
		System.out.println("vehicle constructor that "
				+ " takes an int and string called");
		count++;
	}
	
	static void statMethod(){
		System.out.println("statMethod");
	//	System.out.println(name);
	//	System.out.println(this.name);
	}
	static void statMethod2(){
		
	}
}
class Boat extends Vehicle{
	
	Boat(int range,String name){
		super(range,name);
		//super();
		/*
		 * calling the constructor in the vehicle 
		 * class that takes an int and a string
		 */
	//	super(range,name);
	}
	
}
class Car extends Vehicle{
	
	Car(){
		super();
		System.out.println(" Car blank constructor "
				+ " called");
	}	
}

class Ferrari extends Car{
	Ferrari(){
		super();
		System.out.println("Ferrari constructor called");
	}
}
