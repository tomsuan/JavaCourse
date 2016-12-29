package com.android;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person percy=new Person();
		Person patrica=new Person();
		
		percy.name="percy";
		percy.height=6;
		percy.weight=100;
		
		patrica.name="patrica";
		patrica.height=5;
		patrica.weight=55;
		
		System.out.println(percy.weight);
		System.out.println(patrica.weight);
		
		percy.display();
		patrica.display();
		
		percy.calcBmi();
		patrica.calcBmi();

	}

}
