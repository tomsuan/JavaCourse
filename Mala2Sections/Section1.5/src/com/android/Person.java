package com.android;
/*
 * when you have a final class, you cannot inherit
 * from it
 */
public final class Person {
	/*
	 * this cannot change once given a value
	 */
	final int age=34;
	/*
	 * this will generate an error as we are trying
	 * to give a final a new value
	 */
	//age=78;
	final double height=90;
	
	final double weight;
	/*
	 * you can't create a person, without using
	 * this constructor, so you will always assign
	 * a value to the final double weight
	 */
	Person(double weight){
		this.weight=weight;
	}
	

}
/*
 * can't extend from a final class, so this will
 * not compile
 */
/*
class Irish extends Person{
	
}
*/
class Irish{
	/*
	 * you can't override a final method
	 */
	final void talk(){
		System.out.println("Irish Talking");
	}
	/*
	 * you can overload a final method
	 */
	void talk(int num)
	{
		System.out.println("this is an overloaded talk method");
	}
}

class Galway extends Irish{
	/*you can't override the final method talk()
	 * in the Irish class
	 */
	/*
	void talk(){
		System.out.println("Galway talking");
	}*/
	
}
