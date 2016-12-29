package com.noel;

public interface Movement {
	/*
	 * by default all methods in an interface
	 * are public and abstract.
	 * so classes implementing the interface
	 * can't make the method any less accessible
	 * so they have to be public as well
	 * see Vehicle class for implementation
	 */
	public abstract void fly();
	void sailing();
	void driving();
	

}
