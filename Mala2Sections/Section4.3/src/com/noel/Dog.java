package com.noel;

public class Dog {
	double weight=8.9;
	double height=1.2;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Dog [weight=" + weight + ", height=" + height + "]";
	}
	
	

}

class Collie extends Dog{
	
}

class CockerSpaniel extends Dog{
	
}
