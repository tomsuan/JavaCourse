package com.noel;

public class Building {
	double height;
	double width;
	int age;
	
	void calcPrice(){
		System.out.println("buliding calcPrice");
	}
	
	void energyRating(){
		System.out.println("building energy rating");
	}

}

class House extends Building{
	boolean planningPermission;
	int windowAmount;
	
	void calcPrice(){
		System.out.println("house calcPrice");
	}
	void renovations(){
		System.out.println("house renovations");
	}
}

class Bungalow extends House{
	boolean centralHeating;
	boolean garage;
	
	void energyRating(){
		System.out.println("bungalow energy rating");
	}
	
	void occupancy(){
		System.out.println("bungalow occupancy");
	}
}
