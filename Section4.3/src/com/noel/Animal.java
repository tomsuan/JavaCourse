package com.noel;

public abstract class Animal {
	int age=23;
	void eat(){
		System.out.println("Animal Eating");
	}
	
	abstract void drink();

}
/*
 * every concrete class, HAS to implement the abstract
 * void drink() method
 */
class Monkey extends Animal{
	int iq;

	@Override
	void drink() {
		System.out.println("monkey drinking");
		
	}
	/*
	 * has it's own method climb() which is only 
	 * available to the monkey class
	 */
	void climb(){
		System.out.println("monkey climbing");
	}
	
}

class Hippo extends Animal{

	double swimSpeed;
	@Override
	void drink() {
		System.out.println("hippo drinking");
		
	}	
	void swim(){
		System.out.println("hippo swimming");
	}
}

class Bird extends Animal{
//does it migrate or not
	boolean migratroy;
	@Override
	void drink() {
		System.out.println("Bird Drinking");
		
	}
	
	void fly(){
		System.out.println("bird flying");
	}
	
}
