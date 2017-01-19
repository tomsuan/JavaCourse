package com.noel;

public class Fish implements Swim{
	
	void callMethods(){
		/*
		 * only way we can call a static method
		 * in an interface is the name of
		 * the interface followed by the 
		 * method name
		 */
		Swim.statMethod();
	}

//	@Override
	public void swimSpeed() {
		System.out.println("fish swimspeed");
		
	}

}
