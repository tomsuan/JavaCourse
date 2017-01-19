package com.noel;

import java.util.ArrayList;

/**
 * Exam objective 3.2 Test eqaulity between strings
 * and other objects using == and equals()
 * @author noelf
 *
 */
public class Main {

	public static void main(String[] args) {
		String str="hank";
		String str2="hank";
		String str3="mary";
		String str4=new String("mary");
		//both print true
		System.out.println(str==str2);
		System.out.println(str.equals(str2));
		//both print false
		System.out.println(str2==str3);
		System.out.println(str2.equals(str3));
		/*
		 * this will print false as these are
		 * two different objects, because when
		 * we use the new() keyword this variable
		 * does not check the pool or add to the
		 * pool
		 */
		System.out.println(str3==str4);
		/*
		 * this will print true, because this 
		 * uses the String class equals() method
		 * which is an overriden method from
		 * the object class
		 */
		System.out.println(str3.equals(str4));
		
		Dog spot = new Dog();
		Dog rex=new Dog();
		Dog lassie=spot;
		/*
		 * this is taking the object class 
		 * implementation of the equals method
		 * which returns true if they are the 
		 * same object
		 */
		System.out.println("comparing dogs");
		System.out.println(spot.equals(rex));
		System.out.println(spot.equals(lassie));
		
		Dog dog1=new Dog("benji",2);
		Dog dog2=new Dog("benji",2);
		System.out.println("comparing two identical dogs");
		System.out.println(dog1.equals(dog2));
		
		/*
		 * this is what the equals method looks like
		 * for a class that does not define its own
		 * equals() method
		 * public boolean equals(Object obj) {
return (this == obj);
}
		 */
		
		Cat cat1=new Cat("tibbles",2);
		Cat cat2=new Cat("tibbles",2);
		Cat cat3=cat1;
		Cat cat4=new Cat("fluffy",2);
		
		System.out.println(cat1.equals(cat2));
		
		System.out.println(cat2.equals(cat4));
		
		cat1=new Cat("tibbles",23);
		cat2=new Cat("fluffy",5);
		cat3=new Cat("beezer",2);
		cat4=new Cat("buster",3);
		Cat cat5=new Cat("scarlett",7);
		Cat cat6=new Cat("harry",7);
		Cat cat7=new Cat("beezer",2);
		
		ArrayList<Cat>catList=new ArrayList<>();
		catList.add(cat1);
		catList.add(cat2);
		catList.add(cat3);
		catList.add(cat4);
		catList.add(cat5);
		catList.add(cat6);	
		catList.add(cat7);
		//remove() contains()
		catList.remove(cat4);
		/*
		 * this will remove the first instance
		 * of beezer from the arraylist.
		 * the remove method uses the equals()
		 * method to find a particular object
		 * with certain atributes
		 * in this case it is looking for a cat
		 * called beezer and is 2 years old
		 */
		catList.remove(new Cat("beezer",2));
		System.out.println(catList);
		
		Person person1= new Person("percy",34);
		Person person2=new Person("percy",56);
		/*
		 * the overriden method in the Person class
		 * only checks the name of the person, so if
		 * they have the same name, equals() returns
		 * true
		 */
		System.out.println(person1.equals(person2));
		
		

	}

}
