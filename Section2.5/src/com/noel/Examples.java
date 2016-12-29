package com.noel;

import java.util.ArrayList;

//import java.util.ArrayList;

public class Examples {
	static void createWrappers(){
		/*
		 * five ways to create a wrapper object
		 */
		Integer myInt=new Integer(3);
		Integer myInt2=4;
		Integer myInt3=new Integer("12");
		Integer myInt4=Integer.valueOf(45);
		/*
		 * why use a wrapper
		 * it treats a basic data type as 
		 * an object, so you can call methods for
		 * each object
		 */
		/*
		 * calling a method from the Integer class
		 */
		myInt.intValue();
		/*
		 * basic data types do not have methods
		 */
		int num=67;
		/*
		 * you cannot add basic data types to an arraylist
		 * You can only add objects to a arraylist
		 */
		ArrayList<Integer>numList=new ArrayList<Integer>();
		/*
		 * autoboxing the the automatic conversion
		 * of a primitive data type to an object of
		 * the corresponding wrapper class,
		 * i.e a int will be converted to an Integer
		 */
		numList.add(num);
		//System.out.println(numList);
		
		/*
		 * creating a wrapper by assignment
		 * assigning a primitive value to a wrapper
		 * class variable (autoboxing)
		 */
		Double myDouble=2.34;
		double dnum=12.456;
		Double myDouble2=dnum;
		/*
		 * this list can take any type of number as
		 * all wrapper classes inherit from the Number
		 * class
		 */
		ArrayList<Number>myList=new ArrayList<Number>();
		/*
		 * Constructor, by using wrapper class constructors
		 * 
		 */
		Dog spot=new Dog();//this calls blank construtor
		Dog lassie=new Dog(23);
		/*
		 * the above calls the constructor that 
		 * takes an int
		 */
		/*
		 * with wrapper classes there are two constructors
		 * one that that takes a primitive value, and one
		 * that takes a string value (the latter DOES NOT
		 * work for Characters)
		 * this is calling the constructor in the 
		 * integer class that takes an int
		 */
		Integer number=new Integer(12);
		/*
		 * this is callign the constructor in the
		 * Integer class that takes a string and converts
		 * that string to an Integer
		 */
		Integer number2=new Integer("123");
		Boolean myBool=new Boolean("True");
		/*
		 * can't do this as this is a Character
		 * and it can't take a string
		 */
		//Character myCharacter=new Character("a");
		//but you can do this
		Character myCharacter=new Character('a');
		/*
		 * create wrappers by using static methods of
		 * the wrapper classes
		 * you can create a wrappper by using 
		 * static methods by passing a primitive
		 * value
		 */
		Boolean myBool2=Boolean.valueOf(true);
		/*
		 * you can create a wrapper by using
		 * static method by passing a string 
		 * value
		 */
		Boolean myBool3=Boolean.valueOf("TrUe");
		//can do same with all other wrapper clases
		Integer statInt=Integer.valueOf(12);
		//cannot do this with a Character
		Integer statInt2=Integer.valueOf("123");
		System.out.println(myBool3);
		
		Integer mysInt=23;
		mysInt=45;
		mysInt=567;
		int myNum=34;
		myNum=567;
		myNum=56;
		
		//Double dnumber,double dnumber2;
		/*
		 * unboxing, taking the int value out of
		 * the Integer mysInt and assigning it
		 * to the int newNum
		 */
		int newNum=mysInt;
		/*
		 * parsers are for converting strings
		 * to numbers, and booleans, there is
		 * no parser for a Character
		 */
		String strNum="123";
		/*
		 * this takes the string strNum and 
		 * converts it to the int 123
		 */
		int value=Integer.parseInt(strNum);
		
		double dValue=Double.parseDouble("123.34");
		boolean bValue=Boolean.parseBoolean("FaLsE");
		/*
		 * if we want to convert from a string to 
		 * wrapper, we do the following
		 */
		Integer wrapInt=Integer.valueOf("123");	
	}
	
	static void compareWrappers(){
		/*
		 * whenever you use a constructor with 
		 * wrappers, you always create a new object
		 * so the below will print true, as they
		 * both are 10, and false as they are two
		 * different objects
		 */
		Integer number1=new Integer(10);
		Integer number2=new Integer(10);
		System.out.println(number1.equals(number2));//this checks value
		System.out.println(number1==number2);//this checks if the same object
		number1=number2;
		/*
		 * this will now print true, this is
		 * the same Integer object
		 */
		System.out.println(number1==number2);
		number1++;
		/*
		 * this adds 1 to number1, however Integer
		 * is immutable and cannot change, so that
		 * means that number1 is not a new object
		 */
		System.out.println("they will be true");
		System.out.println(number1==number2);
		/*
		 * if you are assigning two of the same
		 * numbers directly
		 * to two different wrappersr and the 
		 * number is less than 127 and greater 
		 * -128, then the two wrappers point to
		 * the same object
		 */
		int aNum=12;
		Integer number3=12;
		Integer number4=12;
		System.out.println("check values <127");
		System.out.println(number3.equals(number4));
		System.out.println("checking equilvalance<127");
		System.out.println(number3==number4);
		/*
		 * same value but different objects
		 */
		Integer number5=340;
		Integer number6=340;
		System.out.println("checking values");
		//true both 340
		System.out.println(number5.equals(number6));
		//false different objects
		System.out.println("Checking Equivalance");
		System.out.println(number5==number6);
		/*
		 * all the same object
		 */
		Boolean cBool=true;
		Boolean cBool2=true;
		Boolean cBool3=true;
		
		System.out.println(cBool==cBool2==cBool3);
		
		/*
		 * using valueof() operates the exact
		 * same way as assigning a value to 
		 * a wrapper
		 */	
		Integer i3=Integer.valueOf(10);
		Integer i4=Integer.valueOf(10);
		System.out.println("using value of");
		System.out.println(i3==i4);
		
		Byte myByte=new Byte((byte)2);
		i3=2;
		/*
		 * you can't use equivlance (==)
		 * with two different wrapper types
		 * here we have an Integer and a Byte
		 * so we can't compare them
		 */
		//System.out.println(i3==myByte);
		/*
		 * this will compile but will always give
		 * false, unless you cast it
		 */
		System.out.println(i3.equals(myByte));
		
		
		
	}

}
