package test6;

public class Main {

	public static void main(String[] args) {
		Spaniel sammy=new Spaniel();
		//System.out.println(Behaviour.finalInt);
		System.out.println(sammy.finalInt);
		/*
		 * can call a static method by the name of the 
		 * interface, only way
		 */
		Behaviour.happy();
		System.out.println(Behaviour.finalInt);
		/*
		 * calls default implmentation of angry
		 */
		sammy.angry();
		/*
		 * a spaniel is a dog
		 */
		Animal dogAnimal=new Spaniel();
		/*
		 * but a animal is not a spaniel
		 */
		//Spaniel sam=new Animal();
		//calls the spaniel's implmenentation of the eat method
		dogAnimal.Eat();
		//calls the animal's age and the spaniels Eat() method
		System.out.println(dogAnimal.age);
		
		
		



	}

}
