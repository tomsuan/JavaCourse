package com.cannine;

import com.building.Animal;
import com.building.Cat;

public class Dog extends Animal{
	
	void getValues(){
		/*
		 * 
		 */
		System.out.println(name);//public
		System.out.println(height);//protected
		System.out.println(sex);//protected
		System.out.println(id);//protected
		/*
		 * can't access weight, as this has default
		 * (package) level access and we are in a
		 * different package
		 */
//		System.out.println(weight);
		Animal andy=new Animal();
		System.out.println("accessing andy name "
				+andy.name);
		/*
		 * A derived class in a seperate package can't 
		 * access protected members of its base class
		 * using reference variables.
		 * In this case an Animal reference
		 * you can't access andy.height for instance as
		 * height is a protected variable or you can't 
		 * access andy.sex
		 */
		//System.out.println(andy.height);
		andy.setAge(67);
		Cat tibbles = new Cat();
		/*
		 * Siamese is package level access
		 */
		//Siamese sammy=new Siamese();
		
	}

}
