package com.noel;

public class Employee implements Behaviour{
	int age=45;
	String name="Eddie";

	@Override
	public void mad() {
		System.out.println("employee mad");
		
	}

	@Override
	public void happy() {
		System.out.println("employee happy");
		
	}

	@Override
	public void sad() {
		System.out.println("Employee sad");
		
	}

}
