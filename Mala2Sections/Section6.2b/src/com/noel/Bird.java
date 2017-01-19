package com.noel;
/*
 * when you have abstract methods of the 
 * same name in extended interfaces there 
 * is no conflict
 */
public class Bird implements interface3,
interface2{

	@Override
	public void walk() {
		System.out.println("Bird walking");
		
	}

	@Override
	public void fly() {
		System.out.println("Bird flying");
		
	}

	

}
