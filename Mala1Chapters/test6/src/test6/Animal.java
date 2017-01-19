package test6;

public class Animal {
	int age=10;
	
	Animal(){
		System.out.println("Animal Constructor called");
	}
	
	static void Hunt(){
		System.out.println("animal hunting");
	}
	
	void Eat(){
		System.out.println("animal eating");
	}

}

class Dog extends Animal{
	
	Dog(){
		System.out.println("Dog Constructor called");
	}
	
}

class Spaniel extends Dog implements Behaviour,FinalInterface{
	int age=100;
	
	static void Hunt(){
		//this is not overriding but hiding
		
	}
	@Override
	void Eat(){
		System.out.println("spaniel eating");
		
	}
	
	private interface Movement{
		
	}

	@Override
	public void excited() {
		// TODO Auto-generated method stub
		
	}
	
}
/*
 * can only have one public class per file, so this
 * interface can't be public, and a top level class can
 * only be default or public
 */
interface mood{
	
}
