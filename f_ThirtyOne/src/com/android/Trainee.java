package com.android;

import java.util.concurrent.SynchronousQueue;

public class Trainee {
	/*
	 * instance variables, each trainee
	 * has it's own pps, has it's own name,
	 * has it's own age
	 */
	int pps;
	String name;
	int age;
	/*
	 *  static is what is known as a class variable
	 * in that there is only one copy of the 
	 * the value
	 * if you change a static it changes for all
	 * trainees, as all trainees share this value
	 */
	static int courseCode=56;
	/*
	 * this will count how many trainees are 
	 * created
	 */
	static int counter=0;
	
	public Trainee(int pps, String name, int age) {
		super();
		this.pps = pps;
		this.name = name;
		this.age = age;
		/*
		 * every time this constructor is called we
		 * increment our counter by one
		 */
		counter++;
		//
	}
	/*
	 * you should also access this exactly like you
	 * access static variables
	 */
	static void signIn(){
		System.out.println("you are all signed in");
		//access a static variable
		System.out.println("coursecode is "+courseCode);
		//can't access a non static member inside 
		//static method, this gives an error
		//System.out.println("age is "+age);
		//Trainee timmy=new Trainee(3478, "Tim", 43);
		
	}
	/*
	 * for ordinary non static methods, you can 
	 * access both static members(methods and variables)
	 * inside them
	 */
	void test(){
		System.out.println("access age "+age);
		//static variable courseCode
		System.out.println("access static "+courseCode);
		//static method sigIn
		signIn();
	}
	
	
	

}
