package com.noel;

public class Animal {
	Animal(){
		System.out.println("animal constructor called");
	}

}

class Cow extends Animal{
	Cow(){
		/*
		 * calls the animal constructor first
		 * implicitly
		 */
		super();
		System.out.println("Cow constructor called");
	}
}
