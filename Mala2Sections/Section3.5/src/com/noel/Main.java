package com.noel;
/**
 * Exam Objective 6.3 Create and overload constructors
 * including impact on default constructors
 * @author noelf
 *
 */
public class Main {
	public static void main(String[]args){
		/*
		 * Dog() is calling the constructor
		 * in the Dog class that takes no arguments
		 * as we have no user defined constructor in
		 * the class, this will use the default no
		 * argument constructor
		 */
		Dog spot=new Dog();
		
		Cat tibbles = new Cat();
		/*
		 * this calls the constructor that takes
		 * an int
		 */
		Cat tomCat=new Cat(12);
		/*
		 * this calls the constructor that takes
		 * an int, a string and a double
		 */
		Cat percy=new Cat(12,"percy",4.5);
		/*
		 * unable to create an elephant as both 
		 * constructors are now private
		 */
		//Elephant ellie=new Elephant();
		Duck donald = new Duck();
		Duck daffy=new Duck(1,"Daffy",3.2);
		
		Donkey trump=new Donkey(70,"Trump",450.2);
		/*
		 * this calls a method called Donkey() which
		 * is in the Donkey class
		 */
		trump.Donkey();
		
		/*
		 * this is going to call constructor 3
		 * which itself calls constructor 2
		 */
		Human hughie=new Human("Hughie",41,67.8,true);
		
		Cow bessie=new Cow();
	}

}
