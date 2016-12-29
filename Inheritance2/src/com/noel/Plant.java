package com.noel;

public abstract class Plant {
	/*
	 * an abstract class does not have to have
	 * abstract methods, it can have all concrete
	 * methods
	 */
	void grow(){
		
	}
	
	void reproduce(){
		
	}
}

class Flower extends Plant{
	
}
/*
 * an abstract class can extends a concrete 
 * class
 */
abstract class Rose extends Flower{
	
}

class PinkRose extends Rose{
	
}
