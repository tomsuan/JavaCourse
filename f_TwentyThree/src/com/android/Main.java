package com.android;

public class Main {

	public static void main(String[] args) {
		Dog lassie=new Dog();
		//these are all references (names)
		Dog benji=lassie;
		Dog rex=lassie;
		Dog milo=lassie;
		//comparator, seeing if they are the SAME
		//Dog
		//this will print out true
		System.out.println(benji==rex);
		/*
		 * create three new dogs and assign them
		 * to our existing dog references (names
		 */
		benji=new Dog();
		rex=new Dog();
		milo=new Dog();
		System.out.println(benji.age);
		System.out.println(lassie.age);
		//this means only lassie is assigned to lassie
		//all dogs are now different
		
		Cat tibbles=new Cat();
		Cat tom=new Cat();
		Cat sylvester=new Cat();
		/*
		 * values have to be passed the order
		 * they are in the constructor
		 * in this case its a int, double,double,
		 * string
		 */
		Swan sammy=new Swan(6,12,4.2,"Sammy");
		System.out.println(sammy.age);
		System.out.println(sammy.name);
		System.out.println(sammy.weight);
		System.out.println(sammy.height);
		
		Person percy=new Person(23,"Mary",true);
		//sends a int, a string and person
		Pig murty=new Pig(4,"murty",percy);
		/*
		 * this method is going to call three other 
		 * methods, which are two(),three() and four()
		 */
		murty.one();
		
		
		

	}

}
