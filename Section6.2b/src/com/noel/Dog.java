package com.noel;
/*
 * both Mood and Behaviour have two Abstract
 * methods called happy and sad, there is no
 * conflict as there is no body
 */
public class Dog implements Mood,Behaviour{
	final int age=23;

	@Override
	public void happy() {
		System.out.println("Dog happy");
		
	}

	@Override
	public void sad() {
		System.out.println("Dog Sad");
		
	}
/*
if you have two default methods in different
interfaces with the same method signature
then you have to override, as java cannot tell
the difference between the two, see default mad()
method in Behaviour and Mood
 */
	@Override
	public void mad() {
		// TODO Auto-generated method stub
		System.out.println("Dog Mad");
	}
	
	public void mad(int number){
		
	//	return 1;
	}
	
	static void callStatics(){
		/*
		 * there is not conflict as the only way
		 * to call static methods is the interface
		 * name followed by the method name
		 */
		Behaviour.bad();
		Mood.bad();
	}

}
