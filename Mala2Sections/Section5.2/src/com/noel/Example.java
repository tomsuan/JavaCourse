package com.noel;

public class Example {
	static void ex1(){
		int marks=31;
		/*
		 * you can only use the following in
		 * the switch() part of the switch statement
		 * char,byte,short,int,String,Integer,Short
		 * Byte,Character, enum
		 */
		switch(marks){
		case 10:System.out.println("mark is 10");
		/*
		 * after each case we usually have a
		 * break statement, this breaks out of the
		 * switch statement when it finds a match
		 * in this case when marks=10, it first
		 * prints out "mark is 10" then exits
		 * the switch statement
		 * the keyword "case" has to be followed
		 * by a colon
		 * each case statement can have as many
		 * lines of code as you like
		 */
			break;
		case 20:
			System.out.println("mark is 20");
			System.out.println("more lines of code");
			break;
		case 30:
			System.out.println("mark is 30");
			break;
		default:
			System.out.println("invalid number");
			break;
		}
		
		String days="SAT";
		
		switch(days){
		case "SAT":
			System.out.println("today is saturday");
			break;
		case "SUN":
			System.out.println("today is sunday");
			break;
		case "MON":
			System.out.println("today is monday");
			break;
		case "TUE":
			System.out.println("today is tuesday");
			break;
		case "WED":
			System.out.println("today is wednesday");
			break;
		case "THUR":
			System.out.println("today is thursday");
			break;
		case "FRI":
			System.out.println("today is friday");
			break;
		default:
			System.out.println("invalid date");
			break;	
		}
		
		System.out.println("no breaks");
		
		marks=10;
		switch(marks){
		case 10:System.out.println("mark is 10");
		//	break;
		case 20:
			System.out.println("mark is 20");
			System.out.println("more lines of code");
		//	break;
		case 30:
			System.out.println("mark is 30");
			break;
		default:
			System.out.println("invalid number");
			break;
		}
	}
	
	static void ex2(){/*
	if SAT will hit on case "SAT" and continue
	on until it reaches a break and will then exit
	*/
		String days="MON";
		switch(days){
		case "SAT":	
		case "SUN":
			System.out.println("The Weekend");
			break;
		case "MON":
			System.out.println("MON");
		case "TUE":
			System.out.println("TUE");
		case "WED":
		case "THUR":
			System.out.println("THUR");
		case "FRI":
			System.out.println("working days");
			break;		
		default:
			System.out.println("invalid date");
			break;	
		}
		
	}
	
	static void ex3(){
		int score=10;int num=20;
		/*
		 * you can put in expressions in the 
		 * switch part of the switch statement
		 */
		switch(score+num){
		case 10:
			System.out.println(10);
			break;
		case 20:
			System.out.println(20);
			break;
		
		}
		/*
		 * you only use certain variable types
		 * in a switch statement, whole numbers
		 * with the exception of a long,
		 * chars, Strings and enums
		 */
		/*
		 * can't use a boolean as this would only
		 * give you two options
		 */
		boolean mybool=true;
	/*	switch(mybool){
		
		}*/
		
		double dnum=2.1;
		/*
		 * too many variations for doubles to be
		 * used
		 */
	/*	switch(dnum){
		
		}*/
		/*
		 * any object (it has to be an object) can
		 * be declared to be of type null
		 */
		String name=null;
		Integer number=null;
		/*
		 * this will generate a nullpointerException
		 */
	/*	switch(name){
		
		}*/
		/*
		 * this will work, but it does nothing really
		 */
		switch(name="noel"){
		
		}
		
		int age=18;
		int age2=30;
		/*
		 * the value cannot change once set
		 */
		final int fNum=12;
		final int fNum2=30;
		final byte bNum=3;
		final int finalNum;
		finalNum=45;
		
		switch(age){
		case 18:
			System.out.println("you are 18");
			age=45;
			break;
			//can't do this, can't check for equivalence
		//case >18;
			/*
			 * can't do this as case has to have
			 * a definate value
			 */
		//	case age+age2:
			/*
			 * you can do this as fNum and fNum2
			 * are both final and cannot change
			 */
		case(fNum+fNum2):
			break;
		case(12*4):
			break;
		/*
		 * the variable in case CANNOT change and has
		 * to evaluate to the data type in the switch
		 * part
		 */
		case bNum:
			break;
			/*
			 * case can't be null
			 */
		//case null;
			/*
			 * you can't use a final that is 
			 * declared over two lines
			 */
	/*	case finalNum;
			break;*/				
		}	
	}
	
	

}
