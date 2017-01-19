/*
 * Exam Objective 7.5 Use abstract classes 
 * and interfaces
 * Exam Objective 6.2 apply the static keyword
 * to methods and fields
 */
package com.android;

public class Main {

	public static void main(String[] args) {
		Dog spot=new Dog();
		/*
		 * takes the mad() method from the
		 * Animal Class. As the Dog class does
		 * not override it
		 */
		spot.mad();
		/*
		 * takes the happy() method from the
		 * Dog class. As the Dog class overrides
		 * the abtract happy method in the Animal
		 * class
		 */
		spot.happy();
		/*
		 * takes the sad()method from the Dog
		 * class. As the Dog class overrides the
		 * concrete sad method in the animal 
		 * class
		 * the difference between overriding concrete
		 * and abstract methods, is YOU HAVE TO 
		 * OVERRIDE ABSTRACT, you do not have override
		 * concrete methods
		 */
		spot.sad();
		
		RattleSnake ronnie=new RattleSnake();
		
		ronnie.happy();
		ronnie.mad();
		ronnie.sad();
		ronnie.bite();
		
		Ape andy=new Ape();
		andy.jealous();//overridden from interface behaviour
		andy.joy();//overridden from interface behaviour
		andy.anger();//overriden from interface behaviour
		/*
		 * nervous takes whatever the default implmentation
		 * is and uses that, but you can override this
		 * method in the ape class if you want too
		 */
		andy.nervous();
		/*
		 * accessing a static variable by class
		 * (recommended)
		 */
		System.out.println("course code "
				+ ""+Trainee.courseCode);
		/*
		 * access them by an instance variable
		 */
		Trainee terry = new Trainee();
		/*
		 * this means the course code is changed
		 * for EVERYONE
		 */
		terry.courseCode=4578;
		System.out.println(terry.courseCode);
		
		Trainee tessa=new Trainee();
		System.out.println("tessa "+tessa.courseCode);
		/*
		 * also called class methods, you should
		 * access them the same way as static 
		 * variables. which the name of the class
		 * followed by the method name
		 */
		Trainee.statMethod();
		/*
		 * created a Trainee called none that
		 * points to a null object
		 */
		Trainee none=null;
		/*
		 * this generates a nullPointerException
		 * if we try to access a instance atribtute
		 * such as age, we get the exception. as 
		 * the trainee reference none, points to
		 * a null object
		 * NullPointerException is another example
		 * of a RunTimeException, we have previously
		 * seen arrayIndexOutOfBounds
		 */
		//System.out.println(none.age);
		/*
		 * you can access static variables and methods
		 * with a null object
		 */
		System.out.println("access with null "
				+ ""+none.courseCode);
	}

}
