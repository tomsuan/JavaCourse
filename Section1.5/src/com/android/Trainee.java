package com.android;

public class Trainee {
	int age=34;
	String pps="898090A";
	/*
	 * this is a static variable, also called
	 * a class variable. The correct way to 
	 * access this variable is the class name
	 * followed by the variable name.
	 * a static variable is shared by all
	 * members of the class. So every trainee
	 * will have the same courseCode.
	 * consequently if you change the course
	 * code for one trainee, it is changed for
	 * all trainees
	 */
	static int courseCode=12345;
	static String courseAddress="GRETB";
	/*
	 * static methods can only access static variables
	 * and static methods
	 */
	static void statMethod(){
		System.out.println("stat code "+courseCode);
		System.out.println("stat address "+courseAddress);
	/*
	 * can't access instance atributes in a 
	 * static method
	 */
		//	System.out.println(age);
	}
	/*
	 * ordinary methods can acess both static and
	 * ordinary non static variables
	 */
	void ordMethod(){
		System.out.println("age is "+age);
		System.out.println("pps is "+pps);
		System.out.println(courseCode);
		System.out.println(courseAddress);
	}

}
