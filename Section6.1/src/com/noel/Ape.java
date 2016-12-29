package com.noel;

public class Ape{
	//every Ape will have the age 45
	int age=45;
	
	void eat(){
		System.out.println("Ape eating");
	}
	void drink(int num,String name){
		
	}
	
	void happy(){
		System.out.println("Ape is happy");
	}
	
	void sad(){
		System.out.println("ape sad");
		
	}
}

class Human extends Ape{
	//age "hides" the base class age
	int age=23;
	//every human will have the age 23
	/* overrides eat() method from the Ape
	 * class, have to have the same method
	 * signature
	 */
	/*
	 * this is overloaded java treats overloaded
	 * methods as totally different and seperate
	 * methods
	 */
	void happy(int num){
		System.out.println("human happy");
	}
	@Override
	void eat(){
		System.out.println("Human eating");
	}
	void drink(int number,String str){
		
	}
}

/*
public class Ape {
	int age=45;
	
	void eat(){
		System.out.println("ape eating");
	}

}
/*
class Human extends Ape{
	//age "hides" the base class age
	int age=23;
	/*
	 * overrides eat() method from the Ape
	 * class, have to have the same method
	 * signature
	 */
/*	@Override
	void eat(){
		System.out.println("Human eating");
	}
	/*
	 * this is overloaded so this is in 
	 * effect a brand new method with no relation
	 * to the original eat() method
	 */
/*	void eat(int num){
		
	}
	
	
}
*/
