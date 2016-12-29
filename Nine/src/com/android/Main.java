package com.android;

public class Main {
	public static void main(String[]args){
		//creates a blank array of ints of size 4
		int[]myArray=new int[4];
		//creates a array of size 5, with five
		//numbers contained within it
		int[]myArray2={3,5,7,345,90};
		//array numbering starts at 0
		System.out.println("first element of array is"
				+ " "+myArray2[0]);
		System.out.println("second element of array is"
				+ " "+myArray2[1]);
		//this will give you ArrayIndexOutOfBoundsException
		//System.out.println("out of bounds "+myArray2[6]);
		myArray[0]=78;
		myArray[1]=5643;
		myArray[2]=8979;
		myArray[3]=879898;
		//have given num no value
		int num;//will not printout
		//System.out.println("num is "+num);
		int[]noValArray=new int[3];
		System.out.println("first element of noValarray is"
				+ " "+noValArray[0]);
		
		char[]charArray=new char[4];
		System.out.println("value is "+charArray[1]);
		//counter to increment our loop
		int counter=0;
		while(counter<4){//while counter is less than 4
			System.out.println("your number is "
		+myArray[counter]);//we have four elements in our array
			counter++;
		}
		System.out.println("tyour number is "+myArray[0]);
		System.out.println("tyour number is "+myArray[1]);
		System.out.println("tyour number is "+myArray[2]);
		System.out.println("tyour number is "+myArray[3]);
		
		
		
	}

}
