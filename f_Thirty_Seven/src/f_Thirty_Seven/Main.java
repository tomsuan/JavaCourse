package f_Thirty_Seven;

public class Main {
	public static void main(String[]args)
	{
		//creating an array of 4 numbers
		int[]numArray={5,67,89,90};
		//accessing each element
		System.out.println(numArray[0]);
		System.out.println(numArray[1]);
		System.out.println(numArray[2]);
		System.out.println(numArray[3]);
		//this will generate an arrayIndexOutOfBoundsException
		try{
			/*
			 * a try block always has to be accompanied by
			 * either a catch block or a Finally block
			 */
			System.out.println(numArray[4]);
		}
		catch(Exception e){
			System.out.println("exception is "+e);
		}
		System.out.println("our program continues");
		
		
	}

}
