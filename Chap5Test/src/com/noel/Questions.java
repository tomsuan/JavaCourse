package com.noel;

public class Questions {
	static void Question2(){
		
		int i=0;
		/*
		 * compare original value of i, then
		 * add 1 to i. so for first iteration of
		 * loop we are comparing 0 to 4, then
		 * incrementing by 1
		 */
		while(i++<4)
		{
			System.out.println("inside loop");
			System.out.println(i);
		}
		System.out.println("outside loop");
		System.out.println(i);
	}
	
	static void question2_2(){
		int i = 10;
		do{
			while (i++ < 15)
			{
				i = i + 20;
			}			
		}
		while (i < 2);
		System.out.println(i);
	}
	
	static void question7(){
		
	
		
	}
	
	static void question9(){
		/*
		 * this shows the importance of bracketing
		 * and indenting
		 */
		boolean myVal = false;
		/*
		 * this is assigning the value true to 
		 * myVal, it is NOT checking to see if
		 * myVal is true
		 */
		if (myVal=true)
		{
			for (int i = 0; i < 2; i++) System.out.println(i);
		}
		else 
		{
			System.out.println("else");
		}
	}

}
