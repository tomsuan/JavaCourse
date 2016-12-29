package com.animal.mammal;

public interface Behaviour {
	
	void happy();
	void sad();
	
	/*
	 * you can set default implementation
	 * for a method in Java8 in an interface
	 * this means that a class implementing this
	 * interface does not have to override
	 * the angry() method, see Monkey class
	 */
	default void angry(){
		System.out.println("I am angry");
	}
	/*
	 * static method allowed in Java8, but
	 * you need a body {}
	 */
	public static void statTest(){
		System.out.println("statTest called");
	}

}

interface mood{
	
}

interface inter3{
	
}

class Building{
	
}

class House{
	
}
