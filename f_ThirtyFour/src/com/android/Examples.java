package com.android;

public class Examples {
	
	static void ex1(){
		Dog spot=new Dog();
		Cat tibbles = new Cat();
		
		spot.eat();//implementing the abstract method
		spot.drink();//implementing the abstract method
		spot.sleep();//using the Animal sleep() method
		
		tibbles.eat();
		tibbles.drink();
		tibbles.sleep();//overriding the Animal sleep()method
		/*
		 * you can't use the "new" keyword with
		 * an abstract class
		 * this will give an error
		 */
		//Animal andy=new Animal();
		/*
		 * this an super class reference to a 
		 * sub class object
		 */
		Animal andy=new Dog();
		/*
		 * you can't have a object that is a an
		 * abstranct class
		 */
		//Dog dennis = new Animal();
		andy.eat();
	}
	
	static void ex2(){
		forensicAccount freddie = new forensicAccount();
		freddie.eat();
		freddie.calculate();
		freddie.work();
		/*
		 * this is a abstract class employee 
		 * referencing a forensicAccountant object
		 * when calling a method, what determines
		 * what method is called, is the reference
		 * notice how eddie does not have a
		 * calculate() method, eddie only has
		 * the methods that are available to 
		 * the employee class
		 */
		Employee eddie=new forensicAccount();
		eddie.work();
		
	}
	
	static void ex3(){
		 Wizard willie = new Wizard();
		 willie.fly();
		 willie.frustrated(3.4, "willie");
		 /*
		  * can't create an instance of an abstract
		  * class and an interface is a totally
		  * abstract class. So the below will give
		  * and error. you can't use the new keyword
		  * with an abstract class or an interface
		  */
		// Behaviour myBehaviour=new Behaviour();
		 
		 /*
		  * with an ordinary wizard object i can access
		  * the age and name of the wizard
		  * and all of its methods
		  */
		 System.out.println(willie.age);
		 /*
		  * a Behaviour interface reference to a 
		  * wizard object
		  * this will allow only access to the
		  * behaviour interface methods that 
		  * are implemented by the wizard
		  * In other words, this wizard can only
		  * be happy, sad, frustrated, angry
		  * he has no access to any of the 
		  * movement methods or his name or age
		  */
		 Behaviour wizBehaviour=new Wizard();
		 wizBehaviour.angry();
		 wizBehaviour.sad();
		 /*
		  * a interface reference can only
		  * be assigned to a class that 
		  * implements it
		  */
		 Movement insectMove=new Insect();
		 insectMove.run();
		 insectMove.fly();
		 /*
		  * three new objects, each one of these
		  * objects implement the behaviour
		  * interface
		  */
		 Soilder sally=new Soilder();
		 Warrior walter=new Warrior();
		 Wizard wanda=new Wizard();
		 /*
		  * creates an array of type Behaviour
		  * so we populate the array with objects
		  * that implements behaviour interface
		  */
		 Behaviour[]behave={sally,walter,wanda};
		 System.out.println("Our Behaviours");
		 for(Behaviour b:behave){
			 b.angry();
			 b.sad();
			
		 }
		 
	}
	
	
	

}
