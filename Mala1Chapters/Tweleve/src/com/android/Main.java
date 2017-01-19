package com.android;

public class Main {
	public static void main(String[]args){
		int counter=6;//never going to go into the loop at all
		while(counter<5){
			//infinite loop
			System.out.println("counter is "+counter);
			counter++;
		
		}
		//a for loop with additional paremeters
		for(int i=0,j=0;i<4;i++,j++){
			System.out.println("i is "+i+" j is "+j);
			
		}
		//a bog standard for loop
		for(int i=0;i<5;i++){
			System.out.println("i here is "+i);
		}
		
		
	}

}
