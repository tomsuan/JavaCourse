package com.android;

public class Main {

	public static void main(String[] args) {
		//only small numbers, +-128
		byte bnum=31;
		//will give an error
	//	bnum=2340;
		short snum=4500;
		int num=34;//+-2,000,000,000
		long lnum=4557L;
		long lnum2=(long)567890;
		//for decimal places, floating point numbers
		double dnum=45.678;
		//by default java treats all decimals as doubles
		//so if you want to use a float, you have to cast 
		//
		float fnum=6.789f;
		float fnum2=(float)5.67;
		
		//boolean true or false
		boolean myBool=true;
		//character
		char myChar='a';
		char myChar2='@';
		//this is the same as 'a'
		char myChar3=97;
//		char myChar4='fg';//illegal
		//a string is NOT a basic data type
		String str1="hello there nice to meet you";
		System.out.println(str1);
		//the assignment operator
		num=56;
		//this puts num2 equal to num
		//both num and num2 are 56
		int num2=num;
		int num3=67;
		//testing for equivalence, will print true
		System.out.println(num==num2);
		//testing they are not the same, will print false
		System.out.println(num!=num2);
		

	}

}
