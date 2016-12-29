package com.noel;

public abstract class Animal {
	
	void breed(){
		System.out.println("Animal Breeding");
	}
	
	void eat(){
		System.out.println("Animal eating");
	}
	
	abstract void drink();

}
/*
 * this class can take the default 
 * implementation for the mad() method,
 * but it does not have too
 */
class Dog extends Animal implements Behaviour{
	int age=45;

	

	@Override
	public void sad() {
		System.out.println("Dog sad");
		int num;
		num=45678;
		
	}
	
	

	@Override
	public void happy() {
		System.out.println("Dog happy");
		
	}
/*
Have to provide a drink method, as this method
is abstract in the Animal class and Dog
extends Animal, so we override it
 */
	@Override
	void drink() {
		System.out.println("dog drinking");
		
	}
	
	void pant(){
		System.out.println("dog panting");
	}
	
}

class Cat extends Animal implements Behaviour{

	@Override
	public void sad() {
		System.out.println("cat sad");
		
	}

	@Override
	public void happy() {
		System.out.println("cat happy");
		
	}
	/*
	 * overriding the default mad() method
	 * in the behaviour interface. YOU DO NOT
	 * have to do this
	 */
	public void mad(){
		System.out.println("cat mad");
	}

	@Override
	void drink() {
		System.out.println("cat drinking");
		
	}
	
	static void statMethod2(){
		System.out.println("not overridden as no conflict");
	}
	
}
