package com.noel;

public class Animal {
	int age=34;
	String name="andy";
	
	void eat(){
		System.out.println("Animal eating");
	}
	
	void run(){
		System.out.println("animal running");
	}

}

class Cow extends Animal{
	int age=200;
	String name="bessie";
	void drink(){
		System.out.println("Cow drinking");
	}
	
	void eat(){
		System.out.println("cow eating");
	}
	
}

class Sheep extends Animal{
	void sleep(){
		System.out.println("sheep sleeping");
	}
	
}

class Pig extends Animal{
	
}

class Chicken extends Animal{
	
}
