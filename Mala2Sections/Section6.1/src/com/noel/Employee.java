package com.noel;
/*
 * benefit 1
 * Smaller derived classes, we only need
 * to concentrate on what is unique to a
 * particular derived class
 * benefit 2
 * Ease of modification to common properties
 * and behaviour
 * benefit 3 Extensibility 
 * Code that works with the base class in 
 * a hierarchy tree can work with all classes
 * that are added using inheritance later
 * Benefit 4
 * Use tried and tested code from a base class
 * if something works in the base class
 * re-use, e.g connecting to a database
 * benefit 5
 * Concentrate on the specialised behaviour 
 * of your classes
 * benefit 6 Logical structures and grouping
 */
public class Employee {
	/*
	 * it's available to all classes
	 */
	public int age=23;
	/*
	 * default or package level, it's 
	 * available only if in same package
	 */
	String name="tony";
	/*
	 * available only in same class
	 */
	private int phoneNumber=9877665;
	/*
	 * available in same package and in #
	 * derived classes no matter where that 
	 * derived class is
	 */
	protected String email="me@you.com";
	
	public Employee(){
		
	}
	
	Employee(String name){
		this.name=name;
	}
	
	/*
	 * we modified the Employee to have a pps
	 * number, that means that every employee
	 * of every type will now have a pps
	 * number. If we did not inherit we would
	 * have to define the pps in every class
	 */
	String pps;
	/*
	 * all these methods and variables
	 *  are also available to the subclasses
	 */
	void earn(){
		System.out.println("Employee earn");
	}	
	void work(){
		System.out.println("Employee work");
	}
	/*
	 * this can take a secretary, a fireman
	 * and a Oil Rig Fireman
	 */
	void sendInvitation(Employee emp){
		System.out.println("name is "+emp.name);
		
	}
	
	public void someMethod(){
		
	}
	protected void proMethod(){
		
	}
	
}

class Secretary extends Employee{
	int WordsPerMinute;
	
	void fileAway(){
		System.out.println("Secretary filing");
	}
	
	void type(){
		System.out.println("Secretary typing");
	}
}

class Fireman extends Employee{
	String safetyQualifications;
	
	void rescue(){
		System.out.println("Fireman rescue");
		
	}
	
	void extinguish(){
		System.out.println("fireman extinguish");
		
	}
}

class OilRigFireman extends Fireman{
	/*
	 * specialised behaviour for only oil rig
	 * fireman
	 */
	void swim(){
		System.out.println("swimming");
	}
}
