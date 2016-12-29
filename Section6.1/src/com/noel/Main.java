package com.noel;
/*
 * Exam Objective 7.1 Describe Inheritance 
 * and its benefits
 * Exam Objective 7.5 Use Abstract classes and
 * interfaces
 */
public class Main {

	public static void main(String[] args) {
		Employee eddie = new Employee();
		/*
		 * getClass() methods is a method
		 * from the java.lang.object class
		 * as all objects inherit from this
		 * class
		 */
		System.out.println(eddie.getClass());
		
		Employee etna=new Employee("Etna");
		Fireman sam=new Fireman();
		sam.name="sam";
		Secretary sean=new Secretary();
		sean.name="sean";
		/*
		 * this demonstrates extensibilty
		 * in that we can send a fireman, a 
		 * employee or a secretary to this method
		 * as it takes an Employee object
		 */
		eddie.sendInvitation(sam);
		eddie.sendInvitation(etna);
		eddie.sendInvitation(sean);
		
		Animal andy=new Animal();
		Dog spot = new Dog();
		/*
		 * this works as we are sending an animal
		 * to this method
		 */
		andy.takeAnimal(andy);
		/*
		 * this does not work as Dog DOES NOT 
		 * extend Animal.
		 * if we wanted this to work, we would
		 * have to define a new method called
		 * takeAnimal in the Dog Class. We would
		 * actually have to create two methods
		 * called takeAnimal in the Dog class,
		 * takeAnimal(Dog myDog) and 
		 * takeAnimal(Animal myAnimal)
		 */
		//andy.takeAnimal(spot);
		/*
		 * abstract reference to a concrete
		 * class. can't use the new Keyword
		 * with a abstract class
		 * Rose is abstract
		 * EnglishRose is concrete
		 */
		Rose myRose=new EnglishRose();

	}

}
