package com.noel;

public class Pupil {
	String name;
	int age;
	static int courseId=12345;
	Pupil(String name,int age){
		this.age=age;
		this.name=name;
	}
	
	void eat(){
		System.out.println("I am a pupil i eat "
				+ "and my name is "+name);
	}
	
	static void takeCourse(){
		System.out.println("we are taking a course "
				+ "with id "+courseId);
	}

}
