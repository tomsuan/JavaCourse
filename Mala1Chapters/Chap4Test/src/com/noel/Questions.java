package com.noel;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Questions {
	
	static void q4(){
		ArrayList<Long>lst=new ArrayList<>();
		/*
		 * can't add an int to an arrayList of
		 * wrapper Longs
		 * default for whole numbers is 
		 * int
		 */
		//lst.add(10);
		/*
		 * casting 10 to be of type Long
		 */
		lst.add(10L);
		
		
		
	}
	
	static void q6(){
		ArrayList<Integer>intList=new ArrayList<>();
		System.out.println(intList);
	}
	
	static void q7(){
		int num=4;
		do{
			System.out.println(num);
		}while(num<5);
	}
	
	static void q10(){
		DateTimeFormatter formatter1=
				DateTimeFormatter.ISO_DATE_TIME;
		
		LocalDateTime today=LocalDateTime.now();
		System.out.println("ISO_DATE_TIME");
		System.out.println(today.format(formatter1));
	}

}
