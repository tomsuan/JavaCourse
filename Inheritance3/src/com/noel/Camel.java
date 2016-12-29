package com.noel;

public class Camel implements Movement{

	@Override
	public void walk() {
		System.out.println("camel walking");
		
	}
	
	public void run(){
		System.out.println("camel running");
	}

}
