package com.noel;

public class Cat {
	int age;
	String name;
	double weight;
	/*
	 * this is a constructor that takes no arguments
	 */
	Cat(){
		age=21;
		name="tibbles";
		weight=12.3;
	}
	/*
	 * a constructor that takes an int, and assigns
	 * that int to age
	 */
	Cat(int newAge){
		age=newAge;
	}
	
	Cat(int age,String name,double weight){
		this.age=age;
		this.name=name;
		this.weight=weight;
	}

}
