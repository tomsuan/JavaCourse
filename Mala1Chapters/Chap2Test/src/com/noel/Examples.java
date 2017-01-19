package com.noel;

public class Examples {
	static void one(){
		char myChar='a';
		char myChar2='b';
		/*
		 * if string in output, promotes all to string
		 */
		System.out.println("characters are "+myChar+myChar2);
		/*
		 * if no string and uses "+" all chars will be cast to
		 * ints
		 */
		System.out.println(myChar+myChar2);
		int num=3;
		int num2=5;
		System.out.println("my numbers "+num+num2);
		System.out.println("added "+(num+num2));
		System.out.println(num+""+num2+""+(num+num2));
		
		
	}

}
