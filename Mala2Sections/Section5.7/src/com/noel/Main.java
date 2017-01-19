package com.noel;

import java.util.concurrent.SynchronousQueue;

/**
 * exam objective 5.5 Use break and continue
 * @author noelf
 *
 */
public class Main {
/*
 * break and continue are primarily used to
 * break out of loops, but we also use break
 * to break out of switch statements.
 * break breaks out of the loop
 * continue breaks out of the current iteration
 * of the loop and continues with the NEXT iteration
 */
	public static void main(String[] args) {
		for(int i=0;i<11;i++){
			System.out.println("i is "+i);
			/*
			 * when i gets to 5 it exits
			 * the loop completely
			 */
			if(i>5){
				break;
			}
			//System.out.println("i is "+i);
		}
		
		for(int i=0;i<12;i++)
		{
			if(i==3){
				/*
				 * when i has the value 3 it 
				 * will not print out "i is 2"
				 * as it breaks out of the current
				 * iteration of the loop, but it
				 * will continue with the rest
				 * of the loop.
				 * it skips the rest of the fourth
				 * iteration
				 */
				continue;
			}
			System.out.println("i is "+i);	
		}
		
		for(int i=1;i<14;i++){
			/*
			 * if the remainder is 0 the modulus
			 * is 0, which means the number divided
			 * by two the remainder is 0. so if a number
			 * has a a modulus of 0, it means it's even.
			 * if the modulus is greater than 0, it means
			 * its odd. example 3/2 is 1 remainder 1, 
			 * 3 is odd, example 6/2 is 3 remainder 0,
			 * 6 is even
			 */
			if(i%2>0){
				/*
				 * whenever a number is odd it skips
				 * the rest of the current iteration of 
				 * the loop, which means it will not
				 * print out the current number(i)
				 */
				continue;
			}
			/*
			 * if remainder is greater than zero, its
			 * skips this part and starts the loop at
			 * the next iteration
			 */
			System.out.println("i is "+i);
			
		}
		
		//Inners.breaking();
		//Inners.Breaking2();
		Inners.labels();

	}

}
