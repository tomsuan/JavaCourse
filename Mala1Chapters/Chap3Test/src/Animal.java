
public class Animal {
	String name;
	
	void changeName(Animal andy){
		andy.name="Sally changed";
		System.out.println("name inside method is "
				+ andy.name);
	}
	
	void changeAnimal(Animal andy){
		andy=new Animal();
		andy.name="andy changed";
		System.out.println(andy);
		System.out.println("inside method name is "
				+andy.name);
		
	}
	

}
class Zoo{
	Dog myDog;
	Cat myCat;
	Gorilla myGorilla;
	
}
class Dog{
	int age;
	String name;
}

class Cat{
	
}
class Gorilla{
	
}
