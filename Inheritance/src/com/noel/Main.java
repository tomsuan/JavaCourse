package com.noel;

public class Main {

	public static void main(String[] args) {
		Setter sammy=new Setter();
		/*
		 * sammy gets variables from Animal
		 * Dog and Setter class
		 */
		/*
		 * a dog will have access to the variables
		 * and methods of the animal and Dog class
		 */
		Dog spot=new Dog();
		/*
		 * a animal will have access to only
		 * the variables and methods of the Animal
		 * class
		 */
		Animal andy=new Animal();
		//age from animal class
		System.out.println(sammy.age);
		//colour from dog class
		System.out.println(sammy.colour);
		//prize from setter class
		System.out.println(sammy.prize);
		//calls run method from the animal class
		sammy.run();
		//calls breed method from the Dog class
		sammy.breed();
		/*
		 * it will always call a method in its
		 * own class first
		 * there is a drink() method in the 
		 * setter class
		 */
		sammy.drink();
		/*
		 * will take the eat() implmentaton from
		 * the dog class as it does not have it's 
		 * own
		 */
		sammy.eat();
		/*
		 * andy.eat() takes the dog classes 
		 * implementation
		 */
		andy.eat();
		/*
		 * the eat() method is overriden in the
		 * Dog class, so it uses the Dog classes
		 * implmentation of the eat method
		 */
		spot.eat();
		
		Employee eddie=new Employee();
		Person percy=new Person();
		/*
		 * eddie takes his implmentation for 
		 * the eat method from the employee 
		 * class, but it is first defined in 
		 * the person class. So this is a 
		 * Overriden method
		 */
		eddie.eat();
		/*
		 * eddie takes implementation of the drink
		 * method from the Person class, as there
		 * is no implementation for this in the 
		 * employee
		 */
		eddie.drink();
		/*
		 * an employee is the only object that 
		 * can use the methods takeBreaks() and
		 * calcTax(). As they are only defined
		 * and implemented in the Employee class
		 */
		eddie.takeBreaks();
		eddie.calcTax();/*
		there two will not compile as a Person has
		no access to the methods takeBreaks() or
		calcTax. compilation erro
		*/
		//percy.takeBreaks();
		//percy.calcTax();
		/*
		 * this works because an employee is 
		 * a person
		 */
		/*
		 * you can have a super class reference
		 * to a subclass object
		 * can only use methods that were
		 * first defined in the Person class
		 * which are drink() and eat()
		 */
		Person perEmp=new Employee();
		
		perEmp.drink();
		/*
		 * the eat() method was first defined in
		 * the Person class. however the eat()
		 * method is overriden in the Employee
		 * class, so it's implementation will 
		 * be taken from the Employee class
		 * this object can only use methods first
		 * defined in its base class, but it takes
		 * it's implementation from its overriden
		 * method in the Employee class
		 */
		perEmp.eat();
		/*
		 * YOU CAN't have a sub class reference
		 * to a superclass object
		 */
		//Employee empPer=new Person();
		
		Animal anDog=new Dog();
		
	//	Dog dogAnimal=new Animal()
		
		Building houseBuild=new House();
		Building bungBuild=new Bungalow();
		
		
		

	}

}
