package com.noel;

public class Examples {
	
	static void ex1(){
		Dog spot=new Dog();
		Cat tibbles = new Cat();
		/*
		 * A dog reference to a dog Object 
		 * can call all methods that the
		 * object contains and also all interfaces it 
		 * implments and all methods it inherits from it's
		 * base class
		 */
		spot.breed();
		spot.drink();
		spot.eat();
		spot.mad();
		spot.happy();
		spot.sad();
		spot.pant();
		/*
		 * the above rule applies to all objects
		 */
		System.out.println("my Cat");
		tibbles.breed();
		tibbles.drink();
		tibbles.eat();
		tibbles.mad();
		tibbles.happy();
		tibbles.sad();
		/*
		 * this is a Behaviour reference
		 * to a Dog object.
		 * you can only assign this reference
		 * to an object that implements the
		 * behaviour interface
		 */
		Behaviour behaveDog=new Dog();
		Behaviour behaveCat=new Cat();
		/*
		 * this object only allows access to
		 * methods and variables inside the
		 * interface
		 */
		System.out.println("behave Dog");
		behaveDog.happy();
		/*
		 * Dog does not need to override
		 * mad() as this is a default method
		 * in the behaviour interface
		 */
		behaveDog.mad();
		behaveDog.sad();
		
		System.out.println("Behave Cat");
		tibbles.happy();
		tibbles.mad();
		tibbles.sad();
		/*
		 * this is a superclass reference to
		 * a subclass object
		 */
		Animal anDog=new Dog();
		//this is not allowed
		//Dog dogAnimal=new Animal();
		anDog.breed();
		anDog.drink();
		anDog.eat();	
	}
	static void ex2(){
		/*
		 * to see multiple implementation 
		 * go to duck class
		 * to see overriding methods and 
		 * accessibilty go to Ape class
		 */
	}
	
	static void ex3(){
		Deer bambi=new Deer();
		/*
		 * deer implements the Run interface
		 * which extends the Move interface
		 * an interface can extend an interface
		 * however an interface CANNOT implement
		 * another interface.
		 */
		bambi.landBased();
		bambi.runSpeed();
		/*
		 * accessing our variable in the Run
		 * interface in a static way
		 */
		System.out.println(Run.finalInt);
		/*
		 * accessing the variable of the interface
		 * via a object of a class that implements
		 * the Run interface. Accessign in a 
		 * non static way
		 */
		System.out.println(bambi.finalNum);
		/*
		 * can access a variable of an interface
		 * via the name of a class that implements
		 * that interface. Deer implements Run so
		 * we can do the following
		 */
		System.out.println(Deer.finalInt);
	}
	
	static void ex4(){
		/*see Interface1 and interface2
		 * only non access modifiers allowed
		 * in interfaces are abstract and
		 * strictfp
		 */
	}
	static void ex5(){
		/*
		 * there are three types of methods
		 * allowed in an interface
		 * abstract
		 * default new in java 8
		 * static new in java 8
		 */
		Test testy=new Test();
		//default method
		testy.defMethod1();
		//abstract methods
		testy.method1();
		testy.method2();
		System.out.println(testy.statInt);
		System.out.println(Test.statInt);
		//accessing it in a non static way
		testy.statMethod();
		//accessing it in a static way
		Test.statMethod();
		/*
		 * only way to access a static method
		 * in an interface is the name of 
		 * the interface followed by the name
		 * of the static method
		 */
		InterfaceTypes.statMethod();
		
		Ape magilla = new Ape();
		Human harry=new Human();
		/*
		 * the method takeApe takes an Ape
		 * you can send a subclass as a
		 * parameter to a method. in this
		 * case our method takes an ape, Human
		 * is a sub class of Ape, so we can
		 * send either an ape or a human to
		 * this method
		 */
		testy.takeApe(magilla);
		testy.takeApe(harry);
		
		testy.returnHuman(harry);
		/*
		 * can't send an ape as ape is a 
		 * superclass of Human
		 */
		//testy.returnHuman(magilla)
	
	
		
	}

}
