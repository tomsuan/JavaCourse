package com.noel;

public class Human {
	int age;
	String name;
	double weight;
	boolean sex;
	
	//construtor 1
	Human(){
		//calling the constructor that takes an int
		this(10,"joe",2.3,true);
		System.out.println("blank constructor called");
	}
	//constructor 2
	private Human(int age,String name,double weight,boolean sex){
		this.age=age;
		this.name=name;
		this.weight=weight;
		this.sex=sex;
		System.out.println("constructor 2 called");
	}
	
	//constructor 3
	Human(String name,int age,double weight,boolean sex){
		/*
		 * this will give an error as a call to
		 * another constructor HAS TO BE the first
		 * thing in a constructor
		 */
		//System.out.println("anything");
		//calling constructor 2
		this(age,name,weight,sex);
		System.out.println("constructor 3 called");
	}
	
	//constructor four
	private Human(int age){
		this.age=age;
	}

}
