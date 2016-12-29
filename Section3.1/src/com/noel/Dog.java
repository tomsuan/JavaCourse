package com.noel;

public class Dog {
	String name;
	/*
	 * this is the age for your dog
	 * every dog has its own copy of
	 * age
	 */
	int age;
	/*
	 * this is the weight of your dog
	 * every Dog has its own copy of
	 * weight
	 */
	double weight;
	/*
	 * we are going to assume that every dog 
	 * created belongs to the same.
	 * this pack is identified by its packId
	 */
	static int packId=90;

	/*
	 * instance method, every dog has its own
	 * copy of this method
	 * you will be able to access the weight,
	 * the name and age of each Dog and also
	 * the packId
	 */
	void eat(){
		System.out.println("before i eat i weigh"
				+ " "+weight);
		weight=weight*2;
		System.out.println("after i eat i weigh"
				+ " "+weight);
		
	}
	/*
	 * this method applies to the pack of dogs
	 * so it applies to ALL Dogs, not just each
	 * individual Dog, so there is'nt a variable 
	 * called age to access the age of all dogs, as
	 * every dog has a different age, similar for 
	 * name, similar for weight. this why you can't 
	 * access instance variables in a static method
	 */
	static void hunt(){
		System.out.println("on the hunt with "+packId);
		
	}

}
