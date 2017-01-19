package com.android;

public class Main {
	public static void main(String[]args){
		boolean sex=false;
		String location="Dublin";
		
		//the OR ||, either can be true
		if(sex==true || location=="Dublin"){
			System.out.println("you are female or you "
					+ "live in Dublin");
		}
		else{
			System.out.println("you are not female and"
					+ " you don't live in Dublin");
		}
		
		sex=false;
		location="Dublin";
		if(sex==false && location=="Dublin"){
			System.out.println("you are a male and you"
					+ " live in Dublin");
		}
		else{
			System.out.println("you are either female or"
					+ " you don't live in dublin");
		}
	}

}
