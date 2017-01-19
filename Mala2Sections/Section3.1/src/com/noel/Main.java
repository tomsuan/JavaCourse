package com.noel;
/**
 * Exam Objective 1.1 Define the Scope 
 * of variables
 * @author noelf
 *
 */
public class Main {

	public static void main(String[] args) {
		/*
		 * access a static variable in a static way
		 * this is the recommened way to access
		 * a static variable
		 */
		System.out.println(Local.examId);
		/*
		 * accessing a static variable in a non static
		 * way
		 * its not recommended that you access static
		 * variables in a non static way
		 */
		Local myLocal=new Local();
		System.out.println(myLocal.examId);
		
		Pupil paul=new Pupil("paul",21);
		Pupil pauline=new Pupil("pauline",19);
		paul.eat();
		pauline.eat();
		/*
		 * i do not have to create a pupil to access
		 * the static method takeCourse, as this 
		 * method applies to all of the pupils, not
		 * just ONE, so it follows you can't access
		 * an individual pupils name or age
		 */
		Pupil.takeCourse();
		Dog spot=new Dog();
		Dog lassie=new Dog();
		Dog benji=new Dog();
		spot.name="spot";
		spot.weight=23.4;
		lassie.name="lassie";
		lassie.weight=12.5;
		benji.name="benji";
		benji.weight=2.3;
		/*every dog shares the static variable
		 * packId, so every dog has the same
		 * packId, this means if we change it for
		 * one dog, we change for every dog
		 */
		System.out.println("spot name "+spot.name+" "
				+ "packId is "+spot.packId);
		System.out.println("lassie name "+lassie.name+" "
				+ "packId is "+lassie.packId);
		System.out.println("benji name "+benji.name+" "
				+ "packId is "+benji.packId);
		
		spot.packId=34546;
		System.out.println("spot name "+spot.name+" "
				+ "packId is "+spot.packId);
		System.out.println("lassie name "+lassie.name+" "
				+ "packId is "+lassie.packId);
		System.out.println("benji name "+benji.name+" "
				+ "packId is "+benji.packId);
		
		//accessing in a static way
		Dog.packId=123390;
		/*
		 * accessing in a non static way
		 * every dog now has the below changed id
		 */
		spot.packId=3566;
		/*
		 * every Dog has its own eat() method
		 */
		spot.eat();
		lassie.eat();
		benji.eat();
		/*
		 * but the hunt() method is shared by ALL
		 * dogs. this is something ALL Dogs do, not
		 * just one Dog. dog.hunt() is a static method,
		 * so we can access the static variable packId
		 * inside the method but none of the instance 
		 * variables such as name and weight
		 */
		Dog.hunt();
		//accessing a static variable
		System.out.println(Dog.packId);
	}

}
