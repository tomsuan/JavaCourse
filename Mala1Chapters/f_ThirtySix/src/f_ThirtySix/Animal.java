package f_ThirtySix;

public class Animal {
	int age=10;
	String name="Timmy";
	
	void run(){
		System.out.println("animal Running");
	}

}

class Dog extends Animal{
	void run(){
		System.out.println("Dog Running");
	}
}

class Cat extends Animal{
	void run(){
		System.out.println("Cat Running");
	}
	
}

class Siamese extends Cat{
	void run(){
		System.out.println("Siamese Running");
	}
	
}

class Donkey{
	
	void passByValue(int num,double dNum){
		//same as num=num*10
		num*=10;
		//same as dNum=dNum+100
		dNum+=100;
		System.out.println("num is "+num+" dnum is "
				+ dNum);
		}
	
	void passByRef(Dog spot){
		spot.age=spot.age+10;
		spot.name="lassie";
		System.out.println(" new age is "+spot.age+
				" new name is "+spot.name);
		//spot = new Dog();
	}
	void passByRef2(Dog spot){
		/*
		 * this dog is called "Timmy", as default
		 * name in animal class is "Timmy" and he 
		 * has an age of 10
		 */
		spot=new Dog();
		System.out.println("inside method name is "
				+spot.name);
		
	}
	/*
	 * this can take any Animal 
	 * when you have a superclass parameters, you
	 * can pass in any sub class. for example
	 * here we have an animal, so we can pass in
	 * a Dog,A cat or a Siamese
	 * then the run method will be called for either
	 * a Dog, Cat or siamese depeneding on what
	 * animal was sent to this method
	 */
	void passSubClass(Animal andy){
		andy.run();//polymorphic 
	}
	
}
