package com.android;

import java.util.concurrent.SynchronousQueue;

public class Examples {
	/*
	 * object lifecycle
	 * creation
	 * dereference by reassignment
	 * garbage collection
	 */
	static void ex1(){
		/*
		 * this creates two dog, one called
		 * spot one called rex
		 */
		Dog spot=new Dog(23,"spot");
		Dog rex=new Dog(14,"rex");
		Dog lassie=new Dog(10,"lassie");
		/* rex is now the same dog as
		 * spot
		 * we now only have access to 2 dogs
		 * rex is the same dog as spot
		 * and we still have lassie
		 */
		//name of dog is rex
		System.out.println("name of dog is "+rex.name);
		//name of dog is beni
		rex=new Dog(10,"benji");
		/*
		 * you now have no way to access the dog
		 * with the name "rex"
		 * name of dog is beni
		 */
		System.out.println("name of dog is "+rex.name);
		rex=spot;//both dogs are called spot, same dog
		/*
		 * you now have no way to access the dog
		 * with the name "benji"
		 */
		System.out.println("name of dog is "+rex.name);
		/*
		 * if you can't access a value, it's liable
		 * for garbage collection, but you can't Guarantee
		 * it
		 * garbage collection is freeing up the memory held
		 * by a object(Dog)
		 */
	}
	
	static void ex2(){
		int age=4;
		String name="tibbles";
		double weight=4.5;
		boolean sex=true;
		
		Cat tibbles=new Cat(age, name, weight, sex);
		Cat tibbles2=new Cat(age, name, weight, sex);
		age=5;
		name="Evil";
		weight=6;
		sex=false;
		
		Cat evil=new Cat(age, name, weight, sex);
		Cat evil2=evil;
		
		System.out.println("same cat "+(evil==evil2));
		System.out.println(evil);//uses the Cat toString() method
		
		/*the equals() in the object class, simply
		 * checks if both objects are the same object
		 * so to check if both objects have all the
		 * same values, we have to override the equals()
		 * method
		 */
		System.out.println(tibbles.equals(tibbles2));
		
		
		
		
	}
	

}
