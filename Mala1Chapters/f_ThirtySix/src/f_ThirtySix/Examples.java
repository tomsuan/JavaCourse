package f_ThirtySix;

public class Examples {
	static void ex1(){
		Donkey ned = new Donkey();
		int num=4;
		double dnum=12;
		System.out.println("original values "
				+num+" "+dnum);
		ned.passByValue(num, dnum);
		System.out.println("values of num is now "
				+num+" and dnum is "+dnum);
	}
	
	static void ex2(){
		Donkey ned=new Donkey();
		Dog spot=new Dog();
		System.out.println("name of dog is "+spot.name
				+" age of dog is "+spot.age);
		/*
		 * we are calling a method that changes the
		 * age and name of the Dog
		 * When you pass by reference you can  change
		 * the instance variables of a object
		 * for example we can change the age and name
		 * of the dog
		 * objects, in this case, are passed by reference
		 */
		ned.passByRef(spot);
		System.out.println("age of dog is now "+spot.age);
		spot.age=3;
		spot.name="Kevin";
		System.out.println("dogs name is "+spot.name);
		//spot=new Dog();//assigns a new Dog to spot
		/*
		 * passing in our dog Spot to the second pass
		 * by reference method
		 */
		ned.passByRef2(spot);
		/*
		 * after we pass our dog
		 * we can change the instance variables of an object
		 * i.e age, weight, name of a dog
		 * but not what the actual dog refers to
		 */
		System.out.println("After we pass dog "+spot.name);
	}
	
	static void ex3(){
		Animal andy=new Animal();
		Dog spot=new Dog();
		Cat tibbles=new Cat();
		Siamese sally=new Siamese();
		/*
		 * when passing an object to a method, you
		 * can also pass in a subclass of this object
		 * for example, any method that takes an animal
		 * can also take a Cat, a Dog or a Siamese as
		 * all of these inherit from Animal. In other
		 * words, all of these are Animals
		 */
		Donkey ned=new Donkey();
		ned.passSubClass(andy);//can pass in animal
		ned.passSubClass(spot);//can pass in a Dog
		ned.passSubClass(tibbles);//can pass in a Cat
		ned.passSubClass(sally);//can pass in a siamese
	}
	

}
