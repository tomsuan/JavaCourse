package com.android;

public class Pig {
	int age;
	String name;
	Person owner;
	
	Pig(int pAge,String pName,Person pOwner){
		age=pAge;
		name=pName;
		owner=pOwner;
	}
	/*
	 * method one() is calling three other methods
	 */
	void one(){
		two();
		three();
		four();
	}
	
	void two(){
		System.out.println("method two called");
		//this will result in an error
		//one();
	}
	
	void three()
	{
		System.out.println("method three called");
	}
	void four(){
		System.out.println("method four called");
	}
}
