package com.noel;

public interface Wages {
	int amount=23;
	/*
	 * which is actuall
	 * public static final int amount=23;
	 * and can only be accessed in a static way
	 */
	public static final int amount2=56;
	//abstract
	void calcWages();
	//default
	default void calcTax(){
		System.out.println("calculating tax");
	}
	//abstract
	void calcUsc();
	/*
	 * static method in a interface can only be
	 * called in a static way. to call this
	 * method we go Wages.calcPrsi();
	 */
	static void calcPrsi(){
		System.out.println("calculating Prsi");
	}

}
