package com.android;

public class Numbers {
	int age=20;
	/*Numbers(){
		System.out.println("No Argument constructor "
				+ " numbers class");
	}
	Numbers(int age){
		this.age=age;
		System.out.println("A constructor with one argument");
	}*/
	
	void callMe(){
		System.out.println("numbers callMe");
	}
}

class One extends Numbers{
	int age=100;
	void callMe(){
		System.out.println("One callMe");
	}
	/*
	 * we use super. to access the variables,
	 * the methods and the constructors of the base
	 * class
	 */
	void callSuper(){
		System.out.println("super.age is "+super.age);
		System.out.println("age in one is "+age);
		super.callMe();//callMe superClass method
		callMe();//callMe method in the one class
	}
}
class Two extends One{
	int age=200;
	void callMe(){
		System.out.println("Two callMe");
	}	
	
	void callSuper(){
		System.out.println("super.age is "+super.age);
		System.out.println("age in two is "+age);
		super.callMe();//callMe superClass method
		callMe();//callMe method in the one class
	}
	
}
class Three extends Two{
	int age=300;
	void callMe(){
		System.out.println("Three callMe");
	}
	
	
}
