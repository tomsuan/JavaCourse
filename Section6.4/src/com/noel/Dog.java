package com.noel;

public class Dog implements Behaviour{
	int age;

	@Override
	public void angry() {
		System.out.println("Dog Angry");	
	}

	@Override
	public void sad() {
		System.out.println("Dog Sad");	
	}
	
	public void happy(){
		System.out.println("dog happy");
	}

}
