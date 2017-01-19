package com.android;

public class Animal {
	int age;
	String name;
	double weight;
	//blank animal constructor
	
	Animal(){
		System.out.println("Animal Constructor called");
	}
	public Animal(int age, String name, double weight) {
		//super();
		this.age = age;
		this.name = name;
		this.weight = weight;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Animal age is" + age + ", name=" + name + ", weight=" + weight + "]";
	}
	
	/*
	 * this is a method in the object class that
	 * attempts to print out the details of an
	 * object. we are overriding this method
	 * in the animal class
	 */
	
	
	
	
	
	

}

class Dog extends Animal{
	//blank Dog Constructor
	Dog(){
		super();//using the Animal constructor
		System.out.println("Dog Constructor called");
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
}
