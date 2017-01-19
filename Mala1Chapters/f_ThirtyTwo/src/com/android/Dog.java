package com.android;

public class Dog {
	int age;
	String name;
	public Dog(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
}

class Cat{
	int age;
	String name;
	double weight;
	boolean sex;
	String gender;
	public Cat(int age, String name, double weight, boolean sex) {
		super();
		this.age = age;
		this.name = name;
		this.weight = weight;
		if(sex==true)
			gender="Female";
		else
			gender="Male";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cat's age is" + age + ", name is " + name + ", weight is " + weight + ", gender is " + gender + "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	
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
		if (!(obj instanceof Cat)) {
			return false;
		}
		Cat other = (Cat) obj;
		if (age != other.age) {
			return false;
		}
		if (gender == null) {
			if (other.gender != null) {
				return false;
			}
		} else if (!gender.equals(other.gender)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (sex != other.sex) {
			return false;
		}
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight)) {
			return false;
		}
		return true;
	}
	
	
	
	
	
	
	
}
