package com.noel;
/*
 * if a class implements a interface, the
 * methods from that interface have to be
 * Public in the class
 */
public class Vehicle implements Movement{
	/*
when overriding you can't make a method
LESS accessible
	 */
	@Override
	/*
	 * it can't be private void fly()
	 * can't be protected void fly()
	 * can't be void fly() as this is 
	 * default level access
	 */
	public void fly() {
		// TODO Auto-generated method stub		
	}
	@Override
	public void sailing() {
		// TODO Auto-generated method stub		
	}
	@Override
	public void driving() {
		// TODO Auto-generated method stub	
	}
	
}
abstract class Air extends Vehicle{	
}
class Plane extends Air{
	/*
	 * this has to be public as you can't
	 * make it less accessible
	 */
	public void fly(){
		
	}
}
