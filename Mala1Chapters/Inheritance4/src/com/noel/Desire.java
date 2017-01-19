package com.noel;

public interface Desire {
	void hungry();
	void thirsty();
	void procreate();
	//void greedy();
	/*
	 * this is new in Java 8, we are providing
	 * a default implementation for this 
	 * method
	 */
	default void freedom()
	{
		System.out.println("we want Freedom");
	}

}
