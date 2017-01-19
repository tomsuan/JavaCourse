package com.noel;
/*
 * can't create an instance of a abstract 
 * class, so i can't create a plant, flower 
 * or rose as these are all abstract classes
 * I can create a EnglishRose as this is a
 * concrete class
 */
public abstract class Plant {
	/*
	 * an abstract class does not have to have
	 * any abstract methods, but as soon
	 * as you have an abstract method in a
	 * class then the whole class becomes
	 * abstract
	 */
	int height;
	String name;
	
	void grow(){
		System.out.println("plant growing");
	}
	void shed(){
		System.out.println("plant shed leads");
	}

}

abstract class Flower extends Plant{
	//abstract method has no body
	abstract void pollinate();
}
abstract class Rose extends Flower{
	
}
/*
 * a concrete that extends a abstract class
 * has to implement any abstract methods in
 * that abstract class in our case the 
 * pollinate method in the Flower class
 */
class EnglishRose extends Rose{

	@Override
	void pollinate() {
		// TODO Auto-generated method stub
		
	}
	
}


