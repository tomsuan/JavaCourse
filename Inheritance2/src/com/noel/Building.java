package com.noel;

public abstract class Building {
	
		abstract void heating();
}
/*
 * an abstract class can inherit from an abstract
 * class
 */
abstract class House extends Building{
	abstract void light();	
}
/*
 * all abstract classes have to be implmemented
 * as soon as a concrete class is encountered
 */
class Bungalow extends House{

	@Override
	void light() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void heating() {
		// TODO Auto-generated method stub
		
	}
	
}
