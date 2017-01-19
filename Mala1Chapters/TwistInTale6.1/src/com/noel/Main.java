package com.noel;

public class Main {

	public static void main(String[] args) {
		//this is allowed, it does not really do anything
		new Employee("timmy").getName();
		//unless we assign a value to a variable with it
		String myName=new Employee("patsy").getName();

	}

}
