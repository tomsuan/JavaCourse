package com.noel;

public class Main {
	public static void main(String[]args){
		
		Animal andy=new Animal();
		
		Dog spot=new Dog();
		
		Collie colm=new Collie();
		
	
		/*
		 * calls the toString method for the
		 * animal class
		 */
		System.out.println(andy);
		/*
		 * calls the toString method for
		 * the Dog class
		 */
		System.out.println(spot);
		/*
		 * calls the toString method for the
		 * collie class
		 */
		System.out.println(colm);
		
		//	StaticMethods.takeAnimal(spot);
	//	StaticMethods.takeAnimal(colm);
		System.out.println("static methods");
		StaticMethods.takeAnimal(colm);
		/*
		 * can't create a abstract object
		 */
		//Person percy = new Person();
	}

}
