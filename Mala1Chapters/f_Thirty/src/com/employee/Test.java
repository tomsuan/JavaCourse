package com.employee;

import java.util.concurrent.SynchronousQueue;

import com.android.Dog;



public class Test {
	int age=2;
	String name="rex";
	double weight=3.4;
	double height=2.3;
	Dog rex = new Dog(age, name, weight, height);
	
	void printy(){
		/*
		 * can access age as age is a public 
		 * variable
		 */
		System.out.println(rex.age);
		/*
		 * cannot find sex as its package level
		 * access and we are now in a different
		 * package
		 */
		//System.out.println(rex.sex);
		
	}

}

class CockerSpaniel extends Dog{
	
	int num;
	//String colour="Brown";
	
	

	public CockerSpaniel(int age, String name, double weight, double height) {
		super(age, name, weight, height);
		// TODO Auto-generated constructor stub
	}
	//blank constructor
	CockerSpaniel(){
		
	}
	
	
	
	void printy(){
		//has access to the colour variable as it is protected
		System.out.println(colour);
				
		
		
	}
	
}
