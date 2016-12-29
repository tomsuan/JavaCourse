package com.android;

public class Main {
	public static void main(String[]args){
		
		for(int i=0;i<4;i++){
			System.out.println("i is "+i);
		}
		
		int num=18;
		if(num<18){
			//can only be accessed inside the brackets
			double dnum=56.7;
		}
		//cannot access dnum as it is a local variable
		//and is local to the if statement block
		//and cannot be accessed outside of the if statement 
		//block
		//any variable created inside a pair of brackets {}
		//is only available inside that pair of brackets
	//	dnum=89;
			
	}

}
