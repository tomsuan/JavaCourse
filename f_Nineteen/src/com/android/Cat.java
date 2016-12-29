package com.android;

public class Cat {
	String name;
	double weight;
	
	/*
	 * every method has a return type
	 * a return can be any data type or any
	 * object or array of data types or object.
	 * every method has a name, eat(), drink(),et
	 * methods can have parameters, which can be
	 * any data type or object or list of objects
	 * all concrete methods have a body
	 */
	
	/*
	 * the first double refers to the return type
	 * bmi refers to the method name
	 * the int num and int num2 refer to the
	 * parameter list
	 * what's enclosed in the curly brackets
	 * is the body of the method
	 */
	double bmi(int num,int num2){
		double sum=num+num2;
		System.out.println("bmi called");
		return sum;
	}
	
	int multiply(int num,int num2){
		int sum=num*num2;
		System.out.println("multiply called");
		return sum;
	}
	/*
	 * returns a double, takes two doubles
	 */
	double division(double num,double num2){
		
		double sum=num/num2;
		System.out.println("division called");
		return sum;
	}
	
	//no return type is declared void
	void calculation(int num,int num2){
		//num=4, num2=5
		int sum=(num+num2)*num;
		System.out.println("sum is "+sum);
	}
	
	

}
