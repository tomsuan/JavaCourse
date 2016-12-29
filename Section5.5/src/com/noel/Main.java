package com.noel;
/*
 * exam objectives 51
 * create and use while loops
 * create and use do while loops
 */
public class Main {
	public static void main(String[]args){
		int age=12;
		while(age<18){
			/*
			 * be careful where you put your
			 * incrementer it a while loop
			 */
			//age++;
			System.out.println("your age is "+age);
			age++;
			/*
			 * be careful as well to give an exit
			 * condition to our loop, if you don't
			 * you get an infinite loop
			 */
		}
		int count=0;
		boolean bunsAvailable=true;
		/*
		 * the while part always evaluates to 
		 * true or false
		 */
		while(bunsAvailable){
			System.out.println("nice buns");	
			if(count>4){
				bunsAvailable=false;
			}
			count++;
		}
		count=0;
		bunsAvailable=false;
		/*
		 * while this is false
		 * while this is NOT TRUE
		 */
		while(!bunsAvailable){
			System.out.println("no buns");
			count++;
			if(count>4){
				bunsAvailable=true;
			}
		}
		
		/*
		 * always executes at least once
		 */
		age=15;
		/*
		 * even though the age is 15, this will
		 * still execute once and only exit at the 
		 * end of the loop
		 */
		do{
			System.out.println("you are over 18");
			age++;
		}while(age>18);
		
		for(int i=0;i<12;i++)
			System.out.println(i);
		System.out.println("print me");
		
		
		
		
	}

}
