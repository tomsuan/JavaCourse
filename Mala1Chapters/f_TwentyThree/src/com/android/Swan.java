package com.android;

public class Swan {
	int age;
	double weight;
	double height;
	String name;
	
	Swan(int sAge,double sWeight,double sHeight,
			String sName){
		/*
		 * assigns values to the age, weight,height
		 * and name of the swan
		 */
		age=sAge;
		weight=sWeight;
		height=sHeight;
		name=sName;
		System.out.println("swan constructor called");
		
	}

}
