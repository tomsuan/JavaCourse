package com.android;

public class Maths {
	//this is a overloaed method that takes an array of ints
	void printMe(int[]myArray){
		for(int i=0;i<myArray.length;i++)
			System.out.println("number is "+myArray[i]);
		
	}
	//this is an overloaded method that takes an array of double
	void printMe(double[]myArray){
		for(int i=0;i<myArray.length;i++)
			System.out.println("number is "+myArray[i]);
	}
	//this is an overloaded array, that takes an array of strings
	void printMe(String[]myArray){
		for(int i=0;i<myArray.length;i++)
			System.out.println("String is "+myArray[i]);
	}
	//also overloaded
	void printMe(int num,double dnum,String myStr){
		System.out.println("just print me out");
	}
	//also overloaded if the order is different
	/*
	 * what uniquely identifes a method is the name,
	 * the parameter list and the order of the parameters
	 * you can have two or many methods of the same
	 * name, but no two methods can have the same name
	 * and the same ordered parameter list
	 * return type, does not matter for overridden methods
	 * 
	 */
	int printMe(String myStr,int num, double dnum){
		
		return 0;
		
	}
	/*
	 * methods with the same parameter list type
	 * but different parameter names is not overloaded
	 * 
	void printMe(String stringy, int number,double dnumber){
		
	*/

}
