package com.noel;
/**
 * Exam Objective 2.4 Explain an object's Lifecycle (
 * creation, dereference by reassignment and
 * garbage collection)
 * @author noelf
 *
 */
public class Main {

	public static void main(String[] args) {
		/*
		 * declares a variable of type person
		 * it DOES NOT create a person
		 */
	//	Person paul;
		/*
		 * An object is only created when
		 * a reference variable is initialised
		 */
	//	Person pauline = new Person();
		/*
		 * patsy, paul and pauline are the 
		 * same person
		 */
	//	paul=pauline;
	//	Person patsy;
	//	patsy=paul;
	//	pauline=new Person();
		/*
		 * you can't reference this, it has no name
		 * its still created and is liable for 
		 * garbage collection as soon as it is 
		 * created
		 */
	//	new Person();
	//	new Person(34);
		/*
		 * person created on line 1 is 
		 * no longer accessibe at line 6
		 * person create on line 2 is no longer
		 * accessible at line 3
		 */
		Person paul=new Person();//person x
		Person peter = new Person();//person y
		/*
		 * can access person x through patsy, peter
		 * and paul, we can no longer access person
		 * y
		 */
		Person patsy=peter=paul;
		//can no longer access person x through peter
		peter=new Person();
		//can no longer access person x through patsy
		patsy=peter;
		/*
		 * can no longer access person x through paul
		 * we can no longer access person x at all
		 */
		paul=new Person();
		/*
		 * this also dereferences paul
		 */
		paul=null;
		paul=new Person();
		/*
		 * this is deferencing by reassignment
		 * dereferencing peter in this case
		 */
		peter=paul;
		//creates our two exam objects
		
		Exam maths=new Exam("maths");
		Exam english=new Exam("english");
		
		maths.setExam(english);
		english=new Exam("olde english");
	
		/*
		 * created 4 animal objects 
		 */
		Monkey monty=new Monkey();
		Elephant nellie=new Elephant();
		Lion leo = new Lion();
		Zebra zed = new Zebra();
		System.out.println("address of "+monty);
		/*
		 * created a zoo object that takes 
		 * my four previously animals
		 */
		Zoo myZoo=new Zoo(monty,leo,nellie,zed);
		monty=new Monkey();
		nellie=new Elephant();
		leo=new Lion();
		zed=new Zebra();
		
		System.out.println(myZoo.monty);
		
		Cow bessie=new Cow("Bessie");
		Sheep flossie=new Sheep("Flossie");
		Pig babe=new Pig("Babe");
		System.out.println("name of cow "+bessie.name);
		System.out.println("name of sheep "+flossie.name);
		System.out.println("name of pig "+babe.name);
		/*
		 * this creates a farmer that has our first
		 * three animals
		 */
		Farmer fergal=new Farmer(flossie, bessie, babe);
		bessie=new Cow("Bert");
		flossie=new Sheep("Sean");
		babe=new Pig("Kevin");
		System.out.println("new name of cow "+bessie.name);
		/*
		 * this refers to the orginal cow created
		 * which is now part of the farmer fergal
		 * so we can access the original animals
		 * through fergal the farmer
		 */
		System.out.println("farmers cow is "
				+fergal.bessie.name);
		/*
		 * at this point our first sheep, cow and pig 
		 * can be accessed by fergal.flossie, fergal.bessie
		 * and fergal.babe
		 * our second sheep, cow and pig can be accessed
		 * by flossie,bessie and babe
		 */
		/*
		 * creating a NEW farmer and pass in the NEW
		 * cow, the NEW sheep and the NEW pig
		 */
		fergal=new Farmer(flossie,bessie,babe);
		/*
		 * at this point, the three original animal
		 * objects are not liable for garbage as
		 * we can no longer access them
		 * as is our orginal farmer is now also 
		 * available for garbage collection
		 */
		System.out.println(" new farmer cow is "
				+fergal.bessie.name);

	}

}
