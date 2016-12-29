package com.noel;
/*
 * multiple inheritance is not allowed in java
 * but multiple implementation of interfaces
 * is allowed
 */
public class Cat implements Behaviour,Desire
{
	int age=23;
	double weight=45.6;
	/*
	 * did not get these from the interface
	 * they are defined only in the Cat class
	 */
	void cranky(){
		System.out.println("Cat cranky");
	}
	void evil(){
		System.out.println("cat evil");
	}

	@Override
	public void hungry() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void thirsty() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void procreate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sad() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mad() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void happy() {
		// TODO Auto-generated method stub
		
	}

}
