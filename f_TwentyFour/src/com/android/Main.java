package com.android;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person percy=new Person(32,"Percy",15);
		
		Dog spot=new Dog(3,"Spot",56);
		spot.eat();
		//eaten 3 kilos of food
		double foodAmount=3;
		spot.eat(foodAmount);
		//created three arrays
		int[]myArray={4,5,7};
		double[]dArray={6.8,9.8,4.67};
		String[]strArray={"Timmy","Kimmy","Sammy"};
		
		Maths myMaths=new Maths();
		myMaths.printMe(myArray);
		myMaths.printMe(dArray);
		myMaths.printMe(strArray);
		
		//creating a person that uses all
		//the variables
		double weight=4,height=5;
		int age=45;
		String name="tibbles";
		//creates a new cat
		Cat myCat=new Cat(age,weight,name);
		name="spot";
		//creates two dogs
		Dog rex=new Dog(age,"rex",weight);
		Dog lassie=new Dog(age,"lassie",weight);
		//adds three dogs to array of dogs
		Dog[]dogArray={rex,lassie,spot};
		//name of person
		String pName="patsy";
		 
		Person patsy=new Person(age, pName, weight, 
				myCat, dogArray, height, true);
		
		patsy.printMe();
		

	}

}
