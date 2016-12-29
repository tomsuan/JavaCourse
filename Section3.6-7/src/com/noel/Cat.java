package com.noel;

public class Cat {
	/*
	 * you can't access this variables directly
	 */
	private int age;
	private String name;
	
	public int getAge(){
		return age;
	}
	
	public String getName(){
		return name;
	}
	
	public void setAge(int age){
		this.age=age;
	}
	public void setName(String name){
		this.name=name;
	}

}
