package com.android;

public class Main {

	public static void main(String[] args) {
		/*
		 * if age >= 25 and location is 
		 * Galway or Dublin
		 * policy is 1000
		 * if age< 25 and location is Cork
		 * or Galway
		 * Policy is 1500
		 * all other situations, 
		 * policy is 2000
		 */
		int age=30;
		String location="Mayo";
		double policy;//the policy charged to this person
		//&& "and" statement, this is the "OR" ||
		if(age>=25 && location=="Galway" ||location=="Dublin"){
			policy=1000;
		}
		else if(age<25 && location=="Galway"||location=="Cork"){
			policy=1500;
		}
		else
			policy=2000;
		System.out.println("policy is "+policy);

	}

}
