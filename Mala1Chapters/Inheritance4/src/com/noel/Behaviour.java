package com.noel;
/*
 * a almost purely abstract class, up to 
 * java 7 it was a purely abstract class, Java 
 * 8 introduces "default" and static methods
 * see Dog class for implementation
 */
public interface Behaviour {
	/*
	 * three abstact methods, a class
	 * IMPLEMENTS a interface, this forces
	 * the class to then create a sad() method
	 * ,a mad() method and a a happy() method
	 */
	void sad();
	void mad();
	void happy();

}
