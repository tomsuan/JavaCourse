package com.android;

public abstract class Person {
	int age;
	String name;
	abstract void eat();
}

abstract class Employee extends Person{
	abstract void work();
/*	void eat(){
		System.out.println("I am an employee i eat");
	}*/
}
abstract class Accountant extends Employee{
	abstract void calculate();
}
class forensicAccount extends Accountant{

	@Override
	void calculate() {
		System.out.println("forensic calculates");
		
	}

	@Override
	void work() {
		System.out.println("forensic works");
		
	}

	@Override
	void eat() {
		System.out.println("forensic eats");
		
	}
	
}
