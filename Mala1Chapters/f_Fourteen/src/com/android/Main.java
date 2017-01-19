package com.android;

public class Main {

	public static void main(String[] args) {
		//Do while loop
		//this loop will always execute at least ONCE
		int counter=6;//counter for our loop
		do{
			System.out.println("counter is "+counter);
			counter++;
			/*
			 * does not check to see if counter is less than
			 * 5 until the loop is executed at least once
			 */
		}while(counter<5);
		

	}

}
