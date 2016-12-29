package com.noel;

public class Phone {
	int number;
	String brand;
	/*
	 * this is a method that can take
	 * an array of ints
	 */
	void dial(int[]numbers){
		
	}
	/*
	 * this will not work as int...numbers puts
	 * all your numbers into an array.
	 * so this method signature is exactly the same
	 * as the other dial method. You can't have
	 * two methods with the same signature in the
	 * same class
	 */
	/*void dial(int...numbers){
		
	}*/
	/*
	 * is allowed as the method call is 
	 * overloaded, as the parameters are in
	 * a different order
	 * this call has a int and a double
	 * These two methods will cause an issue
	 * if you pass two ints to the method
	 * as java will be unable to determine
	 * which method to use
	 */
	void call(int num, double dnum){
		
	}
	/*
	 * this call has a double and a int
	 */
	void call(double dnum,int num){
		
	}

}
