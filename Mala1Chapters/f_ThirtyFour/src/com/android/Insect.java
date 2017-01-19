package com.android;

public class Insect implements Movement{

	@Override
	public void run() {
		System.out.println("Insect run");
		
	}

	@Override
	public void walk() {
		System.out.println("Insect walk");
		
	}

	@Override
	public void fly() {
		System.out.println("Insect fly");
		
	}

	@Override
	public void swim() {
		System.out.println("Insect swim");
		
	}

}
