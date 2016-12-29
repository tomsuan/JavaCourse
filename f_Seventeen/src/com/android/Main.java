package com.android;

public class Main {

	public static void main(String[] args) {
		//with this example assume our numbers are different
		int num=1234;
		int num2=56;
		int bigger;
		if(num>num2){
			bigger=num;
			System.out.println("num "+num+" is bigger");
		}
		else{
			bigger=num2;
			System.out.println("num2 "+num2+" is bigger");
		}
		//created a variable called bigger
		//which is going to be the bigger of the two numbers
		
	bigger=num > num2 ? num : num2;
	System.out.println("bigger is "+bigger);
	
	int age=16;
	String adm;
	adm=age>18 ? "addmitted":" No admission";
	
	System.out.println(adm);
	
	boolean sex;//true is female, falses is male
	double price;//price of a haircut
	sex=false;//if male price is 10, otherwise price is 15.50
	price=sex==false ? 10.00:15.50;
	System.out.println("price is "+price);

	}

}
