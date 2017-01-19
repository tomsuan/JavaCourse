package com.android;

public class Person {
	int age;
	String name;
	double weight;
	//this person can have a cat
	Cat myCat;
	//this person can have a few dogs
	Dog[]dogArray;
	double height;
	boolean sex;
	String gender;
	/*
	 * "this" refers to the person created when
	 * the "new" keyword is used and hence the
	 * constructor is used
	 * in this case "this.age" refers to percy.age
	 * "this.name" refers to percy.name and "this.weight"
	 * refers to percy.weight
	 */
	Person(int age,String name,double weight){
		this.age=age;
		this.name=name;
		this.weight=weight;
		System.out.println("Person Constructor");
	}
	/*
	 * same rules that apply to overloaded
	 * constructors apply to overloaded methods
	 */
	Person(int age,String name,double weight,
			Cat myCat,Dog[]dogArray,double height,
			boolean sex){
		this.age=age;
		this.name=name;
		this.weight=weight;
		this.myCat=myCat;
		this.dogArray=dogArray;
		this.height=height;
		if(sex==true)
			gender="Female";
		else
			gender="Male";
	}
	/*
	 * This method prints out all of the person's 
	 * atributes, which include the name of the Cat and all
	 * the names of the Dogs
	 */
	void printMe(){
		System.out.println("your name is "+name);
		System.out.println("your age is "+age);
		System.out.println("your weight is "+weight);
		/*
		 * The Cat variable that is owned by this Person is 
		 * known to the program as "myCat", so in order to get
		 * the name of the cat we have to go "myCat.name", or 
		 * if we wanted to get it's age we would go "myCat.age
		 */
		System.out.println("your cats name "
				+ "is "+myCat.name);
		System.out.println("your height is "+height);
		/*
		 * the list of dogs owned by this person is known to the 
		 * program as dogArray, this is an array of Dogs.
		 * So to access each dog in the list and then the name
		 * of that dog we have to go "dogArray[0].name" to get the
		 * name of the first dog for example
		 */
		for(int i=0;i<dogArray.length;i++){
			System.out.println("dog name "
					+ "is "+dogArray[i].name);
		}
		System.out.println("your gender is "+gender);
	}

}
