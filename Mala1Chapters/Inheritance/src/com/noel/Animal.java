package com.noel;

public class Animal{
	int age=10;
	String name="Kevin";
	double weight=15.5;
	
	void eat(){
		System.out.println("Animal eating");
	}
	
	void drink(){
		System.out.println("Animal drinking");
	}
	
	void run(){
		System.out.println("Animal running");
	}
	
	void sleep(){
		System.out.println("Animal sleeping");
	}

}

class Dog extends Animal{
	String owner="donald";
	String colour="orange";
	boolean sex=false;
	//dog's method breed
	void breed(){
		System.out.println("Dog breeding");
	}
	//dog's method pants
	void pants(){
		System.out.println("Dog panting");
	}
	/*
	 * this is overriden as it has the same method
	 * signature as the eat() method in the 
	 * Animal class (void eat())
	 */
	@Override
	void eat()
	{
		System.out.println("Dog eating");
	}
	/*
	 * this is overloaded as it has a different
	 * list of variables, it takes a num instead of
	 * nothing.
	 * it is important to note that java treats this
	 * eat method as a totally different method
	 * to the other eat method which takes no
	 * variables
	 */
	void eat(int num){
		System.out.println("overloaded eat method");
	}
	
}

class Setter extends Dog{
	String prize="cruffs";
	
	void prance(){
		System.out.println("setter prancing");
	}
	
	void drink(){
		System.out.println("setter drinking");
	}
}