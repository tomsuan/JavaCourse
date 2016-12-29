package com.noel;

public class Animal {
	
	void teleport(){
		
	}
	
	int age=12;
	String name="andy";
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Animal [age=" + age + ", name=" + name + "]";
	}

	Animal(){
		System.out.println("Animal Constructor "
				+ "called");
	}
	
	void drink(){
		System.out.println("Animal drinking");
	}
	
	void eat(){
		System.out.println("Animal eating");
	}
	
	void fight(){
		System.out.println();
	}

}

class Dog extends Animal{
	
	String colour="red";
	double weight=23.5;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Dog [colour=" + colour + ", weight=" + weight + "]";
	}
	/*
	 * no argument Dog Constructor
	 */
	Dog(){
		super();
		System.out.println("Dog constructor "
				+ "called");
	}
	@Override
	void drink(){
		System.out.println("dog drinking");
	}
	
	void pant(){
		System.out.println("dog panting");
	}
}

class Collie extends Dog{
	String owner="kate";
	boolean sex=true;
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Collie [owner=" + owner + ", sex=" + sex + "]";
	}
	Collie(){
		super();
		System.out.println("collie constructor "
				+ "called");	
	}
	@Override
	void eat(){
		System.out.println("collie eating");
	}
	
	void grooming(){
		System.out.println("collie grooming");
	}
	
}
