package com.noel;

public class Inners {
	static void breaking(){
	int counter=0;
		for(int i=0;i<5;i++){
			/*
			 * this prints 5 times
			 */
			System.out.println("i is "+i);	
			for(int j=0;j<4;j++){
				/*
				 * this prints 20 times
				 */
				System.out.println("j is "+j);
				counter++;			
			}
		}
		System.out.println(counter);
		
	}
	
	static void Breaking2(){
		int counter=0;
		for(int i=0;i<5;i++){
			/*
			 * this prints 5 times
			 */
			System.out.println("i is "+i);	
			for(int j=0;j<4;j++){
				/*
				 * this will break out of the
				 * inner loop if J is greater
				 * than 2
				 */
				if(j>=2){
					break;
				}
				System.out.println("j is "+j);
			}
		}
		System.out.println(counter);
		
	}
	
	static void labels(){
		/*
		 * you can label blocks of code
		 * outer refers to all the outer
		 * for loop, it is everything that
		 * is enclosed in the curly brackets 
		 * of the outer for loop
		 * you only use labels with a break
		 * or a continue
		 */	
		outer:
			for(int i=0;i<4;i++){
				inner:
					for(int j=0;j<8;j++){
						if(j>4){
							break outer;
						}
						System.out.println(j);
					}
			}
	
	myLabel:{
				System.out.println("print me");
				System.out.println("print me 2");
			}
	}

}
