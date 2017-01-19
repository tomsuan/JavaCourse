package com.android;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//an array of numbers
		int[]numArray={45,78,990,78};
		//.length is the size of the array which is 4
		for(int i=0;i<numArray.length;i++){
			//this will print out all elements of array
			System.out.println("number is "+numArray[i]);
		}
		//an enhanced for loop and this is only for arrays
		//and arraylists
		for(int a:numArray){
			System.out.println("number in enhanced is "+a);
		}
		//an array of doubles
		double[]dArray={56.7,4.6,4.5,7.9,1.34,7.08,9.7};
		for(double d:dArray){
			System.out.println("our number is "+d);
		}
		

	}
	
	
	
	
	
	
	
	
	
	
	

}
