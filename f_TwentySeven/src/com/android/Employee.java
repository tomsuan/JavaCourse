package com.android;
/*
 * You can only have ONE Public Class per file
 * File. the name of this public class has to
 * match the name of the file
 */
public class Employee {
	int pps;
	String name;
	double wages;
	
	void work(){
		System.out.println("I am an employee working");
	}
}

class Accountant extends Employee{
	//an array of certifications
	String[]Certifications;
	double allowances;
	boolean healthPlan;
	//overriden work()Methods
	void work(){
			billing();
			calcWages();
			doBudgets();
	}
	
	void billing(){
		System.out.println(" I do billing");
	}
	
	void calcWages(){
		System.out.println("I calculate wages");
	}
	
	void doBudgets(){
		System.out.println("I do budgets ");
	}	
}

class ForensicAccountant extends Accountant{
		//has no work method
	}

class ChartedAccount extends Accountant{
	
	void work(){
		System.out.println(" I am a charted Accountant");
	}
}

class HumanResources extends Employee{
	//where does it get it's work method from?
	/*going to take the employees implemenation
	 * of the work method
	 */
	
}

