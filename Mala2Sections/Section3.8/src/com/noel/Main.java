package com.noel;
/**
 * Exam Objective 6.6 Determine the effect upon
 * object references and primitive values when they
 * are passed into methods that change the values
 * @author noelf
 *
 */
public class Main {

	public static void main(String[] args) {
		Dog spot=new Dog();
		/*
		 * if you pass a primitive variable to a method
		 * this method then changes the value of 
		 * the primitive, it still has the same original
		 * value from where it was called
		 */
		/*
		 * these two values will not have changed
		 * here in main, num will be 10, myBool will
		 * be false
		 */
		int num=10;
		boolean myBool=false;
		System.out.println("before method call");
		/*
		 * will print 10 and false
		 */
		System.out.println("num is "+num);
		System.out.println("myBool is "+myBool);
		Change.changePrimitive(num, myBool);
		/*
		 * after method call will print out 10 
		 * and false
		 */
		System.out.println("num is now "+num
				+" myBool is now "+myBool);
		
		spot.name="lassie";
		System.out.println("name of dog is "+spot.name);
		System.out.println(spot);
	//	spot=new Dog();
	//	System.out.println(spot);
		Change.changeObject(spot);
		System.out.println("dog is now "+spot);
		System.out.println("dog in main is "+spot.name);
		
		Dog benji=new Dog();
		benji.name="benji";
		benji.age=4;
		System.out.println(benji);
		System.out.println("before method name "+benji.name+
				" "+benji.age);
		Change.changeInstance(benji);
		System.out.println("after method name "+benji.name+
				" "+benji.age);
		System.out.println(benji);
		
		Cat mrTom=new Cat();
		System.out.println(mrTom);
		System.out.println(mrTom.age);
		System.out.println(mrTom.name);
		System.out.println(mrTom.weight);
		Change.changeCat(mrTom);
		System.out.println(mrTom);
		System.out.println(mrTom.age);
		System.out.println(mrTom.name);
		System.out.println(mrTom.weight);
		

	}

}
