package com.noel;

public class Fish {	
	int age;
	double weight;
	/*
	 * a constructor that just takes an age of a 
	 * fish
	 */
	Fish(int age){
		/*
		 * calls the Fish()constructor that 
		 * takes no arguments
		 */
		this();
		this.age=age;
	}
	/*
	 * you can call another constructor in the same
	 * class by using the keyword "this". in this
	 * example we are calling a constructor that
	 * takes an int. a call to another constructor
	 * has to be on the first line in a constructor
	 * same rule as super()
	 */
	Fish(int age,double weight){
		this(age);
		/*
		 * can only have one call to a constrcutor
		 * inside a constructor
		 */
	//	this();
		this.weight=weight;
	}
	Fish(){
		/*
		 * a comment is the only thing that can go
		 * before a call to the super()
		 */
		super();
		System.out.println("Fish Constructor");
	}
}/*
when you create a sub class object, there is a call
first to the superclass constructor
*/
class Shark extends Fish{
	Shark(){
		/*
		 * calling the super constrcutor that takes
		 * no arguments, this is implicitly the 
		 * first line in your constructor
		 */
		super();
		System.out.println("Shark Constructor");
	}	
}
class GreatWhite extends Shark{
	GreatWhite(){
		super();
		System.out.println("Great White Constructor");
	}
	
}
