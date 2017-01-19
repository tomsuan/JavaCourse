package com.android;

public class Soilder implements Behaviour {

	@Override
	public void happy() {
		System.out.println("soilder happy");
		
	}

	@Override
	public void sad() {
		System.out.println("soilder sad");
		
	}

	@Override
	public void angry() {
		System.out.println("soilder angry");
		
	}

	@Override
	public void scared() {
		System.out.println("soilder scared");
		
	}

	@Override
	public int frustrated(double num, String name) {
		System.out.println("soilder frustrated");
		return 0;
	}

}
