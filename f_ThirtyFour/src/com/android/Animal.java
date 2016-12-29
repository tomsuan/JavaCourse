package com.android;

public abstract class Animal {
	double weight;
	int age;
	/*
	 * an abstract method is just the
	 * method signature, it has no body
	 */
	abstract void eat();
	abstract void drink();
	/*
	 * any class that has an abstract in it
	 * has to marked "abstract"
	 */
	/*
	 * an abstract class can have ordinary methods
	 * a concrete class cannot have an abstact method
	 */
	void sleep(){
		System.out.println("I am an animal sleeping");
	}
}
class Dog extends Animal{
	/*
	 * this class inherits from animal class
	 * so it HAS to implement all the abstract
	 * methods in the base class
	 */
		@Override
	void eat() {
		System.out.println("I am a dog i eat");
		
	}

	@Override
	void drink() {
		System.out.println("I am a dog i Drink");
		
	}
}

class Cat extends Animal{

	@Override
	void eat() {
		System.out.println("I am a cat i eat");
		
	}

	@Override
	void drink() {
		System.out.println("I am a cat i drink");
		
	}
	
	void sleep(){
		System.out.println("I am a cat i sleep");
	}
	
}
