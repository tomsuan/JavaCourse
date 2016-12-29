package com.android;

public class Main {

	public static void main(String[] args) {
		int age=18;
		System.out.println(age>18);
		//gaining admittance to a 18 film
		if(age<18){
			System.out.println("no admittance you pup");
			System.out.println("go watch a cartoon instead");
		}
		else{
			System.out.println("you are admitted");
			System.out.println("enjoy the film");
		}
		/*
		 * getting a haircut, price depends on age
		 * if less than 18, price if 5 euro
		 * if less than 30, price is 10 euro
		 * if less than 65, price is 15 euro
		 * all others pay 3 euro
		 */
		
		double price;
		age=67;
		
		if(age <18){
			price=5.0;		
		}
		else if(age<=30){
			price=10.0;
		}
		else if(age<65){
			price=15.00;
		}//if only one line of code, you don't have to put
		//curly brackets
		else
			price=3.00;
		System.out.println("you pay "+price+" euro");
		/*
		 * if your name is mary you go to the VIP area
		 * if you name is pat you go to the general
		 * punters area
		 * if your name is John you go to the peasants
		 * area
		 * if you are any other name you are not 
		 * allowed in
		 */
		String name="John";
		String message;
		
		if(name=="Mary"){
			message="welceme to the VIP area";
		}
		else if(name=="Pat"){
			message="welcome to the General Punters area";
		}
		else if(name=="John"){
			message="Welcome to the peasants area";
		}
		else
			message="you are not allowed in here";
		System.out.println("Hi "+name+" "+message);

	}

}
