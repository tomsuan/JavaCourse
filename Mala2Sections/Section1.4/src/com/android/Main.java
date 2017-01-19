package com.android;

import com.building.*;

/*
 * Exam objective 6.4 apply Access modifiers
 */
public class Main {
/*
 * four types of access modifiers
 * private - most restrictive, available only
 * to the class
 * default, package level access, no keyword
 * protected, package plus available to derived
 * classes
 * public, available everywhere
 */
	public static void main(String[] args) {
		Animal andy=new Animal();
		System.out.println("only access name "+
		andy.name);
		andy.run();

	}

}
