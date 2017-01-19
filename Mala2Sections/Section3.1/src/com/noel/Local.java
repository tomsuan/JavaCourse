package com.noel;

public class Local {
	/*
	 * these are instance variables which is 
	 * ALWAYS longer than that of a local variable
	 * or a method parameter
	 */
	private String name="Mary";
	protected String address="Galway";
	/*
	 * class variable or static variable
	 * a static variable belongs to a class,not
	 * an individual object, a class variable is
	 * shared across all objects
	 */
	static int examId=457899;
	
	void accessLocal(int num){
		/*
		 * this is a local variable that is
		 * available throughout the accessLocal
		 * method
		 * Locals can be as long as a method
		 * Parameter, but never longer
		 */
		double dnum=24;
		/*
		 * accessing the variable name from 
		 * this method, this variables is available
		 * to all instance methods
		 */
		name="noel";
		/*
		 * this will not compile as a "FORWARD
		 * REFERENCE" to local variables is
		 * not allowed
		 */
		//dnum=dnum2;
		double dnum2=20;
		int age=19;
		if(age>19){
			/*
			 * this is a local variable that is
			 * ONLY available within these curly 
			 * brackets
			 */
			double weight=34.5;
			System.out.println("my weight is "+weight);
		}/*
		as soon as we are outside the curly brackets
		we can no longer access the weight
		 */
		else{
			/*
			 * height is local to these curly 
			 * brackets
			 */
			double height=45.6;
			System.out.println("my height is "+height);
		}
		/*
		 * can't access both variables as outside
		 * they're curly brackets
		 */
		//System.out.println(weight);
		//System.out.println(height);
		for(int i=0;i<4;i++){
			/*
			 * i is only available within the for
			 * loop
			 */
			System.out.println("i is "+i);
			if(i<2){
				/*
				 * local variable j, which is 
				 * only availabe within these curly
				 * brackets
				 */
				int j=1;
				System.out.println("j is "+j);
			}
		}
		//System.out.println("can't access i"+i);
		/*
		 * the below code is always going to 
		 * execute, however the variable
		 * "only" will be available only inside
		 * the below curly brackets
		 */
		
		{
			int only=56;
			System.out.println("print only "+only);
			
		}
	}
	
	void accessMethod(int num,double dnum){
		/*
		 * Method parameters are accessible only
		 * in the method that defines them.
		 * The scope of a method parameter may be
		 * as long as that of a local variables or
		 * longer, but it can NEVER be shorter
		 */
		/*
		 * localInt has the same length as num and dnum
		 */
		int localInt=34;
		System.out.println("num is "+num);
		System.out.println("dnum is "+dnum);
		System.out.println("localInt is "+localInt);
		
		for(int i=0;i<2;i++){
			//i is local to the for loop
			System.out.println(i);
			System.out.println(num);
			System.out.println(dnum);
			System.out.println(localInt);
		}
	}
	
	void accessInstance(int num,double dnum){
		/*
		 * instance variables are available throughout
		 * the class, regardless of the access modifier
		 * even with name private, we can still access
		 * the name as we are in the same class 
		 * (curly brackets)
		 */
		System.out.println("access name "+name);
		System.out.println("access Address "+address);
		//method parameters
		System.out.println(num);
		for(int i=0;i<2;i++){
			//local variables
			System.out.println(i);
			//can access method parameter
			System.out.println(dnum);
			//can access instance variable
			System.out.println("name is "+name);
		}
	}
	
	void accessStatic(){
		System.out.println(name);
		System.out.println(address);
		System.out.println(examId);
	}
	/*
	 * can't access address or name in a static
	 * method as both variables are non static 
	 * instance variables
	 */
	static void accessStatic2(){
		System.out.println(examId);
//		System.out.println(address);
//		System.out.println(name);
	}

}
