package com.noel;

public class Examples {
	static void ex1(){
		int top=23;
		/*
		 * a for loop consists of three distinct 
		 * parts
		 * Initialisation statements
		 * Termination condition
		 * Update clause
		 */
		for(int i=0;i<5;i++){
			
		}
		/*
		 * you can have as many initisalistion 
		 * statements as you want, but they must
		 * be all the same data type
		 * in this example we are initialsing
		 * three variables, i,j,m all of type int
		 */
		int k=9;
		for(int i=0,j=1,m=2;i<4;i++){
			
		}
		//here you giving a value to k
		//k has already being initialised
		//
		for(k=3;k<3;k++){
			
		}
		/*
		 * only one termination condition allowed
		 * second argument in for loop
		 * this has two termination conditions
		 * i<4, j<5
		 */
	/*	for(int i=0,j=1; i<4,j<5; i++){
			
		}*/
		/*
		 * you can have as many update clauses 
		 * as you want. these are execute AFTER
		 * the code in the body
		 */
		for(int i=0,j=10; i<5; i++,j--){
			System.out.println(i);
			System.out.println(j);
		}
		
		for(int i=0;i<4;i++,printMe()){
			System.out.println(i);
		}
		
		/*
		 * this will result in an infinite loop
		 */
	/*	for(int a=0;a<4;){
			System.out.println(2);
		}*/
		int b=0;
		top=34;
		for(; b<10; b++)
		{
			System.out.println("print me bridie");
		}
		
		
		for(;;){
			
		}
		
		
	}
	
	static void ex2(){
		for(int i=0;i<3;i++){
			for(int j=0;j<4;j++){
				System.out.println(i+" is i "
						+j+" is j");
			}
		}
	}
	
	static void ex3(){
		String[]names1={"harry","george","Mary"};
		String[]names2={"laura","michelle","colm"};
		String[]names3={"patsy","jack","mick"};
		
		String[][]name2DList={names1,names2,names3 };
		/*
		 * this will execute 3 times one for each
		 * row
		 */
		for(int i=0;i<name2DList.length;i++){
			System.out.println("row "+i);
			for(int j=0;j<name2DList[i].length;j++){
				System.out.print(name2DList[i][j]+" ");
			}
			System.out.println();
		}
	}

	static void printMe(){
		System.out.println("I am printed");
	}
}
