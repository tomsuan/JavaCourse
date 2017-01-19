package com.android;
/*
 * an abstract class cannot be instantiated
 * (created), a abstract method can only exist
 * in an abstract class, if ONE method in the 
 * class is abstract then the whole class is
 * abstract
 * however a abstract class can have concrete
 * methods
 */
public abstract class Animal {
	int age;
	//a variable of any type, cannot be abstract
	//abstract String name;
	/*
	 * an abstract method has to be defined with
	 * the keyword "abstract" and it has no
	 * body (no curly brackets{})
	 */
	abstract void happy();
	/*
	 * an abstract class can have concrete
	 * methods
	 */
	void mad(){
		System.out.println("I am a mad animal");
	}
	/*
	 * can't have a concrete method without a body
	 */
	//void angry();
	/*
	 * can't have an abstract method with a body
	 */
	/*abstract void angry(){
		
	}*/
	//a concrete method sad in an abstract class
	void sad(){
		System.out.println("I am a sad Animal");
	}

}

class Dog extends Animal{

	/*every inherited abstract method, has to
	 * implemented in this class.
	 * we have one abstract method in the Animal 
	 * class, happy(), so we implement (override)
	 * the happy method. YOU HAVE TO OVERRIDE
	 * ABSTRACT METHODS
	 */
	@Override
	void happy() {
		System.out.println(" I am a happy Dog");
		
	}
	/*overriding the sad() concrete method from the 
	 * animal class
	 */
	void sad(){
		System.out.println("I am a sad Dog");
	}
	
}
/*
 * when an abstract class inherits from another
 * abstract class that has abstract methods,in 
 * this case the abstract method happy()in 
 * the Animal class it does not HAVE TO implement
 * these methods, but you can if you want
 */
abstract class Reptile extends Animal{
	abstract void bite();
}
abstract class Snake extends Reptile{
	/*Overriding the abstract bite() method
	 * from the Reptile class, YOU DON'T HAVE
	 * TO DO THIS, but you can
	 */
	void bite(){
		System.out.println("snake biting");
	}
}
/*
 * concrete class, so it must implement all abstract
 * methods it inherits, if already not implemented
 */
class RattleSnake extends Snake{

	@Override
	void happy() {
		System.out.println("I am a happy rattleSnake");
		
	}
	
}
