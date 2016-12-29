package com.noel;

public class Ape {
	private int age;
	private String name;
	
	private void eat(){
		System.out.println("ape eating");
		
	}
	private void drink(){
		
	}
	public void doStuff(){
		eat();
		//drink();
		System.out.println(age);
		System.out.println(name);
	}

}

class Monkey extends Ape{

	void drink(){
		
	}
}
