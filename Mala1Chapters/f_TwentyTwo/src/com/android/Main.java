package com.android;

public class Main {

	public static void main(String[] args) {
		Maths myMaths=new Maths();
		int num1=45;
		int num2=65;
		double dnum1=89;
		double dnum2=5;
		/*
		 * calls the addMe method to add our numbers
		 * and assigns the returned value to the 
		 * int sum
		 */
		int sum=myMaths.addMe(num1, num2);
		double product=myMaths.multiply(num1, num2);
		System.out.println("sum is "+sum);
		System.out.println("product is "+product);
		/*
		 * does not return anything so you can't
		 * make it equal to anything
		 * it just prints to the screen
		 */
		myMaths.division(dnum1, dnum2);
		
		Person percy=new Person();
		percy.age=45;
		percy.name="Percy";
		percy.weight=56;
		percy.height=5;
		/*
		 * calling the printMe() method that
		 * prints out the age, name,weight and height
		 * of percy
		 */
		percy.printMe();
		
		int[]myArray={90,78,67,99,123,56};
		//prints out all elements of array
		//this method can only arrays of ints or
		//smaller data types, bytes, shorts
		myMaths.printAll(myArray);
		//adds up all the numbers in the array
		int[]myArray2={2,2,3,3};
		sum=myMaths.sumAll(myArray2);
		System.out.println("sum of array is "+sum);
		
	}

}
