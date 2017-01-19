package com.noel;

public class Cat {
	String name;
	int age;
	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	Cat(){
		
	}
	/*
	 * an overriden method
	 * this is overriding the equals() method from
	 * the object class
	 */
	public boolean equals(Object obj){
		/*
		 * if both cats refer to the same cat
		 * this will return true
		 * if they are the same object, will
		 * return true
		 */
		if(this==obj){
			return true;
		}
		/*
		 * instanceof checks if an object is an
		 * instance of a particular class.
		 * in this case, it checks if this object is
		 * a Cat
		 */
		if(obj instanceof Cat){
			/*
			 * if you want to compare the object sent
			 * to this method to another cat, then we
			 * have to cast this object to be of type
			 * Cat,because we want to compare the age
			 * and name of both cats
			 */
			/*
			 * create a new cat variable
			 * which is the object sent to the method
			 * cast as a Cat
			 */
			Cat newCat=(Cat)obj;
			System.out.println("name same ?"+(name==newCat.name));
			System.out.println("age same ?"+(age==newCat.age));
			boolean check= name==newCat.name
					&& age==newCat.age;
			return check;
		/*	return name==newCat.name
					&& age==newCat.age;*/
		}
		else
			return false;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cat name=" + name + ", age=" + age + "]";
	}
	
	

}
