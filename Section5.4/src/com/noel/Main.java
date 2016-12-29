package com.noel;

import java.util.ArrayList;

/**
 * Exam objective 5.2 create and use enhanced for 
 * loops
 * @author noelf
 *
 */
public class Main {

	public static void main(String[] args) {
		ArrayList<String>strList=new ArrayList<>();
		strList.add("Mary");
		strList.add("Patsy");
		strList.add("Harry");
		strList.add("Bridie");
		/*
		 * an enhanced for always consists of
		 * a list of items, and a variable that we
		 * use to iterate through the list.
		 * the variable HAS to be of the same type
		 * as the elements in the list
		 * in this case here we have a list of Strings
		 * so we have to have a variable of type
		 * string to iterate through the list
		 */
		for(String name:strList){
			System.out.println(name);
		}
		String[]nameList={"Mary","Patsy","harry",
				"Bridie"};
		for(String name:nameList){
			System.out.println(name);
		}
		//also works for primitive data types
		int[]numArray={34,56,78,99,100};
		for(int num:numArray){
			System.out.println(num);
		}
		/*
		 * an enhanced for is also called a for each
		 * loop
		 */
		StringBuilder[]sbArray={new StringBuilder("Timm"),
				new StringBuilder("George"),
				new StringBuilder("Yvonne")};
		
		for(StringBuilder sb:sbArray){
			/*
			 * I am attempting to change each stringBuilder
			 * object to a new object which has the value
			 * "harry"
			 * so this array has got the name "harry" in 
			 * it three times
			 */
			sb=new StringBuilder("harry");
		}
		/*
		 * with an enhanced for loop you can't change
		 * what a variable is assigned too
		 */
		for(StringBuilder sb:sbArray){
			System.out.println(sb);
		}
		/*
		 * attempting to change every number to 23
		 */
		for(int num:numArray){
			//
			num=23;
			/*
			 * if you print out this, it is NOT 
			 * one of the elements of the array
			 * it is just the variable num which
			 * now has the value 23. it has no
			 * relation to the array whatsoever
			 */
			System.out.println(num);
		}
		/*
		 * for primtive data types you can't change
		 * the values in an enhanced for loop
		 */
		for(int num:numArray){
			System.out.println(num);
		}
		/*
		 * you can't change what an object refers to
		 * but you can change the values or variables
		 * inside that object, i.e you can change
		 * the name, weight and height of your dog
		 * but it is still the same dog
		 */
		for(StringBuilder sb:sbArray){
			sb.append(" Lally");
		}
		
		for(StringBuilder sb:sbArray){
			System.out.println(sb);
		}
		/*
		 * can't be used to initialise an array
		 * and modify its elements
		 * for this you use a for loop instead
		 * can't be used to delete or remove elements
		 * from an arrayList
		 * can't be used to iterate over multiple lists
		 * in the same loop
		 */
		//an array of 5 ints
		int[]myArray=new int[5];
		for(int myInts:myArray){
			myInts=2;
		}
		for(int myInts:myArray){
			System.out.println(myInts);
		}
		/*
		 * can't remove elements with an enhanced
		 * for loop
		 */
		strList.remove(0);
		for(String name:strList){
			System.out.println(name);
			
		}
		/*
		 * can iterate through as many different 
		 * arrays as you want inside a for loop
		 */
		int[]numArray2={2,45,67,99};
		int[]numArray3={345,6768,990,2};
		for(int i=0;i<numArray2.length;i++){
			System.out.println(numArray2[i]);
			System.out.println(numArray3[i]);
		}
		/*
		 * you can't iterate through more than one
		 * array inside a enhanced for loop
		 */
		
		String[]name1={"harry","mary","laura"};
		String[]name2={"Laura","sally","shelly"};
		String[]name3={"colm","jack","michael"};
		
		String[][]name2DList={name1,name2,name3};
		/*
		 * nested enhanced for loop
		 */
		/*
		 * this is an array of arrays of Strings
		 * this means we have to use an array of
		 * strings to iterate through the 2dArray of 
		 * strings
		 */
		for(String[]nameArr:name2DList){
			/*
			 * for each one of those arrays of strings
			 * we use a string to iterate through it
			 */
			for(String name:nameArr){
				System.out.println(name);
			}
		}
		

	}

}
