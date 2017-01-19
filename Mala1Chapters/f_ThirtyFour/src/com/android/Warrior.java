package com.android;
/*
 * 
 */
public class Warrior implements Behaviour{
	private int age;
	private String name;

	@Override
	public void happy() {
		System.out.println("I am a happy warrior");
		
	}

	@Override
	public void sad() {
		System.out.println("I am a sad warrior");
		
	}

	@Override
	public void angry() {
		System.out.println("I am an angry warrior");
		
	}

	@Override
	public void scared() {
		System.out.println("I am a scared warrior");
		
	}

	@Override
	public int frustrated(double num, String name) {
		System.out.println("hello "+name+" your frustration "
				+ "has increased by a factor of "+num);
		return 0;
	}

}

class Wizard implements Behaviour,Movement{
	int age;
	String name;

	@Override
	public void run() {
		System.out.println("Wizard Running");
		
	}

	@Override
	public void walk() {
		System.out.println("Wizard walking");
		
	}

	@Override
	public void fly() {
		System.out.println("Wizard flying");
		
	}

	@Override
	public void swim() {
		System.out.println("Wizard swimming");
		
	}

	@Override
	public void happy() {
		System.out.println("Wizard happy");
		
	}

	@Override
	public void sad() {
		System.out.println("Wizard sad");
		
	}

	@Override
	public void angry() {
		System.out.println("Wizard angry");
		
	}

	@Override
	public void scared() {
		System.out.println("Wizard Scared");
		
	}

	@Override
	public int frustrated(double num, String name) {
		System.out.println("Wizard frustrated");
		return 0;
	}
	
}
