package com.noel;
/*
 * can't create an instance of this class
 * , you can't use the new keyword
 * if you have an abstract method in your class
 * the class then has to be abstract
 */
public abstract class Person {
	/*
	 * an abstract method has no body {}
	 * and you have to use the keyword
	 * abstract
	 */
	abstract void eat();
	
	void angry(){
		System.out.println("Person angry");
	}

}
/*
 * the Employee class has to implement all
 * the abstract methods in the Person class, because
 * Employee extends Person
 * this is a concrete class, a non abstract class
 * is a concrete class.
 * If a concrete class extends a abstract class
 * implementation for all the the abstract methods
 * must be provided
 */
class Employee extends Person{

	@Override
	void eat() {
		// TODO Auto-generated method stub
		
	}
	
}

class Accountant extends Employee{
	
}
