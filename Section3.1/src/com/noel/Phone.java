package com.noel;

public class Phone {
	/*
	 * two variables with the same name, one is
	 * static, can't be defined in the same class
	 */
	//instance variables
	String name="apple";
	//static variable
	//static String name="Samsung";
	//all our phones are black, class or static variable
	static String colour="Black";
	
	/*
	 * local variables and method parameters can't
	 * be defined with the same name
	 */
	/*
	 * see below method parameter called int number
	 * local variable called int  number
	 */
	/*
	void dialup(int number){
		int number=10;
	}*/
	
	void dialup(){
		/*
		 * local variables with the same name as
		 * the instance or class variables is allowed
		 * this is called shadowing
		 */
		String name="samsung";
		String colour="blue";
	
		System.out.println(name);
		System.out.println(colour);
	}
	
	void call(){
		/*
		 * it has no String name definition in 
		 * its own method, so it will check to 
		 * see if we have intance variables called
		 * name and colour
		 */
		System.out.println(name);
		System.out.println(colour);
	}

}
