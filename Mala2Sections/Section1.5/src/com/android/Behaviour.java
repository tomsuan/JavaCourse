package com.android;
/*
 * an interface is a purely abstract class
 * 
 */
public interface Behaviour {
	/*
	 * a class implements a interface, this
	 * class then has to OVERRIDE all the 
	 * methods of the interface. all methods
	 * in an interface are public and abstract
	 * by default, so they have no body
	 */
	void jealous();
	void anger();
	public abstract void joy();
	/*
	 * with java 8 you can provide default
	 * implementation for methods
	 */
	default void nervous(){
		System.out.println("I am nervous");
	}

}

interface Mood extends Behaviour{
	
	Void cranky();
}
