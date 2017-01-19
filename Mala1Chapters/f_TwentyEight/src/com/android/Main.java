package com.android;

public class Main {

	public static void main(String[] args) {
		//Animal andy=new Animal();
		Dog spot=new Dog();
		//implicitly there
		/*
		 * its taking the object classes implementation
		 * of the toString()method
		 * which just prints out the address
		 */
		//these two lines are exactly the same
		System.out.println(spot.toString());
		System.out.println(spot);
		
		//System.out.println(3*5);
		
		Animal andy=new Animal(23, "andy", 23.5);
		System.out.println(andy);
		

	}

}
