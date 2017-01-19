package com.noel;

public class Message {
	/*
	 * 3 overloaded methods
	 * one takes a phone
	 * one takes a pc
	 * one takes a tablet
	 */
	void read(Phone myPhone){
		System.out.println("read phone message");
	}
	void read(Pc myPc){
		System.out.println("read pc message");
	}
	void read(Tablet myTablet){
		System.out.println("read tablet message");
	}

}
