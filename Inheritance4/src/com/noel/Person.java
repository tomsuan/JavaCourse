package com.noel;
/*
 * you cannot create a person as this is
 * an abstract class, so you can't use the 
 * keyword 'new' with Person
 */
public abstract class Person {
	/*
	 * you can have a constructor in 
	 * an abstract class
	 */
	Person(){
		System.out.println("Person constructor");
	}
	/*
	 * an abstract method has no body, curly
	 * brackets {}. it always has to be defined
	 * with the keyword "abstract".
	 * A class becomes abstract as soon as
	 * you create an abstract method in it.
	 * delete the abstract from the class name
	 * and you get a compilation error
	 */
	abstract void eat();
	/*
	 * you can have a concrete method inside
	 * a abstract class
	 */
	void drink(){
		System.out.println("Person Drinking");
	}

}
abstract class Employee extends Person{
	/*
	 * a abstract class does NOT HAVE to have
	 * any abstract methods at all
	 */
	void wages(){
		System.out.println("Employee wages");
	}
	
	abstract void sleep();
}
/*
 * if a concrete class extends a abstract class
 * all abstract methods contained in the chain
 * have to be implemented.
 * it forces the doctor class to create it's 
 * own concrete eat() method and sleep() 
 * method
 */
class Doctor extends Employee{

	@Override
	void eat() {
		System.out.println("Doctor eating");
		
	}

	@Override
	void sleep() {
		System.out.println("Doctor sleep");
		
	}
	
}
