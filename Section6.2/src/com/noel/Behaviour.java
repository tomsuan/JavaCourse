package com.noel;

public interface Behaviour {
	
	//no body, abstract method
	void sad();
	/*
	 * by default this methods is public 
	 * and abstract
	 */
	public abstract void happy();
	/*
	 * you have to provide implementation 
	 * {curly brackets must be included} with
	 * the keyword default
	 */
	default void mad(){
		System.out.println("I am mad");
	}
	


}
