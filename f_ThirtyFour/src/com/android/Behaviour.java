package com.android;
/*
 * is a purely abstract class
 */
public interface Behaviour {
	/*
	 * by default all of these methods
	 * are abstract and public
	 * you can implement as many interfaces
	 * as you want
	 */
	public abstract void happy();
	void sad();
	void angry();
	void scared();
	int frustrated(double num,String name);

}
