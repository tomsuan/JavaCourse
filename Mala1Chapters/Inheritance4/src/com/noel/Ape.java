package com.noel;

public class Ape {
	void eat(){
		System.out.println("ape eating");
	}
	void drink(){
		System.out.println("ape drinking");
	}

}
class Monkey extends Ape{
	
	void eat(){
		System.out.println("monkey eating");
	}
	void useTools(){
		System.out.println("monkey use tools");
	}
	
}
class Human extends Monkey{
	void drink(){
		System.out.println("human drinking");
	}
	void useTools(){
		System.out.println("human use tools");
	}
	void speak(){
		System.out.println("human speaking");
	}
	
}
