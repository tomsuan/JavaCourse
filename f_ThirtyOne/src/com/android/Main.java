package com.android;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trainee tim=new Trainee(3478, "Tim", 43);
		Trainee tonya=new Trainee(8907, "Tonya", 23);
		Trainee terry=new Trainee(8098, "terry", 32);
		Trainee ted=new Trainee(1235, "Ted", 19);
		System.out.println("age of ted is "+ted.age);
		ted.age=78;
		//now ted's age is changed
		System.out.println("new age of ted is "+ted.age);
		System.out.println("age of tim is "+tim.age);
		
		System.out.println("course id for tim "
				+ "is "+tim.courseCode);
		System.out.println("course id for tonya is "
				+ " "+tonya.courseCode);
		tim.courseCode=56780000;
		
		System.out.println("new course code for tonya "
				+ " is "+tonya.courseCode);
		System.out.println("new course code for ted "
				+ " is "+ted.courseCode);
		/*
		 * accessing a static variable in a static
		 * way
		 * you do not have to create a trainee to
		 * access the course code
		 * to access a static variable (class variables)
		 * we put the name of the class followed by the
		 * name of the static variable
		 */
		System.out.println(Trainee.courseCode);
		/*
		 * we should access static methods by using
		 * the following method.
		 * we put the name of the class followed by the
		 * name of the static method
		 */
		Trainee.signIn();
		System.out.println("i have created "+Trainee.counter);
		
	}

}
