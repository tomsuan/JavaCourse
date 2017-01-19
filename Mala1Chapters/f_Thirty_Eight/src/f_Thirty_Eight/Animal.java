package f_Thirty_Eight;

public class Animal {
	int age;
	String name;
	static int groupId;{
	System.out.println("printMe");
	}
/*
 * iniitialiser, they used for giving used
 * for giving values to instance variables
 * or running code before a constructor
 * static initialisers come before ordinary
 * initialisers
 */	
	{//ordinary initialiser
		age=34;
		name="sally";
		System.out.println("initialiser called");
	}
	/*
	 * static initialisers used for giving values 
	 * to statics, and are called first
	 * they are called only once 
	 */
	static{
		groupId=0;
		System.out.println("Static Initialiser called");
	}
	static {
		System.out.println("second static called");
	}
	
	Animal(){
		System.out.println("animal Constructor called");
	}

}
