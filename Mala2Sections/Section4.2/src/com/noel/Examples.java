package com.noel;

public class Examples {
	
	static void ex1(){
		/*
		 * a stringBuilder object is a mutable
		 * string (you can change it, unlike a string)
		 * 
		 */
		StringBuilder sb1=new StringBuilder("some text");
		/*
		 * can't assign a string to a stringbuilder
		 * object
		 */
		//StringBuilder sb2="cannot do";
		/*
		 * similarily you can't assign a stringbulider
		 * to a string
		 */
		//String str=sb1;
		StringBuilder sb2=sb1;
		/*
		 * by default the initial size of all stringbuiler
		 * objects is size 16, that means we have 
		 * an array of size 16 chars storing our stringbuilder
		 * object
		 */
		/*
		 * creates an array of size 50 chars
		 */
		StringBuilder sb3=new StringBuilder(50);
		System.out.println("my stringbuilder is "+sb1);
		StringBuilder sb4=new StringBuilder(sb1);
		StringBuilder sb5=new StringBuilder();
		
		
	}
	
	static void ex2(){
		StringBuilder sb1=new StringBuilder("toy");
		/*
		 * adds to the end of the stringBuilder
		 * object
		 */
		sb1.append(" Story");
		System.out.println(sb1);
		sb1.append(true);
		System.out.println(sb1);
		sb1.append('c');
		System.out.println(sb1);
		sb1.append(23.45);
		System.out.println(sb1);
		
		Cat myCat=new Cat();
		/*
		 * this will call the Cat toString()
		 * method
		 */
		System.out.println(myCat);
		/*
		 * the Dog class does not have
		 * its own toString() so it will use the
		 * objects class toString() method
		 * this just prints out the address
		 * of the object
		 */
		Dog spot=new Dog();
		System.out.println(spot);
		sb1.append(spot);
		/*
		 * it appends the address of spot onto
		 * sb1. append takes the toString method
		 * used by that class and appends it to
		 * the stringbuilder object
		 */
		System.out.println(sb1);
		/*
		 * this appends the string returned by
		 * the Cat classes toString()methods, which
		 * returns the name of the cat and the 
		 * age of the cat
		 */
		sb1.append(myCat);
		System.out.println(sb1);
		
		String greeting="hello there";
		System.out.println(greeting+myCat);
		//can also append arrays of chars
		StringBuilder sb5=new StringBuilder("Hi");
		StringBuilder sb6 = new StringBuilder();
		char[] name = {'J', 'a', 'v', 'a', '8'};
		//prints "ava"
		sb6.append(name, 1, 3);
		System.out.println(sb6);
		//prints Hiava
		sb5.append(name,1,3);
		System.out.println(sb5);
		
		
	}
	
	static void ex3(){
		StringBuilder sb1=new StringBuilder("hello");
		/*
		 * insert inserts text or characters or boolean
		 * or objects into a certain location in your
		 * stringbuilder object
		 */
		sb1.insert(2, "NO");
		//prints heNOllo
		System.out.println(sb1);
		Cat myCat=new Cat();
		sb1.insert(3, myCat);
		//heNCat age is12, name istibblesOllo
		System.out.println(sb1);
		
	}
	
	static void ex4(){
		StringBuilder numSb=new StringBuilder("012345678");
		/*
		 * delete removes the characters in a substring
		 * of the specified stringbuilder
		 * so this will remove 2 and 3 BUT NOT 4
		 */
		numSb.delete(2, 4);
		System.out.println(numSb);
		numSb=new StringBuilder("012345678");
		/*
		 * deleteCharAt removes a single character
		 * at a specified location
		 * this will remove the '0'
		 */
		numSb.deleteCharAt(0);
		System.out.println(numSb);
		StringBuilder sb1= new StringBuilder("mood");
		/*
		 * no trim method for the Sringbuilder
		 */
		sb1.reverse();
		/*
		 * reverse puts our text back to front
		 */
		System.out.println(sb1);
		/*
		 * replace
		 * replaces a string in our stringbuilder object
		 * at a specified location
		 */
		numSb=new StringBuilder("012345678");
		numSb.replace(0, 5, "AB");
		System.out.println(numSb);
	}

}
