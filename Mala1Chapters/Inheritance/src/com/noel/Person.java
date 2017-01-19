package com.noel;

public class Person {
	int age=40;
	String name="mary";
	double weight=34.5;
	double height=2.3;
	
	void eat(){
		System.out.println("Person eating");
	}
	
	void drink(){
		System.out.println("Person drinking");
	}

}

class Employee extends Person{
	double wages=90000;
	int hoursWorked=25;
	@Override
	void eat(){
		System.out.println("employee eating");
	}
	void takeBreaks(){
		System.out.println("employee taking break");
	}
	void calcTax(){
		System.out.println("calculating tax");
	}
}
