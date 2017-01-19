package com.android;

public class Dog {
	int age;
	String name;
	double weight;
	//Dog constructor that takes three arguments
	Dog(int age,String name,double weight){
		this.age=age;
		this.name=name;
		this.weight=weight;
		System.out.println("dog constructor "
				+ "with Arguments called");
	}
	
	//this is another overloaded constructor
	//as parameters are in a different order
	Dog(int age,double weight,String name){
		
	}
	//Dog Constructor with no arguments
	Dog(){
		System.out.println("Dog constructor with "
				+ "no arguments called");
	}
	
	void printMe(){
		System.out.println("dogs weight is "+weight);
		System.out.println("dogs age is "+age);
		System.out.println("dogs name is "+name);
	}
	
	void eat(){
		
	}
	
	

}
