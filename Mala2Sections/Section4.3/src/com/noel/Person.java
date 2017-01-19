package com.noel;

public class Person implements Behaviour{

	@Override
	public void mad() {
		System.out.println("person mad");
		
	}

	@Override
	public void happy() {
		System.out.println("person happy");
		
	}

	@Override
	public void sad() {
		System.out.println("person sad");
		
	}
	
	void eat(){
		System.out.println("person eat");
	}
	
	void drink(){
		System.out.println("person drink");
	}

}
