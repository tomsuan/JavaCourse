package com.android;

public class Main {
	public static void main(String args[]){
		Dog spot=new Dog();
		Dog lassie=spot;
		/*
		 * same dog referred to by two different names
		 * 
		 */
		System.out.println(spot);
		System.out.println(lassie);
		/*
		 * lassie now refers to a new Dog
		 */
		lassie=new Dog();
		/*
		 * this prints out the address, because
		 * this is what is stored in an object 
		 * reference variables
		 */
		System.out.println(lassie);
		int num=345;
		/*
		 * this prints out the value 345, as 
		 * the value 345 is stored in num
		 */
		System.out.println(num);
		int num2=345;
		/*
		 * to compare primitive variables, 
		 * we just use the eqivalance operator ==
		 */
		System.out.println(num==num2);
		lassie=spot;
		/*
		 * this will print true as they point 
		 * to the same object, they are the same
		 * object
		 */
		System.out.println(lassie==spot);
		System.out.println(lassie);
		System.out.println(spot);
		/*
		 * if you want to find out if the 
		 * two objects have the same value, we use
		 * the equals()method, however in order for this
		 * to work we need to override the equals()
		 * method
		 */
		lassie=new Dog();
		lassie.age=557;
		/*
		 * in the overriden equals()method, this will
		 * check the ages of both dogs and if they
		 * are the same same this will return true, 
		 * if not overriden this will only check to 
		 * see if both objects are the same
		 */
		System.out.println(spot.equals(lassie));
		lassie=new Dog();
		/*
		 * lassie and spot now both have the same
		 * age which is 45
		 */
		System.out.println(spot.equals(lassie));
		/*
		 * this will print out the address of Spot
		 */
		int num3=100;
		/*
		 * printing out before method call
		 */
		System.out.println("weight of spot before lassie "+spot.weight);
		lassie.weight=2000;
		spot=lassie;
		
		PassMe.changeValue(spot, num2);
		/*
		 * printing out after method call
		 */
		System.out.println("num3 is now "+num3);
		System.out.println("spot's age is now "+spot.age);
		System.out.println("spot is now "+spot);
		System.out.println(lassie);
		/*
		 * weight is still at 2000, as it is still the 
		 * same Dog
		 */
		System.out.println(spot.weight);
		/*
		 * some primitive variable can have an infininte number
		 * of literal values, booleans can only have two
		 * char can have 65,000 approx
		 */
		int number=23456;
		double dnum2= 7.89;
		boolean myBool=true;
		/*
		 * only one type of literal value for an object
		 * and its null
		 */
		spot=null;
		/*
		 * if an object can no longer be referred too,
		 * it is liable for garbage collection, but you
		 * can't guarantee it
		 */
		Dog benji=new Dog();
		/*
		 * the original dog benji referred too, can no longer
		 * be accessed, so this dog is liable for garbage
		 * collection
		 */
		benji=spot;
		//45 is gone as soon as num refers to something else
		num=45;
		num=78;
		/*
		 * can't assign artimetic operators to objects
		 */
		num++;
		++num;
		num+=num;
		num*=num;
		//spot++;
		
	}

}
