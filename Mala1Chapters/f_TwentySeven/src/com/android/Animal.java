package com.android;

public class Animal {
	double weight;
	int age=10;
	void printMe(){
		System.out.println("Animal Print");
	}
}
class Mammal extends Animal{
	int age=20;
	void printMe(){
		System.out.println("Mammal Print");
	}
	void callSuper(){
		//accesses the mammal's age
		System.out.println("age is "+age);
		System.out.println("Animal age is "+super.age);
		printMe();//access the mammals printMe()method
		super.printMe();
	}
}
class Ape extends Mammal{
	int age=30;
	void printMe(){
		System.out.println("Ape Print");	
	}
	void callSuper(){
		//accesses the ape's age
		System.out.println(" ape age is "+age);
		System.out.println("Mammal age is "+super.age);
		printMe();//accesses the Apses printMe() method
		super.printMe();
	}
}
class Human extends Ape{
	void printMe(){
		System.out.println("Human Print");
	}
	int age=40;
}
