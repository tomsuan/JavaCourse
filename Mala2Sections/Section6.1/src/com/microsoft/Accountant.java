package com.microsoft;
import com.noel.Employee;

public class Accountant extends Employee{
	
	void getVariables(){
		//this works as age is public
		System.out.println("age is "+age);
		/*
		 * will not work as name is default
		 * level access so only available inside
		 * own package
		 */
		//System.out.println(name);
		/*
		 * will not work as phoneNumber is
		 * private
		 */
		//System.out.println(phoneNumber);
		/*
		 * this will work as Accountant extends
		 * employee and email is a protected 
		 * variable which means it's available in
		 * it'w own class and derived classes
		 * regardless of where that derivied class
		 * is
		 */
		System.out.println("email is "+email);
	}

}
