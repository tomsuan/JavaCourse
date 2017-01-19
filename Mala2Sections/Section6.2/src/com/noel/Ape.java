package com.noel;

public class Ape {
	/*
	 * can't make it less available in a 
	 * derived class when it is overriden
	 */
	public void eat(){
		System.out.println("ape eating");
	}	
	protected void drink(){
		System.out.println("ape drinking");
	}	
	void breed(){
		System.out.println("ape breeding");
	}
	/*
	 * can't override this in a derived class
	 * as its only available inside the Ape
	 * class. can't inherit a private
	 * method or variable
	 */
	private void sleep(){
		System.out.println("ape sleeping");
	}

}

class Human extends Ape{
	/*
	 * this is a brand new method, not 
	 * overriden and no relationship with teh
	 * sleep method in the Ape class
	 */
	//NOT OVERRIDEN
	private void sleep(){
		
	}
	/*
	 * this method has default level access
	 * which is less accessible than the 
	 * public eat() method in the Ape class.
	 * a overriden method CANNOT be LESS accessible
	 * in a derived class
	 */
/*	void eat(){
		
	}*/
/*	protected void eat(){
		
	}
	private void eat(){
		
	}*/
	/*
	 * can only be public
	 */
	public void eat(){
		
	}
	
/*	private void drink(){
		
	}*/
	
/*	void drink(){
		
	}*/
	/*
	 * this is allowed as it has the same
	 * access level as drink() in the Ape 
	 * class
	 */
/*	protected void drink(){
		
	}*/
	/*
	 * this is allowed as it can be MORE
	 * accessible
	 */
	public void drink(){
		
	}
	/*
	 * all these three access levels work
	 * as we are overridding breed() in the 
	 * Ape class, so can take its own level
	 * and a access level that is more 
	 * available
	 */
	//void breed(){}
	//protected void breed(){}
	public void breed(){}
	
	
}
