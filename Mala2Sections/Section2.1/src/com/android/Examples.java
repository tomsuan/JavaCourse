package com.android;

public class Examples {

	static void ex1(){
		byte bnum=3;
		short snum=45;
		int num=4567;
		/*
		 * need an L as default is an int
		 * so the L casts the number to be
		 * of type long, can be upper or 
		 * lowercase L
		 */
		long lnum=567890L;
		/*
		 * this is the more common way to cast
		 * something
		 */
		long lnum2=(long)67889;
		double dnum=45.67;
		/*
		 * have to cast to be of type float
		 * as all decimals are treated as 
		 * doubles by default
		 */
		float fnum=678.9f;
		float fnum2=(float)56.89;
		//can only be true or false
		boolean myBool=true;
		boolean myBool2=false;
		/*
		 * single quotes around a character
		 */
		char myChar='a';
		//every character corresponds to a number
		char myChar2=45;
		/*
		 * characters can't be assigned to 
		 * negative, in computer programming
		 * positive numbers are referred to as
		 * unsigned ints
		 */
		//can't do this
		//char myChar3=-34;
		/*
		 * however we can force it to accept
		 * the minus number
		 * you have to cast it to be of type
		 * char
		 */
		char myChar4=(char)-34;
		
		
	}
	static void ex2(){
		/*
		 * binary numbers begin with a 0b
		 * they are displayed by default in
		 * decimal (100 in binary will display
		 * as 4)
		 */
		int biNum=0b100;
		System.out.println("0b100 in decimal is "+biNum);
		int biNum2=0B111_1110_0001_1_0;
		System.out.println("second binary is "+biNum2);
		/*
		 * Octal numbes begin with a 0, they are
		 * displayed by default in Decimal(100 will 
		 * display as 64
		 */
		int octNum=0100;
		System.out.println("0100 in decimal is "+octNum);
		int octNum2=077543210;
		System.out.println("second octal is "+octNum2);
		/*
		 * Hexadecimal numbers being with a 0x, they are 
		 * displayed by default in Decimal (10 will display
		 * as 16)
		 */
		int hexNum=0x10;
		System.out.println("0x10 in decimal is "+hexNum);
		int hexNum2=0xaBcFD40;
		System.out.println("second hex is "+hexNum2);
		/*
		 * add up all the numbers and display them in
		 * decimal
		 */
		int sum=hexNum+octNum+biNum;
		System.out.println("sum is "+sum);
		/*
		 * 
		 */
		//System.out.println(Integer.toBinaryString(sum));
		System.out.println(Integer.toString(sum,8));
		System.out.println(Integer.toString(sum,2));
		System.out.println(Integer.toString(sum,16));
		System.out.println(Integer.toString(sum,25));
		
		int octNum3=0_25;//this is allowed
		/*
		 * can't start or finish with an Underscore
		 * with a literal value
		 */
		//all commented out variables are illegal
		//octNum3=_022;
		//octNum3=022_
		//int newBiNum=0x_214;
		//int newBiNum=0b_1234;
		biNum=0x1_8a;
		//this is also illegal
		//Long lnum=100000_L
		//int i="123";
		/*
		 * these are called parsers and converts
		 * text to numbers or booleans, but NOT
		 * Characters. each numeric type has its
		 * own parser, i.e int has parseInt,
		 * double has parseDouble
		 */
		int i=Integer.parseInt("1234");
		double dnum=Double.parseDouble("1.23");
		boolean myBool=Boolean.parseBoolean("true");
		System.out.println(i);
		/*
		 * you cannot use underscores with parsers
		 * for numeric values
		 * this will generate a
		 * NumberFormatException
		 */
	//	i=Integer.parseInt("23_45")
		/*
		 * rules for underscores and ints
		 * You can’t start or end a literal value with an underscore.
			You can’t place an underscore right after the prefixes 0b, 0B, 0x, and 0X, which
			are used to define binary and hexadecimal literal values.
			You can place an underscore right after the prefix 0, which is used to define an
			octal literal value.
			You can’t place an underscore prior to an L suffix (the L suffix is used to mark a
			literal value as long).
			You can’t use an underscore in positions where a string of digits is expected.
		 */
		long var7 = 100__12_12;	
	}
	
	static void ex3(){
		double dnum=56.78;
		/*
		 * double is the default for all numbers
		 * that have a decimal, so if we want to
		 * use float, we have to cast it
		 */
		float fnum=45.67f;//lowercase or uppercase f works
		float fnum2=(float)dnum;//casting to type float
		float fnum3=(float)34.56;//cast to type float
		double dnum2=(double)fnum;//dont' have as
		double dnum3=3.45D;//all decimals are implictly doubles
		
		/*
		 * You can’t place an underscore prior to a D, d, F, or f suffix (these suffixes are
		used to mark a floating-point literal as double or float).
■ 		You can’t place an underscore adjacent to a decimal point. 
		 */
		
		//float fnum2=1.2f_f;
		//float fnum3=1_.34;
		//float fnum4=1._23f;
		/*
		 * use single quotes for a char
		 */
		char c1='a';
		char c2=122;
		//this is the same as
		char c3='z';
		
		int number;
		
		//char minusChar=-56;
		/*
		 * you can cast it to be of type char
		 * but you should'nt in real life
		 * programming
		 */
		char minusChar=(char)-56;
		System.out.println(minusChar);	
	}
	
	static void ex4(){
		int kjkljkjlkklkjkl;
		int _jkjl_;//undescore anywhere
		int €num;//currency symbol anywhere
		int num56;//anywhere but at beginning
		//variable can't start with a number
		//int 7um;
		/*
		 * no dashes allowed, anywhere
		 */
		//int num-toy
		/*
		 * can't use special characters
		 */
		int spec;
		/*
		 * can't use Java keywords
		 */
		//for instance
		//int for//for is a java keyword
		/*
		 * you can define and intialise as many
		 * variables as you like of the same
		 * type on the same line
		 */
		int number=9,number2=89;
		//just declaring two doubles
		double dnum4,dnum5;
		double dnum9=1.22;
		dnum9++;
		
	}

}
