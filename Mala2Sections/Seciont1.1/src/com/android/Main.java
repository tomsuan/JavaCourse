package com.android;

import com.animal.mammal.Monkey;

public class Main {
/**
 * Exam Objective 1.2 Define the Structure
 * of a Java Class
 * @param args
 */
	public static void main(String[] args) {
	//	Car MyCar=Car.MASSEY_FERGUSON;
		/*
		 * when its inside double quotes,
		 * it treats the comment as part 
		 * of the string
		 */
		String name="Timmy /* name "
				+ "*/ ";
		String name2 ="hello there my"
				+ " name is timmy";
		System.out.println(name);
		System.out.println(name2);
		
		Monkey magilla=new Monkey();
		/*
		 * default in an interface, allows
		 * you to give a default implmentation
		 * to a method
		 * see angry() in Behavior interface
		 */
		magilla.angry();
		
;
	}

}
