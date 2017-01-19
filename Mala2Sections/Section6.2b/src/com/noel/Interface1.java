package com.noel;

public interface Interface1 {
	//abstract method
	public void testMethod();
	//static method
	static void statMethod(){
		System.out.println("interface1"
				+ " statMethod");
	}
	//default method
	default void defMethod(){
		System.out.println("defmethod");
	}
	
	

}
