package com.noel;

public class Test implements Interface1{

	@Override
	public void testMethod() {
		System.out.println("testMethod");
		
	}
	@Override
	public void defMethod(){
		System.out.println("defMethod in test");
	}
	/*totally different method from the 
	 * statMethod in the Interface1 interface
	 */
	static void statMethod(){
		System.out.println("statmethod in test");
	}

}
