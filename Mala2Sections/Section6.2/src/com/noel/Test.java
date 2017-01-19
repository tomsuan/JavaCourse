package com.noel;

public class Test implements InterfaceTypes{
	static int statInt=45;
	
	static void statMethod(){
		System.out.println("statMethod");
	}

	@Override
	public void method1() {
		System.out.println(" test method1");
		
	}

	@Override
	public void method2() {
		System.out.println("test method 2");
		
	}

	@Override
	public void takeApe(Ape magilla) {
		System.out.println("takeApe Method");
		
	}

	@Override
	public Ape returnApe(Ape magilla) {
		Human hanna=new Human();
		// TODO Auto-generated method stub
		return hanna;
	}
	//can only send it a human
	Human returnHuman(Human myHuman){
		//can only return a human
		return new Human();
	}
	
	

}
