package com.android;
/*
 * our person class
 */
public class Person {
	//instance variables for Person
	int age;
	String name;
	double weight;
	double height;
	/*
	 * has no return type
	 * has not parameters
	 */
	void printMe(){
		System.out.println("your name is "+name);
		System.out.println("your age is "+age);
		System.out.println("your weight is "+weight);
		System.out.println("your height is "+height);	
	}
	/*
	 * if percy eats 1 kg of food, he puts on
	 * 10 grams of weight
	 */
	void eat(double amount){
		weight=weight+(amount/100);
	}
	/*
	 * for every KM i run, I lose 10 grams
	 * of weight
	 */
	void run(double distance){
		weight=weight-(distance/100);
	}

}
