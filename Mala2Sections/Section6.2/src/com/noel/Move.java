package com.noel;

public interface Move {
	void landBased();

}
/*
 * run inherits from the Move Interface
 * so that means that any class that 
 * implments the Run interface, also has
 * to implement all the methods in the Move
 * interface
 */
interface Run extends Move{
	/*
	 * all variables in a interface are
	 * public static final by default
	 */
	public static final int finalNum=123345;
	int finalInt=67;
	void runSpeed();
	
}
