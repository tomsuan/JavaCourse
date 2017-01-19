package com.noel;

import java.util.ArrayList;
import java.util.ListIterator;

public class Examples {
	
	static void ex1(){
		ArrayList<String>strList=new ArrayList<String>();
	
	ArrayList<String>strList2=new ArrayList<>();
	
	int[]myArray={2,3,5};
	/*
	 * we add values to an ArrayList by using the
	 * add() method
	 */
	strList.add("one");
	strList.add("two");
	strList.add("three");
	strList.add("four");
	/*
	 * an arraylist can only take objects
	 * it cannot take primitives
	 * so this will not compiles
	 */
	//ArrayList<int>intList=new Arraylist<int>();
	/*
	 * you use the wrapper class to add primitives
	 * to an arrayList
	 * wrapper classes being with a capital letter
	 */
	ArrayList<Integer>integerList=new ArrayList<>();
	ArrayList<Character>characterList=new ArrayList<>();
	ArrayList<Double>doubleList=new ArrayList<Double>();
	
	integerList.add(1);
	integerList.add(new Integer(2));
	integerList.add(3);
	integerList.add(4);
	
	for(Integer i:integerList)
		System.out.println("numbers is "+i);
	
	for(String s:strList)
		System.out.println("string is "+s);
	/*
	 * adding the number 56 at position 2 in our
	 * arrayList
	 */
	integerList.add(2,56);
	for(Integer i:integerList)
		System.out.println("numbers is "+i);
	Dog spot=new Dog();
	Dog rex=new Dog();
	Dog lassie=new Dog();
	
	ArrayList<Dog>dogList=new ArrayList<Dog>();
	dogList.add(spot);
	dogList.add(rex);
	dogList.add(lassie);
	dogList.add(new Dog());
	
	System.out.println(integerList);
	System.out.println(dogList);
	System.out.println(strList);
	
	Cat tibbles = new Cat(4,"tibbles");
	Cat fluffy=new Cat(2,"fluffy");
	Cat lucifier=new Cat(99,"Lucifer");
	Cat satan=new Cat(3,"Satan");
	
	ArrayList<Cat>catList=new ArrayList<Cat>();
	catList.add(tibbles);
	catList.add(fluffy);
	catList.add(lucifier);
	catList.add(satan);
	
	System.out.println(catList.toString());
	
	ArrayList<Animal>animalList=new ArrayList<Animal>();
	animalList.add(spot);
	animalList.add(rex);
	animalList.add(tibbles);
	animalList.add(lucifier);
	System.out.println(animalList);
	
	}
	
	static void  ex2(){
		/*
		 * when you create an arraylist, what is happening
		 * in the background is that an initial array
		 * of size 10 is created to store your values.
		 * if you store more than 10 values, a new array
		 * has to be created for every new value added.
		 * so for instance if we have 9 numbers, all nine
		 * numbers can be stored in the initial array.
		 * however if we are storing 16 numbers, a new array
		 * has to be created. if we add another number, a new
		 * array is created again.
		 */
		/*
		 * we are setting the size of the initial array
		 * this means that a new array will not be created
		 * in the background until we go over 23 numbers 
		 * in our list
		 */
		ArrayList<Integer>intList=new ArrayList<>(23);
		
		ArrayList<String>strList=new ArrayList<String>();
		strList.add("one");
		strList.add("two");
		strList.add("three");
		strList.add("four");
		
		int[]intArray=new int[4];
		/*
		 * how to access an element of an array
		 */
		System.out.println(intArray[0]);
		/*
		 * cannot access arraylists in the same
		 * way as an array
		 */
		//System.out.println(strList[0]);
		System.out.println(strList.get(0));
		System.out.println(strList.get(1));
		System.out.println(strList.get(2));
		System.out.println(strList.get(3));
		/*
		 * using an enhanced for loop to access
		 * each string
		 */
		System.out.println("Enhanced for loop");
		for(String s:strList)
			System.out.println(s);
		/*
		 * for loop we use size() method instead
		 * of length. we have to use the .get()
		 * method to access each stringg
		 */
		System.out.println("using for loop");
		for(int i=0;i<strList.size();i++)
			System.out.println(strList.get(i));
		
		Dog spot=new Dog();
		Dog rex=new Dog();
		Dog lassie=new Dog();
		
		ArrayList<Dog>dogList=new ArrayList<Dog>();
		dogList.add(spot);
		dogList.add(rex);
		dogList.add(lassie);
		dogList.add(new Dog());
		
		System.out.println("using for loop");
		for(int i=0;i<dogList.size();i++)
			System.out.println(dogList.get(i));
		
		Cat tibbles = new Cat(4,"tibbles");
		Cat fluffy=new Cat(2,"fluffy");
		Cat lucifier=new Cat(99,"Lucifer");
		Cat satan=new Cat(3,"Satan");
		
		ArrayList<Cat>catList=new ArrayList<Cat>();
		catList.add(tibbles);
		catList.add(fluffy);
		catList.add(lucifier);
		catList.add(satan);
		/*
		 * accessing just each cats name
		 */
		System.out.println("accessing name with for loop");
		for(int i=0;i<catList.size();i++){
			System.out.println(catList.get(i).name);
			/*
			 * calling the eat()method for each cat
			 */
			catList.get(i).eat();
			
		}
			
		/*
		 * will give the same answer
		 */
		System.out.println("accesing name with enhanced for loop");
		for(Cat myCat:catList){
			System.out.println(myCat.name);
			myCat.eat();
		}
		/*
		ArrayList<Integer>integerList=new ArrayList<Integer>();
		integerList.add(1);
		integerList.add(new Integer(2));
		integerList.add(3);
		integerList.add(4);
		
		ListIterator<Integer>iterator=integerList.listIterator();
		
		while(iterator.hasNext()){
			iterator.next();
		/*	if(iterator.next()>2)
				iterator.remove();
				*/
		//}
		//System.out.println(integerList);
		
		
		
		
		
		
		
		
		/*
		ArrayList<Integer>intList=new ArrayList<>(10);
		for(int i=0;i<9;i++)
			intList.add(i);
		
		ArrayList<Integer>intList2=intList;
		System.out.println(intList2==intList);
		intList2.add(45);
		//both refer to same object, so if we
		//add values to one we change for both
		System.out.println(intList2==intList);
		intList2.add(56);
		intList2.add(56);
		intList2.add(56);
		intList2.add(56);
		intList2.add(56);
		intList2.add(56);
		System.out.println(intList2==intList);
		System.out.println(intList2.size());
		System.out.println(intList.size());
		intList.set(12, 100000);
		//if we change values in one, it changes for the other one
		System.out.println(intList2.get(12));
		*/
	}
	
