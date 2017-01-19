package com.noel;

public class Employee {
	int age=23;
	String name="tim";
	/*
	 * you can only have one call to another 
	 * constructor inside a constructor
	 * it has to be the first statement inside
	 * a constructor
	 */
	Employee(){
		System.out.println("blank employee "
				+ "constructor called");
	}

	public Employee(int age, String name) {
		System.out.println("constructor that takes "
				+ " an int and a string called");
		this.age = age;
		this.name = name;
	}
	
	Employee(int age){
		//can't have two constructor calls
	//	this();
		/*
		 * can't have code before a call to 
		 * another constructor
		 */
	//	System.out.println();
		this(age,"patsy");
		System.out.println("Constructor that takes an"
				+ " int called");
	}
	
	void earn(){
		System.out.println("earn money");
	}
	
	void duties(){
		this.earn();
		//is the same as
		earn();
		//these are exactly the same
		System.out.println("age is "+age);
		System.out.println("age is "+this.age);
		System.out.println(this);
	}
	
	

}

class Accountant extends Employee implements Behaviour{
	int age=56;
	String name="mary";
	@Override
	public void sad() {
		System.out.println("Accountant sad");
		
	}
	@Override
	public void angry() {
		System.out.println("Accountant angry");
		
	}
	
}
