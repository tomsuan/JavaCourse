package com.noel;

public interface InterfaceTypes {
	//abstract method
	/*
	 * an abstract method has no body
	 */
	void method1();
	/*
	 * an abstract can have the keyword
	 * abstract, but it does not have too as
	 * it's included by default, even if you
	 * can't see it
	 */
	abstract void method2();
	/*
	 * any class implementing this interface
	 * has to provide implementation for
	 * method1() and method2()
	 */
	
	/*
	 * default methods can sometimes be called
	 * Defender or virtual extension methods
	 * a default method ALWAYS has a body
	 */
	default void defMethod1(){
		System.out.println("defMethod1");
	}
	/*
	 * any implementing class can choose whether
	 * it wants to provide it's own implmentation
	 * or use the default implementation
	 */
	
	static void statMethod(){
		System.out.println("our static method");
	}
	
	void takeApe(Ape magilla);
	
	Ape returnApe(Ape magilla);

}
