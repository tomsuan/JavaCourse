package com.building;

public class Access {
	
	
	static void getAnimal(){
		Animal andy=new Animal();
		System.out.println(andy.name);//public
		System.out.println(andy.height);//default
		/*
		 * Animal is in the same package, so we
		 * can access the protected variables via
		 * an animal object, unlike in the Dog class
		 * which is a derived class but not in the
		 * same package
		 */
		System.out.println(andy.weight);//protected
		System.out.println(andy.sex);//protected
		System.out.println(Animal.id);//protected static
		/*
		 * Saimese is in the same package
		 * so we access to it
		 */
		Siamese sammy = new Siamese();
	}

}
