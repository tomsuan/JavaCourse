package com.android;
/**
	This is our first java project
		 * 
		 */
public class Main {
	
	public static void main(String[] args) {
		//this is a single line comment
		System.out.println("Hello world");
	/*
	 * this is a 
	 * multi line
	 * comment
	 */
		System.out.println("my name is Noel");
		
		System.out.println(3+2);//addition
		System.out.println(3*2);//multipication
		System.out.println(10/2);//Division
		//treats this as text
		System.out.println("3*2");
		//creating our variable
		int num=4567;
		//will print out our variable with the text
		System.out.println("my number is "+num);
		int number;
		number=345;
		System.out.println("my second number is "+number);
		number=-2;
		System.out.println("print out number "+number);
		//create a variable that is the sum of our two numbers
		int sum=num+number;
		System.out.println("sum is "+sum);
		//create a variable that is the product of our two numbers
		int product=num*number;
		System.out.println("product is "+sum);
		//create a variable that is the divisor of our two numbers
		int divisor=num/number;
		System.out.println("divisor is "+sum);
		//this will also add up your numbers
		System.out.println("our sum is "+(num+number));
		num=5;
		number=2;
		//example of integer division
		sum=num/number;
		//the answer is 2.5, but integer division lops off the .5
		System.out.println("integer division "+sum);
		//so you get the answer 2
		
		

	}

}
