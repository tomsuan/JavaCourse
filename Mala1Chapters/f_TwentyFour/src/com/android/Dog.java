package com.android;

public class Dog {
	int age;
	String name;
	double weight;
	
	//Dog constructor
	Dog(int age,String name,double weight){
		this.age=age;
		this.name=name;
		this.weight=weight;
		System.out.println("Dog constructor");
	}
	/*
	 * simple eat method that takes no parameters
	 * and returns nothing
	 */
	void eat(){
		System.out.println("this is a simple eat method");
	}
	/*
	 * overloading
	 */
	void eat(double amount){
		/*
		 * for every kilo i eat, i put on 100 grams
		 * of weight
		 */
		weight=weight+(amount/10);
		System.out.println("my new weight is "+weight);
	}

}
