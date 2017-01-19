package com.building;

public class Animal {
	private int age=12;//available only in the class
	public String name="spot";//available everywhere
	double weight=34.5;//default, available only in same package
	/*
	 * available in same package and derived classes
	 * under certain circumstances
	 */
	protected double height=5.2;
	protected static int id=1;
	protected boolean sex=true;
	//this method is available to all other classes and interfaces
	public void run(){
		System.out.println("I am an animal running");
	}
	/*
	 * make your getters and setter public so
	 * they can be available to all classes
	 */
	//getter for private variable age
	public int getAge(){
		return age;
	}
	//setter if for changing the age of the animal
	public void setAge(int age){
		this.age=age;
	}

}
