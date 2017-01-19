package com.noel;

class Dog{
	Dog spot;
	
}

public class Exam {
	//our two instance variables
	Exam myExam;
	String name;
	//constructor
	Exam(String name){
		this.name=name;
	}
	/*
	 * this takes as a method parameter a Exam
	 * object and it assigns this object to
	 * the myExam instance variable
	 */
	void setExam(Exam exam){
		myExam=exam;
	}
	

}
