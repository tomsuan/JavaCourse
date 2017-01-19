package com.android;
/*
 * base class or super class Animal
 */
public class Animal {
	//all animals have a weight
	double weight=3.4;
	//all animals have an age
	int age=5;
	//all animals eat
	void eat(){
		System.out.println("I am an animal eating");
	}
	//all animals move
	void move(){
		System.out.println("I am an animal moving");
	}
	//all animal reproduce
	void reproduce(){
		System.out.println("I am an animal reproducing");
	}
	//method to print our variables
	void printMe(){
		System.out.println("age of animal is "+age);
		System.out.println("weight of animal is "+weight);
	}
	/*
	 * base class breathe method, all animals inherit
	 * this
	 */
	int breathe(String name,double bp){
		System.out.println("An Animal breathing");
		return 0;
	}
}
/*
 * this is a cow class that inherits from
 * the animal class
 */
class Cow extends Animal{
	
}
/*
 * derived class or sub class Shark
 */
class Shark extends Animal{
	//overriding the base class Animals eat() method
	void eat(){
		System.out.println("A shark eats by Attacking "
				+ " its prey");	
	}
	//its own method attack()
	void attack(){
		System.out.println("i attack by huge bites");
	}
	//overriden breathe()method
	int breathe(String var1,double var2){
		System.out.println("A shark breathes in water");
		return 0;
	}
}

class Fly extends Animal{
	/*
	 * overriden eat method, the method signatures
	 * have to be the same
	 * the return type, the name, and parameter list
	 * have to match
	 */
	void eat(){
		System.out.println("I am a fly eating i eat by"
				+ " regurgitated my food");
	}
}

class Swan extends Animal{
	
	void eat(){
		System.out.println("I am a swan eating");
	}
}

class Sheep extends Animal{
	void eat(){
		System.out.println("I am a Sheep eating");
	}
}

class Pig extends Animal{
	
	void eat(){
		System.out.println("I am a pig eating");
	}
}


