package com.noel;

public class Employee {
	String name;
	int age;
	/*
	 * this method returns a double which
	 * is the wages for this employee
	 */
	double calcWage(int hours){
		double wages;
		wages=hours*20;
		return wages;
	}
	/*
	 * this returns an int and has an int as a 
	 * method parameter
	 */
	int calcHolidays(int daysWorked){
		/*
		 * for every 50 days worked
		 * we get ten days holidays
		 */
		int holidays=daysWorked/5;
		System.out.println("holidays are "+holidays);
		return holidays;
	}
	
	void eat(){
		System.out.println("employee eats");
		/*
		 * primary function of return is to exit
		 * a method, but in a method that returns
		 * void we do not have to put it in, but
		 * it is not an error to do so
		 */
		return;
		
	}
	/*
	 * this returns a true or false
	 * you can have more than one return as long
	 * as it is the last line EXECUTED
	 */
	boolean shift(int time){
		if(time>12){
			System.out.println("work day shift");
			return true;
		}
		else
			System.out.println("night shift");
		
		return false;
	}
	/*
	 * we can use methods to access and change instance
	 * variables of an object, in this the name and
	 * age of an employee
	 */
	void changeName(){
		name="percy";
	}

}
