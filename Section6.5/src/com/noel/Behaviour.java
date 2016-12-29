package com.noel;

public interface Behaviour {
	int finalInt=34;
	default void happy(){
		System.out.println("I am happy");
	}
	
	void sad();
	void angry();
	/*
	 * can use 'this' in an interface, but you can
	 * only use it inside default methods
	 */
	default void callThis(){
		System.out.println(this.finalInt);
		System.out.println("without this "+finalInt);
		//can call other default methods
		this.happy();
		//can call other abstract methods
		this.sad();
		angry();
		//can call the object itself
		System.out.println(this);
	}
	

}
