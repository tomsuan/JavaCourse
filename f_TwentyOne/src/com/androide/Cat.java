package com.androide;

public class Cat {
	int age;
	String name;
	double weight;
	/*
	 * this is a constructor that takes a
	 * int, a String and a double
	 * it then assigns these values to each one 
	 * of the objects atributes
	 */
	Cat(int myAge,String myName,double myWeight){
		age=myAge;
		name=myName;
		weight=myWeight;
		System.out.println("cat constructor called");
	}

}
