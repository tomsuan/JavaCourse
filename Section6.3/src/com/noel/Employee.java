package com.noel;
/*
 * Develop code that demonstrates the use of
 * polymorphism; including overriding and 
 * object type versus reference type
 */
public class Employee {
	int age=23;
	String name="Tim";
	String pps="999000a";
	
	void earn(){
		System.out.println("Employee earn");
	}
	
	void holiday(){
		System.out.println("Employee holiday");
	}
}

class Accountant extends Employee implements Work{
	String[]qualifications={"CPA","CFA"};

	@Override
	public void clockIn() {
		System.out.println("I am an accountant i do"
				+ " not clock in");	
	}
	
	void earn(){
		System.out.println("Accountant earn");
	}
	
	void fiddleTheBooks(){
		System.out.println("acountant fiddling");
	}
}

class Fireman extends Employee implements Work{

	@Override
	public void clockIn() {
		System.out.println("Fireman Clockin");	
	}
	
	void extinguish(){
		System.out.println("Fireman extinguish");
	}
	
}
