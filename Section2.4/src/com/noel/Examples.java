package com.noel;

public class Examples {
	static void assignmentOperators(){
		int a=12,b=3;
		
		a-=b;//same as a=a-b;
		System.out.println("a is "+a+" b is "+b);
		b*=a;//same as a=a*b;
		System.out.println("a is "+a+" b is "+b);
		a+=b;//same as a=a+b;
		System.out.println("a is "+a+" b is "+b);
		/*
		 * can't declare different variable types
		 * on the one line
		 */
		//double dnum=34,dnum2=56.78,int num2=67;
		int c=56;
		/*
		 * read from right to left, a is the same as b as the same
		 * as c
		 * so they all will have the value of 56, which
		 * is the orginal value of c
		 */
		a=b=c;
		/*
		 * boolean can only be equal to a boolean,
		 * only equal to true or false
		 */
		//boolean myBool=0;
		boolean myBool=true;
		boolean myBool2=false;
		//cannot do the following
		//myBool+=myBool2;
		//this checks to see if they are the same
		System.out.println(myBool==myBool2);
		/*
		 * this assigns myBool to whatever myBool2 is
		 */
		myBool=myBool2;
		/*
		 * floats
		 */
		float fnum=45.67f;
		//casting 
		float fnum2=(float)34.67;
		/*
		 * memory is reserved for a long
		 */
		long lnum=10L;
		/*
		 * you can't put bigger into smaller
		 * a long is bigger than an int
		 * 
		 */
		//int val=lnum;
		int val=67;
		/*
		 * val is an int, an int is smaller than
		 * a long so val will fit inside the long 
		 * lnum
		 */
		lnum=val;
		/*
		 * we can cast from bigger to smaller but you can
		 * get unpredictable results
		 */
		lnum=1_000_000_567_89L;
		/*
		 * can cast
		 * casting the long lnum to be of type
		 * int
		 */
		val=(int)lnum;
		System.out.println("val is "+val);
		
	}
	
	static void arithmeticOperators(){
		/*
		 * the arithmetic operators are =,-,/,*
		 * and some we might not be familiar with
		 * % modulus
		 * i++ post increment operator
		 * i-- post decrement operator
		 * ++i pre increment operator
		 * --i pre decrement operator
		 * 
		 */
		/*
		 * you can declare numerous variables and give them
		 * values on the same line, as long as they are 
		 * the same type
		 */
		int a=8,b=7;
		/*
		 * however once variables are created you can't give
		 * new values to more than one variable a line
		 * this line will not compile
		 */
		//a=3,b=4;
		/*
		 * have to seperated by semi colon, do not
		 * have to be on seperate lines
		 */
		a=4;b=100;
		System.out.println("value of a is "+a);
		System.out.println("value of b is "+b);
		/*
		 * the modulus will be 4, as 100 does not go into
		 * 4, so we have remainder 4
		 */
		System.out.println(a%b);
		//a is now 5
		/*
		 * increments 'a' first, then prints out
		 */
		System.out.println("++a is "+(++a));
		++a;
		//a is now 6
		System.out.println("a is now "+a);
		/*
		 * print out first, then it increments 'a'
		 */
		System.out.println("a++ is "+(a++));
		System.out.println("a after is now "+a);
		
		a=10;b=100;
		/*
		 * it adds a and b first, then it increments b
		 * num=10+100
		 * then after this sum is done b incrments by 1
		 * and becomes 101
		 */
		int num=a+b++;
		System.out.println(num);
		System.out.println(b);
		
		a=10;b=100;
		/*
		 * this is the same as 
		 * num=10+(100+1)=111
		 */
		num=a+ ++b;
		System.out.println(num);
		a=10;b=100;
		/*
		 * 11+101
		 */
		num=++a + ++b;
		System.out.println(num);
		a=10;b=100;
		num=++a - b++;
		System.out.println(num);
		a=10;b=100;
		
		num=++a + b++ + --b;
		System.out.println(num);
		a=10;b=100;
		
		num=a-- + b-- + ++b - --a;
		
		num =++a + --a + a++ + a - ++b + b + b--;
		/*
		 * what is num, what is a, what is b
		 */
		System.out.println("num is "+num+" a is "+a+""
				+ " b is "+b);
		
		a=10;b=100;
		num=a-- + b++ -a + b + ++a - --a;
		num= num++ - a++ + --b + b + ++num;
		
		System.out.println("num is "+num+" a is "+a+" "
				+ " b is "+b);
		
		char char1 = 'a';
		System.out.println(char1);
		/*
		 * the numeric ascii values of 'a' is 97
		 * so when we have two 'a' characters addeds
		 * we get the total 194
		 * as soon as we combine a char with an aritmetic
		 * operator the chars are then cast to be of 
		 * type int
		 * you can use all artimetic operators with char
		 */
		System.out.print(char1 + char1);
		/*
		 * this will not work, because char1+char1 is
		 * 'aa', and a char can only have ONE character in
		 * it
		 */
		//char newChar=char1+char1;
		/*
		 * this will work as char1+char1 is an int
		 */
		int intChar=char1+char1;
		char1++;
		char char2='A';
		System.out.println("uppercase");
		//uppercase is 65
		//lowercase is 97
		System.out.println(char2+char2);
			
	}
	
