package com.noel;

public class Swan implements Desire{

	@Override
	public void hungry() {
		System.out.println("swan Hungry");
		
	}

	@Override
	public void thirsty() {
		System.out.println("Swan thirsty");
		
	}

	@Override
	public void procreate() {
		System.out.println("Swan procreate");
		
	}
	/*
	 * you can override freedom() but you
	 * don't have too
	 */
	/*
	public void freedom(){
		System.out.println("swan freedom");
	}*/

}
