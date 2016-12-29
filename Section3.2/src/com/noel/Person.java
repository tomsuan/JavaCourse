package com.noel;

public class Person {
	static int counter=0;
	int age;
	Person(){
		System.out.println("person Created");
		counter++;
		System.out.println(counter+" people created");
	}
	//second overloaded constructor
	Person(int age){
		this.age=age;
		counter++;
		System.out.println(counter+" people created");
	}
	
	void outOfScope(Person pat){
		/*
		 * this rule ONLY applies to LOCAL VARIABLES
		 * outside curly brackets 'phil' is liable
		 * for garbage collection as we can no longer
		 * access him
		 */
		{	
			Person phil=new Person();
			System.out.println(phil);
		}
		/*
		 * phil is inaccessible from this point onwards
		 * which means phil, is liable for garbage collection
		 */
		//System.out.println(phil);
		
	}
	
	
	

}
