package com.android;

public class Main {

	public static void main(String[] args) {
		/*
		 * this uses the no argument constructor
		 */
		Dog spot=new Dog();
		/*
		 * this uses the constructor that takes
		 * three arguments, an int, a String and
		 * a double
		 */
		Dog rex=new Dog(2,"rex",4.5);
		rex.printMe();
		
		

	}

}
