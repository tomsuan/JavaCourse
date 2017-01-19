package com.noel;

public class Main {
	public static void main(String[]args){
		Accountant andy=new Accountant();
		
		andy.clockIn();
		andy.earn();
		andy.fiddleTheBooks();
		
		System.out.println(andy.age);
		System.out.println(andy.name);
		System.out.println(andy.pps);
		System.out.println(andy.qualifications[0]);
		System.out.println(andy.qualifications[1]);
		/*
		 * reference determines what methods and 
		 * variables can be called, only methods first
		 * defined in the Employee class can be 
		 * called
		 * Has to be a super class reference to
		 * a sub class object
		 */
		Employee eddie=new Accountant();
		/*
		 * it can't be the other way around
		 */
		//Accountant ann=new Employee();
		//always check it's own class first
		//takes it's implmentation from the accountant class
		eddie.earn();
		//takes implementation from Employee class
		eddie.holiday();
		System.out.println(eddie.age);
		System.out.println(eddie.name);
		System.out.println(eddie.pps);
		/*
		 * an interface reference to a class object
		 * that implements the interface
		 * 
		 */
		Work workAccount=new Accountant();
		workAccount.clockIn();
		/*
		 * this object can only perform fight moves
		 * and nothing else
		 * you can't create an interface object
		 * you can't use the keyword "new"
		 * with an interface
		 */
		Fight fighter=new Person();
		fighter.stab();
		//work is an interface so can't do this
		//Employee myEmployee=new Work();
		/*
		 * this is an array of objects that implement
		 * the Work interface
		 */
		Work[] workEmployees=new Work[4];
		
		workEmployees[0]=new Accountant();
		workEmployees[1]=new Fireman();
		workEmployees[2]=new Accountant();
		workEmployees[3]=new Fireman();
		System.out.println("Clock in for employees");
		for(Work w:workEmployees){
			w.clockIn();
		}
		
		Employee[]empList={new Accountant(),new Fireman(),
				new Accountant(),new Fireman()};
		/*
		 * only has access to variable first declared
		 * in Employee class and methods first
		 * declared in Employee class
		 */
		for(Employee e:empList){
			e.earn();
			e.holiday();
		}
		
		
		
	}

}