	static void widening(){
		
		byte b1=2;
		byte b2=4;
		/*
		 * b1 and b2 are widened to be an int
		 */
		//short snum=b1+b2;
		/*
		 * this will as b1 and b2 are now ints
		 */
		int num=b1+b2;
		
		long lnum=6L;
		long lnum2=3434343434343434343L;
		/*if there is a larger data type than int available,
		 * you always widen to the largest primitive 
		 * date type available, which in this case is 
		 * a long
		 */
		lnum=num+b1+b2;
		/*
		 * all values widen to a long in the above
		 */
		System.out.println(lnum);
		/*
		 * all values widen to a double
		 */
		double dnum=4.5;
		dnum=dnum+num+b1+b2;
		/*
		 * by inserting final, you can ensure
		 * that these variables will ALWAYS be bytes
		 * as if not final, you can never ensure that these
		 * bytes may be widened to ints at some point in 
		 * the future
		 * by marking them as final we can ensure that
		 * they will be bytes
		 */
		final byte b3=5;
		final byte b4=9;
		/*
		 * b3 and b4 ARE NOT widened to be an int
		 */
		short snum=b3+b4;
		int num4=(int)b3;
		int sum=b3+b4;
		
	}
	//examples of relation operators
	static void relationalOperators(){
		int a=10,b=10,c=100;
		/*
		 *>,<,>=,<=,!,==
		 */
		//this statemetn will evaluate to a boolean true or false
		System.out.println(a>b);//prints false
		System.out.println(a>=b);//prints true
		System.out.println(a==c);//prints false
		//this will print out 4 times
		for(int i=0;i<4;i++){
			System.out.println("print "+i);
		}
		//this will print out 5 times
		for(int i=0;i<=4;i++){
			System.out.println("print 2 is "+i);
		}
		 a=10;b=10;c=100;
		 System.out.println(a!=b);
		 System.out.println(a!=c);
		 
		 boolean b1=false;
		 System.out.println(b1==true);//will print false
		 System.out.println(b1==false);//will print true
		 //can't use incompatible data types, one is a boolean one is an int
		// System.out.println(b1>a);
		 int num=45;
		 int num2=90;
		 System.out.println(num==num2);//will print false
		 /*
		  * this is using the assignment operator
		  * num2 has the value of 90, this value is then
		  * assigned to num and displayed. so this will
		  * display 90
		  */
		 System.out.println(num=num2);
		 
		 num=45;num2=90;
		/*
		 * the assignment operator (=) has the highest precedence
		 * which means its done first in the below equation
		 * so num is given the value of 1000, then its compared
		 * against num2, so now num2 is 1000
		 */
		 System.out.println(num2>(num=1000));
		
		 System.out.println("num is "+num);
		 System.out.println("num2 is "+num2);
		
	}
	
	/*
	 * AND,OR
	 */
	static void logicalOperators(){
		/*
		 * && is AND both have to true
		 * || is OR either can be true
		 * ! is NOT
		 */
		int a=10;
		int b=20;
		//both have to be true
		System.out.println(a>20 && b>10);//false
		//either can be true
		System.out.println(a > 20 || b > 10);//true
		//NOT true
		System.out.println(!(a>10));//true
		System.out.println(!(b>10));//false
		System.out.println(!(a==b));//true
		/*
		 * && are called short circuit operators, if the first
		 * one evaluates to false, it does not bother with 
		 * the second or subsequent ones
		 * this means taht a is never incremented by 1
		 * as a>20 is false, so the second part ++a<100 is 
		 * never evaluated
		 */
		System.out.println(a>20 && ++a<100);
		//a has not changed as the second is never implemented
		System.out.println("a is now "+a);
		/*
		 * & ensure both evaluate and are implemented, even
		 * if the first arugment is false
		 * so a here is incrmented by one
		 * its used if we ALWAYS WANT TO RUN BOTH SIDES
		 */
		System.out.println(a>20 & ++a<100);
		System.out.println("has a changed "+a);
		
		String str="Hello";
		/*
		 * if the string exists and the string length is
		 * greater than 0, convert to uppercase
		 */
		if(str!=null && str.length()>0 ){
			System.out.println(str.toUpperCase());
		}
		
		
		
	}
	
	static void precedence(){
		int num=9;
		
	//	System.out.println(num>=12||++num>=10&&++num>=11);
	//	System.out.println(num);
	/*	Integer number = 10;
		int num2=10;
		System.out.println(number==num2);
		System.out.println(number.equals(num2));
		*/
		
		int num2=3,num3=5;
		int sum;
		sum=num2+num3*num2/num3+num2;
		
		
		//System.out.println("first sum is "+sum);
		num2=3;num3=5;
		sum=num3-num2*(num2+num3)/num2;
		//System.out.println("sum is "+sum);
		
		num2=3;num3=5;
		sum=num2=num2+num3*num2;
	//	System.out.println("sum is "+sum+" num2 is "+num2);
		num2=3;num3=5;
		sum=num2+(num2+num3)*num2+ ++num3;
	//	System.out.println("sum is "+sum+"num3 "+num3);
		num2=3;num3=5;
		sum=0;
		//sum=num2+=num3*(++num2 + num3);
		//sum+=num2 + ++num2;
		//System.out.println("sum is now "+sum);
		num2=3;num3=5;
		System.out.println(num3++>=6 | ++num2>3 && num3++>=5);
		System.out.println("num2 is "+num2+" num3 is "+num3);
		
		
		
		
		
		
	}

}
