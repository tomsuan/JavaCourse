package com.noel;
/*
 * Multiple inheritance is not allowed in 
 * Java, however a class can implement as 
 * many interfaces as you want
 */
public class Duck implements Fly,Swim{

	@Override
	public void calcSwimSpeed() {
		System.out.println("Duck swimming");
		
	}

	@Override
	public void calcFlightSpeed() {
		System.out.println("Duck flying");
		
	}

}
