package com.noel;

public class Insect {
	void eat(){
		System.out.println("insect eat");
	}
	void drink(){
		System.out.println("insect drink");
	}

}
class Spider extends Insect{
	void web(){
		System.out.println("spin web");
	}
	
}
class Tarantula extends Spider{
	void eat(){
		System.out.println("Tarantula eat");
	}
	void drink(){
		System.out.println("Tarantula drink");
	}
	
}
