package com.noel;

public class Person {
	String name;
	double weight;
	public Person(String name, double weight) {
		super();
		this.name = name;
		this.weight = weight;
	}
	
	Person(){
		
	}
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 * in this equals() method if both people have
	 * the same name, this will return true
	 */
	public boolean equals(Object obj){
		if(obj instanceof Person){
			Person newPerson=(Person)obj;
			boolean check= name==newPerson.name;
			return true;
		}
		return false;
	}

}
