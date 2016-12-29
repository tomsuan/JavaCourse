package com.noel;
/**
 * Create methods with arguments and return values
 * ; including overloaded methods
 * @author noelf
 *Overloaded method is a method that has the same name
 *but a different parameter list or different order
 *of parameters
 */
public class Main {
	public static void main(String[]args){
		Animal myAnimal=new Animal();
		/*
		 *println() is an overloaded method that
		 *can take any data type and any object
		 */
		System.out.println(myAnimal);
		Dog spot=new Dog();
		spot.drink();
		double dnum=2;
		int num=3;
		Phone samsung=new Phone();
		samsung.call(dnum, num);
		/*
		 * this will not work, as it can't 
		 * determine which call method to use
		 * as one takes a double and an int
		 * the other takes a int and a double
		 * and 2 and 3 could be passed to either
		 * call() method
		 */
		//samsung.call(2, 3);
		Message myMessage=new Message();
		Tablet myTablet=new Tablet();
		myMessage.read(myTablet);
		myMessage.read(new Phone());
		myMessage.read(new Pc());
		
	}

}
