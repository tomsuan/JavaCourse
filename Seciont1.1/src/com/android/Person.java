/*
 * nothing can go before a package statement
 * except a comment
 * import is importing other classes that exist
 * in other packages
 */
//package has to be first in a class
package com.android;
import java.util.ArrayList;

//this will import only one class
//import com.animal.Cow;
/*
 * this imports everything in the com.animal 
 * package
 * this does not import any subfolders
 */
import com.animal.*;

/*
 * we need to import the contents of the 
 * mammal package seperatately
 * we can now define apes
 */
import com.animal.mammal.Ape;
//this will import all classes in this package
import com.animal.mammal.*;
/*
 * can have as many classes as you want in a 
 * java file .java
 * the name of the public class, has to match
 * the name of the file, you can only have
 * one public class per file
 */
public class Person {
	Cow bessie=new Cow();
	Duck daffy=new Duck();
	Zebra Zebee=new Zebra();
	
	//fully qualified name for the Ape class
	//if you have no import statement use this
	com.animal.mammal.Ape andy=new com.animal.mammal.Ape();
	/*
	 * have to import the java.util.ArrayList;
	 * to make this work
	 */
	ArrayList<Integer>myList;
	/*
	 * creating a enum Car
	 * which is a type that can only have
	 * the below definitions, not on exam
	 */
	
	enum Car{
		FORD,VOLKSWAGON,TOYTOTA,MERCEDES,BMW,
		TESLA,MASSEY_FERGUSON;
		Car(){
			System.out.println("Constructor called");
		}
	}
	/*
	 * a class within a class is a
	 * inner classes, not on exam
	 */
	private class Heart{
		int bpm;
		private void syso() {
			// TODO Auto-generated method stub
			
		
		}
		
	}
	/*
	 * an inner interface, not on exam
	 */
	private interface emotions{
		
	}

}
class Building{
	
}