	static void ex3(){
		/*
		 * ListIterator is for accessing values
		 * in an arrayList
		 */
		ArrayList<Integer>integerList=new ArrayList<>();
		
		integerList.add(1);
		integerList.add(new Integer(2));
		integerList.add(3);
		integerList.add(4);
		ListIterator<Integer>iterator=
				integerList.listIterator();
		/*
		 * the method hasNext() returns true if
		 * there is another value in our list,
		 * returns false if there is not another
		 * value in our list
		 */
	/*	while(iterator.hasNext()){
			System.out.println(iterator.next());
			//System.out.println(iterator.nextIndex());
		}*/
		/*
		 * this will go through our arrayList of 
		 * Integers, and any number greater than
		 * 2 will be removed
		 * iterator allows you to remove elements
		 * as you are adding new elements to an
		 * arraylist
		 * iterators are for adding and removing
		 * from arraylists at the same time
		 */
//ListIterator<Integer>iterator=integerList.listIterator();
		System.out.println("before remove");
		System.out.println(integerList);
		while(iterator.hasNext()){
			if(iterator.next()>2){
				iterator.remove();
				iterator.add(12345);
			}
				
		}
		System.out.println("after remove");
		System.out.println(integerList);
		
		
		
	}
	
	static void ex5(){
		ArrayList<Integer>integerList=new ArrayList<>();
		
		integerList.add(1);
		integerList.add(new Integer(2));
		integerList.add(3);
		integerList.add(4);
		
		ArrayList<String>strList=new ArrayList<>();
		
		strList.add("one");
		strList.add("two");
		strList.add("three");
		strList.add("four");
		
		integerList.set(0, 1000);
		integerList.set(1,2000);
		integerList.set(2, 3000);
		integerList.set(3, 4000);
		
		System.out.println(integerList);
		
		ArrayList<Double>dList=new ArrayList<Double>();
		/*
		 * you are trying to change the first number
		 * on your list. but we don't have a first number
		 * in our list. You can't change something
		 * thats not there.
		 * you can't use set on an empty arrayList
		 * this will generate an IndexOutOfBoundsException
		 */
		/*
		 * the try catch block will take of the exceptin
		 * and our program will not crash
		 */
		try{
			dList.set(0, 2.3);
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		for(int i=0;i<integerList.size();i++){
			integerList.set(i, i+1);
		}
	
		System.out.println(integerList);		
		
	}
	
	static void ex6(){
		/*
		 * the remove method
		 */
		String sb1=new String("one");
		String sb2=new String("two");
		String sb3=new String("three");
		String sb4=new String("four");
		
		ArrayList<String>strList=new ArrayList<>();
		strList.add(sb1);
		strList.add(sb2);
		strList.add(sb3);
		strList.add(sb4);
		System.out.println("before remove");
		System.out.println(strList);
		/*
		 * two overloaded remove() methods, one takes
		 * an object, other takes index position
		 */
		/*
		 * removes the string sb1 from our arraylist
		 * sb1 is the word "one"
		 */
		strList.remove(sb1);
		System.out.println(strList);
		/*
		 * our list now only has "two", "three" and
		 * "four", so this removes the number at 
		 * index position 2 which is the word "four"
		 */
		strList.remove(2);
		System.out.println(strList);
		
	}
	
	static void ex7(){
		String sb1=new String("one");
		String sb2=new String("two");
		String sb3=new String("three");
		String sb4=new String("four");
		
		ArrayList<String>strList=new ArrayList<>();
		strList.add(sb1);
		strList.add(sb2);
		strList.add(sb3);
		strList.add(sb4);
		
		ArrayList<String>nameList=new ArrayList<>();
		String name1="Enda";
		String name2="Charlie";
		String name3="Margaret";
		String name4="Angela";
		nameList.add(name1);
		nameList.add(name2);
		nameList.add(name3);
		nameList.add(name4);
		/*
		 * adds all the nameList to strList
		 */
		strList.addAll(nameList);
		System.out.println(strList);
		
		ArrayList<String>strList2=new ArrayList<>();
		strList2.add(sb1);
		strList2.add(sb2);
		strList2.add(sb3);
		strList2.add(sb4);
		/*
		 * this is going to add nameList at position
		 * 2 in our strList2
		 */
		strList2.addAll(2, nameList);
		System.out.println(strList2);	
	}
	
	static void ex8(){
		String sb1=new String("one");
		String sb2=new String("two");
		String sb3=new String("three");
		String sb4=new String("four");
		
		ArrayList<String>strList=new ArrayList<>();
		strList.add(sb1);
		strList.add(sb2);
		strList.add(sb3);
		strList.add(sb4);
		
		ArrayList<String>strCopy=strList;
		System.out.println(strCopy==strList);
		System.out.println(strList);
		System.out.println(strCopy);
		strCopy.set(0, "1000");
		System.out.println(strList);
		System.out.println(strCopy);
		
		Cat tibbles = new Cat(4,"tibbles");
		Cat fluffy=new Cat(2,"fluffy");
		Cat lucifier=new Cat(99,"Lucifer");
		Cat satan=new Cat(3,"Satan");
		
		ArrayList<Cat>catList=new ArrayList<Cat>();
		catList.add(tibbles);
		catList.add(fluffy);
		catList.add(lucifier);
		catList.add(satan);
		
		ArrayList<Cat>catList2=new ArrayList<Cat>();
		catList2.addAll(catList);
		System.out.println(catList2==catList);
		tibbles.name="poppie";
		
		
	}
	
	static void ex9(){
		String sb1=new String("one");
		String sb2=new String("two");
		String sb3=new String("three");
		String sb4=new String("four");
		
		ArrayList<String>strList=new ArrayList<>();
		strList.add(sb1);
		strList.add(sb2);
		strList.add(sb3);
		strList.add(sb4);
		/*
		 * clear, this deletes all elements from 
		 * arrayList
		 */
		strList.clear();
		System.out.println(strList);
		strList.add(sb1);
		strList.add(sb2);
		strList.add(sb3);
		strList.add(sb4);
		/*
		 * contains()
		 * this method returns true if the list
		 * contains the specified element
		 */
		System.out.println(strList.contains("one"));
		/*
		 * indexOf() 
		 * this method returns the first 
		 * index of the element
		 * if it exists and -1 if it does not exist
		 */
		System.out.println(strList.indexOf("three"));
		System.out.println(strList.indexOf("nine"));
		strList.add("three");
		System.out.println(strList.lastIndexOf("three"));;	
	}
	
	static void ex10(){
		Cat tibbles = new Cat(4,"tibbles");
		Cat fluffy=new Cat(2,"fluffy");
		Cat lucifier=new Cat(99,"Lucifer");
		Cat satan=new Cat(3,"Satan");
		
		ArrayList<Cat>catList=new ArrayList<Cat>();
		catList.add(tibbles);
		catList.add(fluffy);
		catList.add(lucifier);
		catList.add(satan);
		//deep copy
		ArrayList<Cat>catList2=catList;

		System.out.println(catList.get(0).name==
				catList2.get(0).name);
		System.out.println(catList==catList2);
		//shallow copy
		ArrayList<Cat>catList3=new ArrayList<Cat>();
		catList3.addAll(catList);
		/*
		 * these are two serperate lists with
		 * the same Cats in the order
		 */
		System.out.println(catList==catList3);
		/*
		 * this will return true as same cats in same positions
		 * in both arraylists
		 */
		System.out.println(catList.get(0)==catList3.get(0));
		
		/*
		 * cloning is a shallow copy
		 */
		System.out.println("Cloning");
		ArrayList<Cat> clonedCatList=
				(ArrayList<Cat>) catList.clone();
		//will print false as two different lists
		System.out.println(catList==clonedCatList);
		//this will print true as values are copied when cloned
		System.out.println(catList.get(1)==clonedCatList.get(1));
		
		
	}
	
	
	
	
	}


