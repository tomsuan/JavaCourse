package com.noel;

public class Animal {
	int age;
	/*
	 * adding a name has to be done for 
	 * all classes
	 */
	String name;
	void eat(){
		
	}
	/*
	 * this method can ONLY take an Animal
	 * object, it CAN'T take a Dog object
	 * as there is no relationship between the 
	 * two classes
	 */
	void takeAnimal(Animal myAnimal){
		System.out.println(myAnimal.age);
	}

}

class Dog{
	int age;
	String name;
	void eat(){
		
	}
}
