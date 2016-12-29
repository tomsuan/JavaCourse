package com.android;

public class Maths {
	/*
	 * this is a method called addMe, that
	 * takes two ints, adds them, and returns
	 * the sum which is an int
	 */
	int addMe(int num1,int num2){
		int sum=num1+num2;
		System.out.println("addMe called");
		return sum;		
	}
	/*
	 * this is a method called multiply, that takes
	 * two doubles and multiplies and returns the
	 * total which is a double
	 */
	double multiply(double num1,double num2){
		double total=num1*num2;
		System.out.println("Multiply called");
		return total;
	}
	/*
	 * has no return type, do not have a return 
	 * statement in a method with a void return
	 * type
	 */
	void division(double dnum,double dnum2){
		double divisor=dnum/dnum2;
		System.out.println("divisor is "+divisor);
	}
	/*
	 * this method takes an array and prints
	 * out all the numbers
	 */
	void printAll(int[]myArray){
		for(int i=0;i<myArray.length;i++){
			System.out.println("number is "+myArray[i]);
		}
	}
	/*
	 * this method adds up all the numbers in an array
	 */
	int sumAll(int[]myArray){
		int sum=0;
		for(int i=0;i<myArray.length;i++){
			sum=sum+myArray[i];
			//exactly the same as above
		//	sum+=myArray[i];
		}
		return sum;
	}

}
