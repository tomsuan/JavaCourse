package com.android;

import java.util.ArrayList;

public class Examples {
	/*
	 * ArrayLists
	 */
	static void ex1(){
		/*
		 * this creates an empty array of 
		 * int of size 4
		 */
		int[]numArray=new int[4];
		/*
		 * this creates an array of four
		 * ints that is populated
		 */
		int[]numArray2={4,5,89,12};
		numArray[1]=678;//populating our array
		/*
		 * the problem with arrays is the size
		 * of the array is set and cannot be
		 * changed
		 * we are attempting to add
		 * a fifth number to our array
		 * this will generates an ArrayIndexOutOfBoundsException
		 */	
		//numArray2[4]=567;
		/*
		 * Arraylists are at they're simpliest a dynamic
		 * array whose size can change and we can add 
		 * more elements to it
		 */
		ArrayList<String>strList=new ArrayList<String>();
		strList.add("noel");
		strList.add("Pat");
		strList.add("Mary");
		strList.add("Bridie");
		System.out.println(strList);
		
		ArrayList<Dog>dogList=new ArrayList<Dog>();
		dogList.add(new Dog(2,"spot"));
		dogList.add(new Dog(3,"rex"));
		/*
		 * you can only add objects to an arrayList
		 * you can't add simple data types 
		 * int, double, short, byte, float, long,
		 * char, boolean
		 */
		//ArrayList<int>intList=new ArrayList<int>();
		
		for(String s:strList){
			System.out.println(s);
		}
		
		
	}//end of ex1
	
	static void ex2(){
		/*
		 * wrapper class
		 * Byte, Short, Integer,Double,Float,Long
		 * Boolean,Character
		 * wrapper classes are classes that wrap
		 * simple data types in an object
		 * wrapper class only has one value
		 */
		Integer num=new Integer(34);
		Integer num3=678;
		Double dnum=new Double(3.45);
		Boolean bool=new Boolean(true);
		Character myChar=new Character('a');
		int num1=45;
		
		double dnum2=3.45;
		boolean bool2=true;
		char myChar2='a';
		
		ArrayList<Integer>numList=new ArrayList<Integer>();
		numList.add(num);
		/*
		 * wrapper class numbers - Integers, floats
		 * etc are all inherited from the Numbers
		 * class
		 */
		ArrayList<Number>numList2=new ArrayList<Number>();
		numList2.add(dnum);
		numList2.add(num);
		
		
		
		
	}

}
