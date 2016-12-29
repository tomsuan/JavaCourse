package com.noel;

public interface Swim {
	//void swimSpeed();
	//boolean breatheUnderWater();
	
	static void statMethod(){
		System.out.println("swim statmethod");
	}
	
	/*
	 * if we change the static to a default
	 * it cannot work in the calling fish class
	 * as you can't call a default method in
	 * a static way
	 */
/*	default void statMethod(){
		System.out.println("swim statmethod");
	}*/
	/*
	 * this will not work as this is an 
	 * abstract method and there is no 
	 * implementation for this method in the
	 * fish class
	 */
//	void statMethod();
	
	void swimSpeed();
	/*
	 * this works fine, as we are overriding
	 * the swimSpeed method in the fish class
	 * and you can override a default method
	 */
/*	default void swimSpeed(){
		System.out.println("swim swimspeed");
	}*/
	/*
	 this will compile but the two swimSpeed
	 methods have no relationship
	 */
/*	static void swimSpeed(){
		System.out.println("swim swimspeed");
	}*/
	
/*	default void defMethod(){
		System.out.println("swim defMethod");
	}*/
	
//	void defMethod();
	//won't cause a compilation error
	//but we have to call it a static
	static void defMethod(){
		System.out.println("swim defMethod");
	}

}
