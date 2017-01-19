package com.noel;
/*
 * when you implment a interface you have
 * to override all the abstract methods 
 * in it. our behaviour interface contains
 * sad(), mad() and happy(), so then the Dog
 * class has to have a Public sad(), public 
 * mad() and public happy()method
 */
public class Dog implements Behaviour {

	@Override
	public void sad() {
		System.out.println("Dog sad");
		
	}

	@Override
	public void mad() {
		System.out.println("Dog mad");
		
	}

	@Override
	public void happy() {
		System.out.println("Dog Happy");
		
	}

}

class Collie extends Dog{
	public void sad(){
		System.out.println("Collie sad");
	}
}

class BorderCollie extends Collie{
	public void mad(){
		System.out.println("Border collie mad");
	}
	
}
