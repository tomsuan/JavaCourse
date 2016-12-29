package com.android;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal andy=new Animal();
		
		andy.move();
		andy.eat();
		andy.reproduce();
		andy.printMe();
		
		Cow bessie=new Cow();
		System.out.println("cow calling printMe");
		bessie.printMe();
		/*
		 * creating two animals that are subclasses
		 * of the animal class
		 */
		Fly freddie=new Fly();
		Shark jaws=new Shark();
		
		System.out.println("calling eat method for each"
				+ " Animal ");
		bessie.eat();//cow
		freddie.eat();//fly
		jaws.eat();//shark
		//this method is unique to the shark
		jaws.attack();
	
		Pig pippa = new Pig();
		pippa.eat();
		Sheep sean=new Sheep();
		System.out.println("printing out our zoo");
		Animal[]zoo={pippa,jaws,freddie,bessie,sean};
		for(int i=0;i<zoo.length;i++)
			zoo[i].eat();
	}

}
