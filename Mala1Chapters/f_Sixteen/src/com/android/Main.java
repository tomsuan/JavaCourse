package com.android;

public class Main {
	public static void main(String[]args){
		int num=10;
		
		int mod=num%2;
		System.out.println("the modulus of our numbers "
				+ "is "+mod);
		/*
		 * if the remainder is greater than 0, the number
		 * is odd, otherwise the number id even
		 */
		if(mod>0){
			System.out.println("the number is odd");
		}
		else{
			System.out.println("the number is even");
		}
		
		for(int i=0;i<10;i++){
			System.out.println("i is "+i);
			if(i==7){
				/*
				 * this breaks out of the loop when i
				 * gets to 7
				 * and it won't loop after it gets to 7
				 */
				//comment in and out the break and you will
				//see the difference
				break;//will break completely out of the loop
			}
		}
		
		for(int i=0;i<10;i++){
			if(i%2==0){
				/*
				 * continue breaks out of the current iteration
				 * of the loop[
				 */
				continue;
			}
			System.out.println("odd number "+i);
		}
		
	}

}
