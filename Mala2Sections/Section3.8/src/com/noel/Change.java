package com.noel;

public class Change {
	static void changePrimitive(int num,boolean myBool){
		num=100000;
		myBool=true;
		System.out.println("inside method values are"
				+ " "+num+" and myBool is "+myBool);
	}
	
	static void changeObject(Dog spot){
		/*
		 * spot is now a different dog
		 */
		spot=new Dog();
		System.out.println("new Address is "+spot);
		System.out.println("name of dog is "+spot.name);
	}
	static void changeInstance(Dog spot){
		/*
		 * you can't change what this dog refers
		 * but you can change its instance variables
		 * i.e you can change the age and weight and 
		 * it will be changed in main, but it will
		 * be the same object
		 */
		spot.age=100;
		spot.name="fido";
	}
	
	static void changeCat(Cat tibbles){
		tibbles.name="ulick";
		tibbles.age=200;
		tibbles.weight=77.8;
		tibbles=new Cat();
		System.out.println("inside method "+tibbles);
	}
	/*
	 * this method can take a sheep or a cow
	 * as both extend the Animal class
	 */
	static void changeAnimal(Animal andy){
		
	}

}
