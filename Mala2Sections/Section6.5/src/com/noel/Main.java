package com.noel;
/*
 * use this and super to access objects and 
 * constructors
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee eddie=new Employee();
		System.out.println(eddie.age);
		System.out.println(eddie.name);
		
		Employee etna=new Employee(45);
		
		etna.duties();
		
		Accountant ann=new Accountant();
		System.out.println("Accountant");
		ann.callThis();
		
		Dog spot=new Dog();
		spot.accessSuper();
		
		Ferrari fred=new Ferrari();
		Vehicle v1=new Vehicle();
		Vehicle v2=new Vehicle();
		Vehicle v3=new Vehicle();
		System.out.println(Vehicle.count);
		System.out.println(v1.count);
		System.out.println(v2.count);
		//this is liable for garbage collection
		new Employee().earn();
		/*
		 * a super class reference to a sub
		 * class object
		 */
		Building building1=new Building();
		House myHouse=new House();
		System.out.println("buliding");
		System.out.println(building1.age);
		System.out.println(building1.address);
		building1.calcCosts();
		System.out.println("house");
		System.out.println(myHouse.age);
		System.out.println(myHouse.address);
		myHouse.calcCosts();
		/*
		 * when a class extends another class and both
		 * classes have the same variable names and types 
		 * and same method signatures in both classes
		 * the rule is:
		 * the variable values are taken from the base class
		 * the method implementation is taken from the 
		 * sub class.
		 * in this case the value of the variables "age" and
		 * "name" are taken from the building class
		 * and the calcCosts()method implementation is taken
		 * from the house class
		 */
		Building buildHouse=new House();
		System.out.println("buildHouse");
		System.out.println(buildHouse.age);
		System.out.println(buildHouse.address);
		buildHouse.calcCosts();
		

	}

}
