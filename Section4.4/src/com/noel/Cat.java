package com.noel;

public class Cat extends Animal{
	int age;
	String name;
	public Cat (int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	Cat(){
		
	}
	
	void eat(){
		System.out.println(name+" Eating");
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cat's age is " + age + ", name is " + name + "]";
	}
	
	

}
