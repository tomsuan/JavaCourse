package com.noel;

public class Athlete implements Jumpable,Moveable{
	
	void getValues(){
		/*
		 * can't do this as we don't know which min
		 * to call
		 */
	//	System.out.println(min);
		//preface the variable with the interface name
		System.out.println("jumpable "+Jumpable.min);
		System.out.println("movable "+Moveable.min);
		/*
		 * can access the name variable directly in
		 * the Jumpable interface
		 */
		System.out.println("name in interface is "+name);
	}

}
