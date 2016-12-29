package com.noel;
/*
 * Exam Objective 2.3
 * Know how to read or write to object fields
 * Exam 3.7
 * Appy Encapsulation principles to a class
 */
public class Main {

	public static void main(String[] args) {
		/*
		 * setting the values of the Dogs age
		 * and name by using a constructor
		 */
		Dog spot=new Dog(5,"spot");
		/*
		 * directly accessing instance variables
		 * to set the value
		 */
		spot.age=34;
		/*
		 * directly accessing instance varialbes
		 * to read the value
		 */
		System.out.println(spot.age);
		/*
		 * set the value using setters, which
		 * are public methods that set the value
		 * 
		 */
		spot.setAge(12);
		/*
		 * get the value using getters, which
		 * are public methods that get the value
		 */
		System.out.println(spot.getAge());
		
		Cat tibbles = new Cat();
		
	}

}
