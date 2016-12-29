package com.noel;

public class Building {
	int age=23;
	String address="Galway";	
	void calcCosts(){
		System.out.println("Building calcCosts");
	}
}
class House extends Building{
	//hiding
	int age=100;
	String address="Dublin";
	@Override
	void calcCosts(){
		System.out.println("House calcCosts");
	}
	
}
