package com.noel;

public class Person {
	int age;
	String name;
	/*
	 * variable arguments
	 * the ... means we can pass it as many
	 * int variables as we like
	 * ... actually puts all the values passed
	 * to the method into an array
	 * so in this situation days is an array in
	 * this method
	 */
	int daysWorked(int... days){
		int count=0;
		System.out.println("daysWorked");
		for(int i=0;i<days.length;i++){
			System.out.println("number is "+days[i]);
			count++;
		}
		return count;
	}
	/*
	 * variable length args have to be the last
	 * argument
	 */
	void holidays(String type,int...num){
		return;
		/*
		 * this code can never be reached
		 */
	//	System.out.println("this will give an error");
	}
	//can't have this
/*	void holidays2(int...num,String type){
		
	}*/
	/*
	 * can have multiple variable argument list
	 */
	/*void eat(int...num,double...dnum){
		
	}*/
	//can pass in a variable list of objects
	void myDogs(Dog...dogList){
		
	}

}
