package com.noel;
/**
 * Exam objective 6.1 Create methods with Arguments
 * and return values; including overloaded methods
 * @author noelf
 *
 */
public class Main {

	public static void main(String[] args) {
		Employee eddie=new Employee();
		/*
		 * creates a variable myWages that is
		 * the returned value from the calcWage
		 * method
		 */
		double myWages=eddie.calcWage(34);
		System.out.println("eddies wages are "+myWages);
		System.out.println("eddies wages are "
				+ ""+eddie.calcWage(34));
		/*
		 * this prints out the holiday and returns
		 * an int that is the amount of holidays you
		 * are entitled too
		 */
		int sum=eddie.calcHolidays(100);
		eddie.calcHolidays(200);
		/*
		 * the eat() method does not return, so it 
		 * cannot be assigned to anything, so this 
		 * will generate an error
		 */
		//int eat=eddie.eat();
		/*
		 * this is the correct way to call this method
		 */
		eddie.eat();
		/*
		 * this will not work as you can't assign
		 * a boolean (which is the return type of our 
		 * method) to an int
		 */
		//int boolNum=eddie.shift(12);
		boolean myBool=eddie.shift(14);
		
		Person percy=new Person();
		/*
		 * with the variable argument list
		 * you can pass it, many ints, one int or
		 * no int
		 */
		percy.daysWorked(2,3,4,5);//pass in four ints
		percy.daysWorked(2);//pass in one ints
		percy.daysWorked();//pass in no ints
		
		
		
		

	}

}
