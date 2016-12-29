package com.android;

public class Main {
	public static void main(String[]args){
		
		int size=6;//this is the size of our array
		double[]weights=new double[size];
		double[]heights=new double[size];
		double[]bmi=new double[size];
		int[]ages=new int[size];
		String[]names=new String[size];
		
		int i=0;
		while(i<size){
			weights[i]=i+2;//
			System.out.println("weight is "+weights[i]);
			i++;//incrementing by 1 here
		}
		i=0;
		while(i<size){
			heights[i]=i+3;
			System.out.println("height is "+heights[i]);
			i++;
		}
		i=0;
		while(i<size){
			bmi[i]=weights[i]+heights[i];
			i++;
			
		}
		//gives us the size of the array
		System.out.println(bmi.length);
		i=0;
		//will only go on for the length of the array
		while(i<bmi.length){
			System.out.println("bmi is "+bmi[i]);
			i++;	
	}

}
}
