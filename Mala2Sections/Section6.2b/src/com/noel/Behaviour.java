package com.noel;

public interface Behaviour {
	
	void happy();
	void sad();
	default void mad(){
		System.out.println("Behaviour mad");
	}
	//this is overloaded
	default void mad(int num){
		System.out.println("mad with int");
	}
	
	static void bad(){
		System.out.println("I'm bad behaviour");
	}

}

interface Mood{
	
	void happy();
	void sad();
	default void mad(){
		System.out.println("Mood mad");
	}
	static void bad(){
		System.out.println("I'm in a bad mood");
	}
}
