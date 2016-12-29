package com.android;

public class Cat {
	int age;
	String name;
	double weight;
	double height;
	//Cat constructor
	/*
	 * constructor name and class name, have to 
	 * match exactly
	 * is like a method, the names is always followed
	 * by a ordinary set of brackets
	 * followed by curly brackets, which is the body
	 * of the constructor
	 * every time the "new" keyword is used, a 
	 * constructor is called
	 * if we have no constructor defined, java uses
	 * what is called the default construtor
	 * if we define a constructor in our class,
	 * we have to use this constructor
	 */
	Cat(){
		System.out.println("Cat constructor called");
	}

}
