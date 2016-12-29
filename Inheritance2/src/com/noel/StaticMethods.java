package com.noel;

public class StaticMethods {
	
	static void takeAnimal(Animal myAnimal){
		System.out.println(myAnimal);
		myAnimal.eat();
		myAnimal.drink();
	}

}
