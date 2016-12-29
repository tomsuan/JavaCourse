package com.android;

public class Main {

	public static void main(String[] args) {
		/*
		 * insurance policy calculator
		 * if they are female and live in galway
		 * policy is 500 a year
		 * if they are female and live in Dublin
		 * Policy is 1000 a year
		 * if female and live anywhere else
		 * policy is 2000
		 * if male and live in galway
		 * policy is 750
		 * if male and live in Dublin 
		 * policy is 1250
		 * if male and live anywhere else
		 * policy is 3000
		 */
		
		//int age=25;
		//if its true person is female,
		//if its false person is male
		boolean sex=true;//male
		String location="Roscommon";
		double policy;//the price of our quote
		//this is to deal with females
		if(sex==true){//if the person is female
			if(location=="Galway"){
				policy=500;
			}
			else if(location=="Dublin"){
				policy=1000;
			}
			else{
				policy=2000;
			}//end of inner if statement		
		}//end of outer if statement
		//this is to deal with males
		else//if person is male
		{
			if(location=="Galway"){
				policy=750;
			}
			else if(location=="Dublin"){
				policy=1250;
			}
			else{
				policy=3000;
			}//end of inner if statement
		}//end of outer else statement
		System.out.println("policy is "+policy);
	}//end of main method
}//end of class
