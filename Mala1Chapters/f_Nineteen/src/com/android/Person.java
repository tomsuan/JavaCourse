package com.android;

public class Person {
	
	double weight;
	double height;
	String name;
	
	
	void walk(){
		System.out.println("I am a person i walk");
	}
	
	void calcBmi(){
		double bmi=weight/height;
		if(bmi>15)
			System.out.println("bmi too high");
		else{
			System.out.println("bmi is grand");
		}
	}

}
