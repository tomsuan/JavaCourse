package com.android;

public class Person {
	double weight;
	double height;
	String name;
	/*
	 * will access the weight, height and name of
	 * percy if percy calls display, percy.display()
	 * or patrica calls display, patrica.display()
	 */
	void display(){
		System.out.println("weight is "+weight+
				" height is "+height+" "
				+ "name is "+name);
	}
	//its caculating the BMI which depends
	//on the person weight and height
	void calcBmi(){
		double bmi=weight/height;
		if(bmi>15)
			System.out.println(name+ " bmi too high");
		else{
			System.out.println(name+" bmi is grand");
		}
	}
	
	

}
