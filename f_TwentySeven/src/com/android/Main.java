package com.android;

public class Main {

	public static void main(String[] args) {
		Accountant andy=new Accountant();
		/*
		 * calls the Accountant work method, which
		 * calls three other method unique to the 
		 * accountant class
		 */
		andy.work();
		ForensicAccountant fred = new ForensicAccountant();
		ChartedAccount charlie = new ChartedAccount();
		
		fred.work();//will take the ForensicAccountant work method
		charlie.work();//will take the Accountant work method
		
		HumanResources Hanna = new HumanResources();
		/*Human resources extends Employee, so it
		 * takes the Employee's implementation of
		 * the work method
		 */
		Hanna.work();
		System.out.println("creating a One object");
		One num=new One();
		Two num2=new Two();
		Three num3=new Three();
		
		num.callSuper();
		//mammal extends Animal
		Mammal manny=new Mammal();
		//Ape extends Mammal
		Ape angus=new Ape();
		//both have a printMe method which 
		//issues calls to super class methods and values
		System.out.println("print out ape and mammal");
		manny.callSuper();
		angus.callSuper();
		
		
		

	}

}
