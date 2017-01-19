package com.android;

public class Main {
	public static void main(String[]args){
		
		int choice=1;
		int num,num2,sum;
		num=4;
		num2=6;	
		//always starts with keyword "switch"
		switch(choice){//name of the variable you are searching for
		case 1://value of the variable your searching for
			System.out.println("you have choosen 1");
			sum=num+num2;
			System.out.println("sum is "+sum);
			break;//at the end of each case, you have to put
			//in a break
		case 2:
			System.out.println("you have choosen 2");
			sum=num*num2;
			System.out.println("sum is "+sum);
			break;//
		default://is the same as a final else
			System.out.println("you have made no choice");
		
		}
		
		String animal="Tiger";
		switch(animal){
		case "tiger":
			System.out.println("feed them meat");
			break;
		case "Elephant":
			System.out.println("Feed them hay");
			break;
		case "Hippo":
			System.out.println("feed them cabbages");
			break;
		default:
			System.out.println("consult zookeeper");
		
		}
	}

}
