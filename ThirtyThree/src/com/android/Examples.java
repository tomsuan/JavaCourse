package com.android;

public class Examples {
	
	static void Strings(){
		
		
		Dog spot=new Dog();
		Dog rex=new Dog();
		/*
		 * objects class equals() method, which
		 * just checks to see if they are the same
		 * object
		 */
		System.out.println(rex.equals(spot));//will print false
		/*
		 * a string is an object, which is actually
		 * an array of chars
		 */
	/*
	 * when first creating a string, that string value
	 * is added to the "pool", if we create another
	 * string java first checks the pool, if the new
	 * string uses the same text and case then the new
	 * string is assigned to the object in the pool
	 * here below "str" and "str2" refer to the same
	 * object, as they both have the same text "hello"
	 * in them
	 */
		String str="hello";
		String str2="hello";
		/*
		 * String class DOES NOT override the equals
		 * method
		 */
		//this will true as the same object as placed in the pool
		System.out.println(str.equals(str2));
		
		String str3="    noel    ";
		System.out.println("hello"+str3);
		/*
		 * trim gets rid of all trailing spaces
		 */
		System.out.println("hello"+str3.trim());
		System.out.println("hello"+str3);
		/*
		 * our string without any trailing spaces
		 */
		String str4=str3.trim();
		str3="and hello to you too  ";
		//concat joins strings
		System.out.println(str3.concat(str2));
		/*
		 * numbering starts at 0
		 * this prints a string that begins at position
		 * 0 and goes upto, but not include, position
		 * 6
		 */
		System.out.println(str3.substring(0, 6));
		//gets length of strng
		System.out.println(str3.length());
		//gets the character at position 2
		System.out.println(str3.charAt(2));
		//index of the first d
		System.out.println(str3.indexOf('d'));
		//index of the first character string "to"
		System.out.println(str3.indexOf("too"));
		
	}
	
	static void stringBuilders(){
		/*
		 * a stringbuilder object is a mutable, it means
		 * you change this string like object
		 */
		StringBuilder sb=new StringBuilder("hello there");
		StringBuilder sb2=sb;
		System.out.println("before change "+sb);
		//append
		sb.append(10);
		sb.append("Top");
		sb.append('!');
		sb.append(true);
		sb.append(2.99);
		System.out.println("after change "+sb);
		
	}
	
	static void finals(){
		
	}

}
