package com.noel;

public class Examples {
	static void ex1()
	{
		int age=5;
		if(age==18){
			System.out.println("you are over 18");
		}
		else if(age>17){
			System.out.println("you are over 18");
		}
		else{
			System.out.println("you are under 18");
		}
		
		double weight=14.5;
		/*
		 * you can have a if statement all by
		 * itself, this will only trigger if
		 * the weight is greater than 20
		 */
		if(weight>20){
			System.out.println("you are heavy");
		}
		System.out.println("test print");
		/*
		 * you can't have an else by itself
		 */
	/*	else{
			
		}*/
		/*
		 * you can have an if and and else if
		 * with no else
		 */
		if(weight<15){
			System.out.println("less than 15");
		}
		else if(weight<20){
			System.out.println("less than 20");
		}
		/*
		 * checks if value is same
		 */
		weight=45;
		System.out.println(weight == 20);
		/*
		 * assigns value to weight and prints 
		 * it out
		 */
		System.out.println(weight = 45);
		/*
		 * comparing values
		 */
		if(weight == 67){
			
		}
		weight=45;
		if((weight += 10)>20){
			System.out.println("will print out");
		}
		/*
		 * you can check boolean
		 */
		boolean test=true;
		if(test){
			System.out.println("boolran true");
		}
		if(test==true){
			System.out.println("boolean true as well");
		}
		/*
		 * has to spit
		 */
		int num1=10,num2=50;
		
		if((num1+num2)>50){
			System.out.println("number greater than 50");
		}
		else{
			System.out.println("number not greater than 50");
		}
		
/*		if((weight=10)==10){
			System.out.println("weight "+weight);
		}*/

	}
	
	static void ex2(){
		int age=18;
		
	//	if(age>=17)
	//no body for if, generate error		
	//	else{		
	//	}
		/*
		 * you can have an if statement all by
		 * itself, but as soon as you put in an else
		 * you have to have a body
		 * also this person will now be 28 years
		 * of age
		 */
	if((age+10)>30);
	
	if(age>20){}
	/*
	 * you can't put any executable statement
	 * between the body of your if and the else
	 * or else if
	 */
	//System.out.println("hello");
	else
	{}
	
	boolean test=true;
	/*
	 * you can assign values to a boolean in the
	 * testing part of an if statement
	 */
	if(test=false){
		System.out.println("this is true");
	}
	else{
		System.out.println("this is false");
	}
		
	}
	
	static void ex3(){
		String name="lion";
		
		if(name.equals("lion"))
			/*
			 * if no curly brackets, the body
			 * of your if, else or else if can only
			 * be one line
			 */
			System.out.println("feed me meat");
		else if(name.equals("Horse"))
			System.out.println("feed me hay");
		/*
		 * body of previous else if finishes at
		 * the previous statement, so to put in
		 * any other executable statement here
		 * would cause an error
		 */
		//System.out.println("I am a horse");
		else
		{ 
			System.out.println("feed me cabbages");
			System.out.println("hippo like cabbages");
		}
		
		name="ostrich";
		if(name.equals("ostrich"))
			/*
			 * treats the for loops as one line
			 */
			for(int i=0;i<4;i++)
			{
				System.out.println(i);
				System.out.println("print me");
			}
		else
			for(int j=1;j<3;j++)
				System.out.println("second loop "+j);	
	}
	static void ex4(){
		int score=356;
		if(score<400){
			if(score>300)
			{
				System.out.println("print less "
						+ "than 400 greater than 300");
			}
			else
			{
				System.out.println("less than 400 and "
						+ " less than 300");
			}
		}
		else
		{
			System.out.println("greater than 400");
		}
		
		
		if(score<400)
		if(score>300)
		System.out.println("print less "
						+ "than 400 greater than 300");
		else
		System.out.println("less than 400 and "
						+ " less than 300");
		else
		System.out.println("greater than 400");
		
	}
	static void ex5(){
		/*
		 * Ternary Construct, which are simple
		 * if else statments but using the question
		 * mark symbol ?
		 */
		int age=18;
		if(age>18){
			System.out.println("you are over 18");
		}
		else{
			System.out.println("you are under 18");
		}
		/*
		 * a ternary construct has to be assigned
		 * to something
		 * the first part of a ternary construct
		 * has to be evaulated to a boolean
		 * here this is asking "if age>18"
		 * followed by question mark "?"
		 * followed by if true part
		 * followed by colons :
		 * followed by if false part
		 * if the boolean is true
		 * msg is "you are over 18"
		 * if the boolean is false
		 * msg is "you are under 18"
		 */
		age=21;
		String msg;
		msg=(age>18)?"you are over 18":"you are under 18";
		System.out.println(msg);
		
		int bill=2200;
		/*
		 * if bill > 200 discount is 15
		 * otherwise discount is 10
		 */
		int discount= (bill>2000) ? 15 : 10;
		
		discount=(bill>2000)? bill-200:bill-300;
		//you can also use methods
		discount=(bill>4000)? returnNum():returnNum2();
		/*
		 * will not work with methods that return  
		 * no values, returnNothing returns void
		 * and discount has to be an INT
		 */
		///discount=(bill>5000)? returnNothing():returnNum();
		
	}
	
	static int returnNum(){
		
		return 10;
	}
	
	static int returnNum2(){
		return 12;
	}
	
	static void returnNothing(){
		
	}
	
	static void ex6(){
		/*
		 * all three parts of a ternary opearator
		 * are mandatory (they have to be included)
		 * 1: the boolean operator
		 * 2: the value returned if true
		 * 3: the value returned if false
		 */
		int bill=2000;
		int qty=10;
		//can't do this
		//int discount=++qty?10:20;
		//can't omit the else part
		//int discount=(bill>2000)?15:
		/*
		 * this does not work as a ternary statemetn
		 * has to be assigned to some variable
		 */
		//(bill>2000)?15:20;
		/*
		 * can't have code blocks, curly Brackets{}
		 */
		//int discount=(bill>4000)? {bill-150}:bill+100;
		
		long amount=2000;
		/*
		 * because a long is too big for an int
		 */
		//int discount=(amount>2000)?amount-100:amount-150;
		/*
		 * this works fine as a int fits inside a 
		 * long
		 */
		int total=4000;
		long discount=(total>6000)?total-400:total-500;
		/*
		 * this is a wrapper class object NOT A PRIMITIVE
		 * TYPE
		 */
		discount=total;
		Integer intTotal=8000;
		/*
		 * this is a wrapper LONG object
		 * you cannot put one wrapper type equal
		 * to another, in this case the Long variable
		 * lDiscount can only be assigned a value of
		 * type Long or it's primitive counterpart long
		 */
		//Long lDiscount=intTotal;
		Long lDiscount=234l;
		/*
		 * total is an int
		 */
		total=9000;
		/*
		 * this will not work as 800, 500 and 600
		 * are all ints, which can't be assigned to
		 * the wrapper class type Long
		 */
		//Long newDiscount=(total>800)?500:600;
		/*
		 * this will work as numbers are all long
		 */
		Long newDiscount=(total>800l)?500l:600l;	
	}
	
	static void ex7(){
		int bill=2000;
		int qty=10;
		
		int discount=(bill>1000)?
						(qty>11)?//if true
								10:9:
						5;//if false
		System.out.println(discount);
		int days=10;
		//value of discount is 20
		discount = (bill > 1000)? (qty > 11)? 10 
				: days > 9? 20 : 30 : 5;
	}
}
