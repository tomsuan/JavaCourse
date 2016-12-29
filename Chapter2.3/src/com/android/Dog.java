package com.android;

public class Dog {
	int age=45;
	double weight=12345;
	
	public Dog(int age){
		this.age=age;
	}
	public Dog(){
		
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Dog)) {
			return false;
		}
		Dog other = (Dog) obj;
		if (age != other.age) {
			return false;
		}
		return true;
	}

}

class PassMe{
	
	static void changeValue(Dog spot,int num){
		spot.age=90000;
		System.out.println("spot"+spot.age);
		num=num*2;
	//	spot=new Dog();
	}
}
