
public class Change {
	
	static void changeDogName(Dog spot){
		spot.name="Little timmy";
		
	}
	
	static void changeDog(Dog spot){
		spot=new Dog();
		System.out.println("address of Dog");
		System.out.println(spot);
		
	}
	static void changeDogNoName(Dog spot2){
		spot2=new Dog();
		spot2.name="Big kimmy";
		System.out.println("name of new dog insdie method "
				+spot2.name+spot2);
		
	}

}
