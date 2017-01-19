package com.noel;

public class Animal {
	int age=23;
	String name="andy";
	
	Animal(){
		System.out.println("Blank Animal constructor "
				+ "called");
	}
	
	void eat(){
		System.out.println("Animal eating");
	}

}

class Dog extends Animal{
	int age=99;
	String name="spot";
	
	Dog(){
		super();
		System.out.println("Blank Dog constructor "
				+ "called");
	}
	
	void eat(){
		System.out.println("dog eating");
	}
	
	void accessSuper(){
		System.out.println("age of dog is "+age);
		System.out.println("age of Animal "+super.age);
		eat();
		super.eat();
	}
	
}

class Terrier extends Dog{
	int age=1000;
	String name="terri";
	
	void acccessSuper(){
		//can't do this
		//super.super.age
		Animal andy=new Animal();
		System.out.println(andy.age);
	}
}
