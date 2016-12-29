package com.noel;

public class Examples {
	static void ex1(){
		Animal andy = new Animal();
		Mammal manny=new Mammal();
		Dolphin flipper=new Dolphin();
		/*
		 * Animal only has access to it's own variables
		 * as it is not inheriting from a class (other
		 * than the object class which every object does)
		 */
		System.out.println("our Animal");
		System.out.println(andy.age);
		System.out.println(andy.weight);
		/*
		 * Mammal inherits from Animal class so it has
		 * access to same variables as animal as well as it's
		 * own pregnancyTime variable
		 */
		System.out.println("our Mammal");
		System.out.println(manny.age);
		System.out.println(manny.weight);
		System.out.println(manny.pregnancyTime);
		System.out.println("Our Dolphin");
		System.out.println(flipper.age);
		System.out.println(flipper.weight);
		System.out.println(flipper.pregnancyTime);
		System.out.println(flipper.swimSpeed);
	}
	
	static void ex2(){
		Bird biddy=new Bird();
		Domestic donald=new Domestic();
		Chicken licken=new Chicken();
		
		System.out.println("our Bird");
	//	System.out.println(new Bird().drink(););
		new Bird().drink();
		biddy.drink();
		System.out.println("our Domestic");
		/*
		 * this is overriden from the Bird class
		 * so it takes it's implementation from
		 * the domestic class
		 */
		donald.eat();
		/*
		 * takes it's implementation from the
		 * bird class, because there is no
		 * drink method implementation
		 *  in the domestic class
		 */
		donald.drink();
		/*
		 * the peck method is defined and 
		 * implemented in the domestic class
		 */
		donald.peck();
		/*
		 * this is overridng the drink() method
		 * in the Bird class, so it has an 
		 * implementation in the Chicken class
		 */
		licken.drink();
		/*
		 * this is using the implemenation from
		 * the domestic class, which overrides
		 * the eat() method in the Bird class.
		 * the chicken class does not have a eat
		 * method of it's own
		 */
		licken.eat();
		/*
		 * this is overriding the peck() method
		 * in the domestic class. there is a peck
		 * method in the chicken class and it uses
		 * this implementation
		 */
		licken.peck();
		/*
		 * this is a method unique to the chicken
		 * class and only available to chickens
		 */
		licken.lay();
	}
	
	static void ex3(){
		System.out.println("create fish");
		Fish fergal=new Fish();
		System.out.println("Create shark");
		Shark siobhan=new Shark();
		System.out.println("create Great white");
		GreatWhite gilbert=new GreatWhite();
	}
	
	static void ex4(){
		//Human myHuman=new Ape();
	
		Human myHuman=new Human();
		myHuman.drink();
		myHuman.eat();
		myHuman.speak();
		myHuman.useTools();	
		/*
		 * a super class reference to a
		 * sub class object can only call
		 * methods that are defined in the 
		 * super class but it's implementation
		 * can come from derived class
		 */
		Ape apeMan=new Human();
		System.out.println("our apeMan");
		/*
		 * drink() first defined in Ape class
		 * and it's overridden in Human class
		 */
		apeMan.drink();
		/*
		 * eat() first defined in the Ape class
		 * but it's overridden in the Monkey class
		 * which is a super class of the Human 
		 * class
		 */
		apeMan.eat();
		
		
	}
	
	static void ex5(){
		/*
		 * super class reference to a 
		 * sub class object.
		 * this means it only has access to
		 * the methods defined in the super class
		 * but its implementation CAN come from 
		 * the sub class
		 * this object can only eat() and drink()
		 * 
		 */
		Insect inTaratula=new Tarantula();
		System.out.println("super tarantula");
		inTaratula.drink();
		inTaratula.eat();
		System.out.println("ordinary tarantula");
		Tarantula terri=new Tarantula();
		terri.drink();
		terri.eat();
		terri.web();
		/*
		 * working from the spider class
		 * as opposed to the insect class
		 */
		Spider sally=new Tarantula();
		sally.drink();
		sally.eat();
		sally.web();
	}
	
	static void ex6(){
		Doctor phil=new Doctor();
		phil.drink();
		phil.eat();
		phil.wages();
		/*
		 * this will not work as you can't
		 * create a object of an abstract 
		 * class
		 */
		//Employee myEmployee = new Employee();
		//myEmployee.wages();
		System.out.println("person Doctor");
		Person perDoc=new Doctor();
		perDoc.drink();
		perDoc.eat();
	}
	
	static void ex7(){
	/*	Cat tibbles = new Cat();
		System.out.println("tibbles the cat");
		tibbles.freedom();*/
		Swan mySwam=new Swan();
		mySwam.procreate();
		mySwam.hungry();
		mySwam.thirsty();
		mySwam.freedom();
		
		Calculations.tax(25000);
	
	}
	
	static void ex8(){
		/*
		 * can't do this as Desire is an 
		 * interface and an inteface is 
		 * abstract, can't use new() with 
		 * it
		 */
		//Desire myDesire=new Desire();
		/*
		 * you can have an inteface reference
		 * to a concrete object
		 */
		Desire catDesire=new Cat();
		//Desire swanDesire=new Swan();
		catDesire.procreate();
		catDesire.thirsty();
		catDesire.hungry();
	}

}
