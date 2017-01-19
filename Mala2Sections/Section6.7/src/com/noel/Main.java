package com.noel;

import java.util.concurrent.SynchronousQueue;
import java.util.function.Predicate;

/*
 * write a simple lambda expression that consumes
 * a lambda predicate expression
 */
public class Main {
	public static void main(String[]args){
		/*
		 * lambda always starts with an 
		 * interface reference on the left
		 * on the right of the assignement operator
		 * (=) you have the implementation of the
		 * method lambda1 in the Behaviour interface
		 */
		Behaviour b1=(int a,int b)->{
			System.out.println("B1 behaviour called");
			System.out.println(a*b);
			return a*b;};
		Behaviour b2=(int a,int b)->{
			System.out.println("B2 behaviour called");
			System.out.println(a+b);
			return a+b;};
		Behaviour b3=(int a,int b)->{
			System.out.println("B3 behaviour called");
			System.out.println(a/b);
			return a/b;};
			/*
			 * the b1 lambdais implementing the 
			 * abstract method lambda1 contained 
			 * within the behaviour interface
			 */
			b1.lambda1(12, 3);
			b2.lambda1(12, 3);
			b3.lambda1(12, 3);
			/*
			 * this takes two ints and a lambda
			 * and the b1 lambda takes two ints
			 * and mulitiplies
			 */
			takeLam(45,56,b1);
			/*
			 * takes two ints and adds them up
			 */
			takeLam(123,345,b2);
			/*
			 * takes two ints and divides them
			 */
			takeLam(300,3,b3);
			
			Behaviour b4=(a,b)->a+b*a-b;
			
			Employee eddie=new Employee(23,"eddie",4);
			Employee etna=new Employee(52,"etna",6);
			
			Validate validatePerformance=(emp)->{
				if(emp.getRating()>5)
					return true;
				else
					return false;
			};
			/*
			 * this lambda is exactly the same
			 * as the above, as emp.getRating()>5
			 * evaluates to true or false
			 */
			Validate vadlidatePerShort= emp->
			emp.getRating()>5;
			/*
			 * there is an built in interface called
			 * Predicate, which looks something like
			 * this
			 * public interface Predicate<T>{
			 * 	boolean test(T t)
			 * }
			 * this takes ANY data type and returns
			 * a boolean
			 */
			Predicate<Employee> predicate=(emp)->{
				return emp.getRating()>5;
			};
	
		
		}
	
	
	/*
	 * this is a method that takes two ints and 
	 * lambda or a class that implements the Behaviour
	 * interface
	 * if you send the b1 lambda, the two numbers will
	 * be multiplied
	 * if you send the b2 lamdba, the two numbers will
	 * be added
	 * if you send the b3 lambda, the first number will
	 * be divided by the second
	 */
	static void takeLam(int a,int b,Behaviour behave){
		System.out.println("takeLam called");
		behave.lambda1(a, b);
	}
	}
/*
 * this is the base for our lambda, so our lambda
 * will take an employee, do some calculation and
 * return true or false
 */
interface Validate{
		boolean check(Employee emp);
	}
/*
 * lambdas only work with interfaces that have
 * only ONE abstract method in them
 */
interface Behaviour{
	int lambda1(int a,int b);
}

interface Manners{
	boolean lambda2(int num,String name);
}

class Dog implements Behaviour{

	@Override
	public int lambda1(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
	/*
	 * an ordinary method where we can send it a
	 * variables as a parameter
	 */
	void eat(int num){
		
	}
	
}
