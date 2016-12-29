package com.noel;

public class Examples {
	static void ex1(){
		/*
		 * abstract methods in a interface
		 * HAVE TO BE OVERRIDEN in a 
		 * implementing CONCRETE class.
		 * Default methods DO NOT HAVE TO
		 * be overriden in a implementing 
		 * concrete class, BUT THEY CAN
		 * Static methods are not overriden 
		 * in an implementing class. 
		 * they can't be. see Test and 
		 * interface1
		 * 
		 */
	}
	static void ex2(){
		/*
		 * a class can implement several interfaces
		 * but only if it follows certain rules
		 */
		Athlete andy=new Athlete();
		/*
		 * Athlete class implements both Jumpable and Moveable and both
		 * have a called min, one is a string, one is an int
		 * to access them we have to go Jumpable.min or Moveable.min
		 */
		andy.getValues();
		System.out.println(Jumpable.min);
		
	}

}
