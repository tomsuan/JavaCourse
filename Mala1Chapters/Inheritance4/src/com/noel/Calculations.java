package com.noel;

public interface Calculations 
{
	
	static int multiply(int num,int num2){
		int sum=num*num2;
		return sum;
	}
	
	static int division(int num,int num2)
	{
		int product=num/num2;
		return product;
	}
	
	static int tax(int wages){
		int deduction=wages-200;
		return deduction;
	}

}
