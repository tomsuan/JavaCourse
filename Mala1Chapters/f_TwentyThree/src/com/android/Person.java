package com.android;

public class Person {
	int age;
	String name;
	boolean sex;
	String gender;
	/*
	 * Person constructor that has only three
	 * of the four instance variables
	 */
	Person(int pAge,String pName,boolean pSex){
		age=pAge;
		name=pName;
		/*
		 * if the boolean sex is true, then
		 * the gender is female
		 * otherwise gender is male
		 */
		if(sex==true)
			gender="Female";
		else
			gender="Male";
		
	}

}
