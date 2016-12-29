package com.noel;

public class Ape {
	int age;
	String name;
	public Ape(int age, String name) {
		this.age = age;
		this.name = name;
	}
}
class Human extends Ape{
	
	Human(){
		super(23,"magilla");
	//	super(23,"magilla");
	}	
	
}
