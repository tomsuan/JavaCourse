package com.noel;
/*
 * Exam Object 7.3 determine when casting is
 * necessary
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte bnum=3;
		int num=(int)bnum;
		
		int number=67909;
		byte newB=(byte)number;
		System.out.println(newB);
		/*
		 * you can only cast to compatible data 
		 * types
		 */
		
		Cat tibbles = new Cat();
		//incompatible data types
		//Dog spot=(Dog)tibbles;
		
		
		
	
	//	Animal cowAnimal=new Cow();
	//	System.out.println(((Cow)cowAnimal).age);
		//Cow daisy=andy;
		/*
		 * only cast with an inhertiance relationship
		 */
		try{
			Cow bessie=(Cow)new Animal();
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		
		Animal[]farm={new Cow(),new Sheep(),new Pig(),
				new Chicken(),new Sheep()};
		
		/*
		 * check if a certain object belongs to a
		 * certain class
		 */
		System.out.println(farm[0] instanceof Cow);
		System.out.println(farm[0] instanceof Sheep);
		int count=0;
		System.out.println("Farm");
		for(Animal a:farm){	
			/*
			 * this can only check if its an 
			 * animal or one of it's derived class
			 * so it can only check for a sheep,
			 * a cow, a pig or a chicken
			 */
				System.out.println(a instanceof Sheep);
			//	System.out.println(a instanceof Dog);
		}
		System.out.println("i have "+count+" sheep");
		Dog spot=new Dog();
		Animal angela=new Animal();
		
		System.out.println(spot instanceof Dog);
		System.out.println(angela instanceof Animal);
		//System.out.println(spot instanceof Cat);
		
		Animal andy=new Animal();
		Cow daisy=new Cow();
		System.out.println("before cast eating");
		andy.eat();
		daisy.eat();
		/*
		 * you can't cast a animal to be a cow
		 * but you can cast a cow to be an animal
		 * which is you can't cast a superclass
		 * to be a subclass
		 * but you can cast a subclass to be a 
		 * superclass
		 */
		/*
		 * I am casting daisy to be of type Animal
		 */
		andy=(Animal)daisy;
		System.out.println("after casting");
		andy.eat();
		andy.run();
		/*
		 * this object only has access to the
		 * methods of the interface Behaviour.
		 * it does not have access to any other
		 * variables or methods of the Dog 
		 * class
		 */
		Behaviour behaveDog=new Dog();
		System.out.println("BehaveDog methods");
		behaveDog.angry();
		behaveDog.sad();
	//	behaveDog.happy();
		Dog myDog=(Dog)behaveDog;
		System.out.println("after casting behaveDog");
		myDog.happy();
		System.out.println(myDog.age);
		/*
		 * the behaveDog object cannot call 
		 * the dog's happy() method, as happy() is
		 * not in the behaviour interface
		 */
		((Dog)behaveDog).happy();
		
	
	}
	
	
		
		
		

	}


