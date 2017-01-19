package com.noel;

public class Ape {
	double weight;
	int age;
	void walk(){	
	}
	void walk(int num){	
		System.out.println("ape walking");
	}
}

class Monkey extends Ape{
	boolean treeDwelling;
	/*
	 * overrriden(non-Javadoc)
	 * @see com.noel.Ape#walk()
	 */
	void walk(){		
	}
	/*
	 * overloaded
	 */
	void walk(String str){		
	}
	/*
	 * Overriden
	 */
	void walk(int num){
		System.out.println("Monkey walking");
	}
	
}

class Chimp extends Monkey{
	String breed;
	
}

class Human extends Ape{
	int iq;
	
}
