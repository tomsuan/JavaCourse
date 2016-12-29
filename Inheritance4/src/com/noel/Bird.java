package com.noel;

public class Bird {
	int age=23;
	boolean flight=false;
	void eat(){
		System.out.println("bird eating");
	}
	
	void drink(){
		System.out.println("bird drinking");
	}
}

class Domestic extends Bird{
	double weight =12.5;
	//overriden from the Bird class
	void eat(){
		System.out.println("Domestic eating");
	}
	/*
	 * this is a method in the domestic class
	 */
	void peck(){
		System.out.println("Domestic pecking");
	}
	
}

class Chicken extends Domestic{
	int eggAmount=4;
	/*
	 * overriding the drink() method from
	 * the bird class
	 */
	void drink(){
		System.out.println("chicken drinking");
	}
	/*
	 * overriding the peck() method from the
	 * domestic class
	 */
	void peck(){
		System.out.println("chicken pecking");
	}
	/*
	 * this is a method unique to the chicken
	 * class
	 */
	void lay(){
		System.out.println("chicken laying");	
	}
}
