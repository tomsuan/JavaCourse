package com.android;

public class Cat {
	int age;
	/*
	 * a variable marked as final, cannot be changed
	 * A method marked as final cannot be overriden
	 */
	final String name;
	/*
	 * only way to create a cat is to use
	 * this constructor, which gives a value
	 * to our final String variable
	 */
	Cat(int age,String name){
		this.age=age;
		this.name=name;
	}
	
	/*
	 * you can overload a final method, as
	 * java treats the overloaded method as a totally
	 * different method
	 */
	void eat(int num){
		
	}
	/*
	 * you can't override a final method
	 */
	final void eat(){
		System.out.println("I am a cat i eat");
	}

}//end of Cat class

class Siamese extends Cat{

	Siamese(int age, String name) {
		super(age, name);
		// TODO Auto-generated constructor stub
	}
	/*
	 * this will generate an error as the eat() method
	 * in the super Cat class is final
	 */
	/*
	void eat(){
		
	}
	*/
	
}
