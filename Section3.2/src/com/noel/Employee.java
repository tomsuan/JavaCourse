package com.noel;

public class Employee {
	String  name="Noel";
	
	static void changeEmployee(Employee emp){
		
		System.out.println(emp);
		emp=new Employee();
		System.out.println("inside method "+emp.name);
		System.out.println(emp);
		
	}
	
	static void changeName(Employee emp){
		
		emp.name="Mary";
	}

}
