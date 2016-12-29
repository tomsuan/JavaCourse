package com.android;

public class Main {

	public static void main(String[] args) {
		Dog spot=new Dog();
		//null is an absence of value for an object
		//string is an object
		//when an object has not value, its
		//null
		System.out.println("spot's name is "
				+spot.name);
		//call method by the name of the object
		//followed by a dot "." and then the
		//name of the method followed by brackets
		spot.run();
		spot.eat();
		spot.lick();
		
		Person percy=new Person();
		percy.walk();
		
		
		Cat tibbles=new Cat();
		tibbles.name="tibbles";
		tibbles.weight=8;
		int number=4;
		int number2=5;
		double dnum=9.8;
		
		double total=tibbles.bmi(number, number2);
		System.out.println("total is "+total);
		
		System.out.println(tibbles.bmi(number, number2));
		//takes two ints and returns an int
		int amount=tibbles.multiply(number, number2);
		System.out.println("amount is "+amount);
		System.out.println(tibbles.
				multiply(number, number2));
		/*
		 * this takes two doubles and returns a 
		 * double
		 */
		double sum=tibbles.division(number,number2);
		
		tibbles.calculation(number, number2);
		
	}

}
