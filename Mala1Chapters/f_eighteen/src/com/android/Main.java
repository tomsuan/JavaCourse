package com.android;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*
		 * creating a variable of type Dog
		 * the "new" keyword, creates an object
		 * of type Dog
		 * "Dog" refers to the reference type
		 * "spot" refers to the reference name, which
		 * the program will use to refer to this object
		 * "new" creates a new object
		 * "Dog()" refers to the type of new object
		 * created
		 */
		Dog spot=new Dog();
		//gives values to each of the atributes of spot
		spot.age=45;
		spot.breed="Cocker Spaniel";
		spot.name="spot";
		spot.weight=78.9;
		//gives values to atributes of dog2
		Dog dog2=new Dog();
		dog2.age=56;
		dog2.breed="st Bernard";
		dog2.name="lassie";
		dog2.weight=123;
		//gives values to atributes of dog3
		Dog dog3=new Dog();
		dog3.age=12;
		dog3.breed="Collie";
		dog3.name="benji";
		dog3.weight=45;
		//prints out the atributes of spot
		System.out.println("age of spot is "+spot.age);
		System.out.println("breed of spot is "+spot.breed);
		System.out.println("name of spot is "+spot.name);
		System.out.println("weight of spot is "+spot.weight);
		//prints out the atributes of dog2
		System.out.println("age of dog2 is "+dog2.age);
		System.out.println("breed of dog2 is "+dog2.breed);
		System.out.println("name of dog2 is "+dog2.name);
		System.out.println("weight of dog2 is "+dog2.weight);
		
		/*
		 * the spot object is dog4,dog2 and dog3
		 * and the spot object as well
		 * Dog is the reference type
		 * dog4 is the reference name
		 * spot is the object dog4 is assigned to
		 * so the spot and dog4 reference both refer
		 * to the same dog object
		 */
		//Dog dog4=spot;
		//dog2=spot;
		//dog3=spot;
		//created an array of dogs
		Dog[]dogArray={spot,dog2,dog3};
		
		System.out.println("age of second dog is "
				+dogArray[1].age);
		System.out.println("weight of first dog is "
				+dogArray[0].weight);
		/*
		 * will loop the length of the array times
		 */
		for(int i=0;i<dogArray.length;i++){
			System.out.println("name is "+dogArray[i].name);
		}
		/*
		 * first part of the loop has to be the
		 * same data type as the array.
		 * this dog is then put equal to each dog 
		 * in the array during each iteration
		 */
		for(Dog d:dogArray){
			System.out.println("name here is "+d.name);
		}
		
		Dog dog4=new Dog();
		System.out.println("name "+dog4.name);
		
		
		
		
		
		
		
		
		//System.out.println("age of spot is "+spot);
		
		
		
		
		
		
		
		
		
		
		

	}

}
