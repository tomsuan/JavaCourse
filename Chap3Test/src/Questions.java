
public class Questions {
	
	void q3(){
		/*
		 * because all numbers with decimal
		 * places are by default doubles
		 */
		double dnum=5.6;
		System.out.println(dnum);
		//casting
		float fnum=(float)3.4;
		fnum=5.6f;
		
	}
	

	
	void q4(){
		/*
	 * the only literal value you can have
	 * for an object of any type is null
	 */
	
		/*
		 * can assign null to an object
		 */
		Animal andy=null;
		
		Zoo myZoo=new Zoo();	
	}
	
	static void q5(){
		Animal angela=new Animal();
		angela.name="angela";
		System.out.println("before method name is "
				+angela.name);
		/*
		 * sending angela to changeName method
		 */
		angela.changeName(angela);
		System.out.println("after method name is "
				+angela.name);
		Animal andy=new Animal();
		andy.name="joe";
		/*
		 * send this animal to changeAnimal 
		 * method
		 */
		System.out.println(andy);
		System.out.println("name of animal before method "
				+ andy.name);
		andy.changeAnimal(andy);
		/*
		 * print out address of animal
		 */
		System.out.println(andy);
		System.out.println("name after method is "
				+andy.name);
	}
	
	static void Q5_2(){
		Dog spot = new Dog();
		spot.name="spot";
		System.out.println("name outside method "
				+spot.name);
		Change.changeDogName(spot);
		System.out.println("after method ");
		System.out.println(spot.name);
		System.out.println("address outside method");
		System.out.println(spot);
		Change.changeDog(spot);
		System.out.println("final address is ");
		System.out.println(spot);
		
		Dog lassie = new Dog();
		lassie.name="lassie";
		System.out.println("before method");
		System.out.println(lassie);
		System.out.println(lassie.name);
		Change.changeDogNoName(lassie);
		System.out.println("after method");
		System.out.println(lassie);
		System.out.println(lassie.name);
	}

}
