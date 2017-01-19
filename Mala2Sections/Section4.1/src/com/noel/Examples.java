package com.noel;

public class Examples {
	
	static void ex1(){
		/*
		 * all about creating strings
		 * when you create a string by assigning
		 * a value, you places the text in what
		 * is called the "String pool", so the 
		 * name "noel" is placed in the pool
		 */
		String name="noel";
		/*
		 * every time a new string is created
		 * by assigning a value, it first checks
		 * the string pool to see if that word 
		 * already exists. If it does, it assigns
		 * the value in the pool to the new string
		 * reference
		 */
		String name2="noel";
		/*
		 * if name and name2 are the same object
		 * will print true
		 */
		System.out.println(name==name2);
		/*
		 * this checks the value
		 */
		System.out.println(name.equals(name2));
		
		String str1=new String("paul");
		String str2=new String("paul");
		//this will print true
		System.out.println(str1.equals(str2));
		/*
		 * this will print false, as different 
		 * objects with the same value "paul"
		 */
		System.out.println(str1==str2);
		
		String myTime="Morning";
		String yourTime="Morning";
		//will print true, as same object
		System.out.println("Morning"==myTime);
		//this will also print true as same object
		System.out.println(myTime==yourTime);
		//this will also print true
		System.out.println(myTime.equals(yourTime));
		/*
		 * here we create two seperate string objects
		 * that each has the value "Today"
		 */
		String myDay=new String("Today");
		String yourDay=new String("Today");
		/*
		 * prints false as different objects
		 */
		System.out.println(myDay==yourDay);
		/*
		 * checks the values of the string
		 * N.B this is CASE SEnSiTIve
		 */
		System.out.println(myDay.equals(yourDay));
		/*
		 * you can also create a string by passing
		 * an array of characters
		 */
		String baby=new String("laura");
		String girl="shel";
		char[]names= new char[]{'s','h','e','l'};
		String woman=new String(names);
		
		/*
		Dog spot=new Dog();
		Dog lassie=new Dog();
		System.out.println(spot.equals(lassie));
		*/
		
		
	}
	/*
	 * Strings are immutable, so methods of
	 * the string class DO NOT change a string
	 * methods of the string class
	 * they return a NEW string
	 */
	static void ex2(){
		String str="hello there nice to meet you";
		System.out.println(str.replace('e', '?'));
		System.out.println(str);
		String newStr=str.replace('e', '?');
		System.out.println(newStr);
		
	}
	/*
	 * various methods of the String class
	 */
	static void ex3(){
		String name="Paul";
		/*
		 * charAt() shows what caharacter is at
		 * a particular index
		 */
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(3));
		/*
		 * this is out of bounds
		 */
		//System.out.println(name.charAt(4));
		System.out.println("length");
		System.out.println(name.length());
		
		/*
		 * indexof, gives the index of a particulr
		 * character or string, counting starts
		 * at 0, this is case sensitive
		 */
		String nursery="mary had a little lamb, whose"
				+ "fleece was white as snow, and everywhere "
				+ " mary went the lamb was sure to go";
		System.out.println("IndexOf");
		/*
		 * finds the first occurance of your character
		 * or word
		 */
		System.out.println(nursery.indexOf('h'));
		System.out.println(nursery.indexOf("lamb"));
		/*
		 * this will start the search at index position
		 * 22
		 */
		System.out.println(nursery.indexOf("lamb",22));
		/*
		 * if indexof can't find a particular character
		 * or string, it will return -1
		 */
		System.out.println(nursery.indexOf('z'));
		/*
		 * Substring
		 * first type takes as an argument the starting
		 * position index, in the case below, starts
		 * at a
		 */
		String exam="Oracle";
		String cut=exam.substring(2);
		System.out.println(cut);//acle
		/*Starting position is 2 and upto 4 but
		 * not including position 4
		 */
		cut=exam.substring(2, 4);
		System.out.println(cut);
		
		/*
		 * Trim	
		 * this gets rid of our trailing spaces
		 * does not get rid of spaces between
		 * words
		 */
		name="   tim Jones   ";
		System.out.println(name.trim());
		/*
		 * Replace
		 */
		name="tommy";
		System.out.println(name.replace('m', 'n'));
		String str="the quick grey fox jumped over the lazy dog";
		System.out.println(str.replace("fox", "Wolf"));
		/*
		 * can't have chars and strings
		 */
		//System.out.println(str.replace('t', "badger"));
		
		/*
		 * startsWith() and endsWith
		 */
		str="ABCAB";
		//will print true
		System.out.println(str.startsWith("AB"));
		//will print false
		System.out.println(str.startsWith("a"));
		//will print true as starts at position 3
		System.out.println(str.startsWith("A",3));
		/*
		 * endsWith does not allow you to search from
		 * a particular position
		 */
		//will print true
		System.out.println(str.endsWith("CAB"));
		
		name="JOE";
		String name2="joe";
		/*
		 * will print false as different case
		 */
		System.out.println(name.equals(name2));
		/*
		 * will print true as the case is ignored
		 */
		System.out.println(name.equalsIgnoreCase(name2));
		
	}
	
	static void ex4(){
		String day="  sunday  ".replace('d', 'z').
				trim().concat("men");
		System.out.println(day);
		day="Monday";
		String newDay=day.replace("M", "T").
				concat("Day").substring(2, 6);
		System.out.println(newDay);
		
		String str="hello there nice to meet you";
		//gets ride of spaces before and after the string
		str=str.trim();
		//sets count of spaces to 0
		int spaceCount=0;
		//will loop for length of string
		for(int i=0;i<str.length();i++){
			//if the character is a space
			if(str.charAt(i)==' ')
				//increment the space counter by one
				spaceCount++;
				
		}
		//will display the amount of spaces
		System.out.println(spaceCount);
		//will display amount of characters including spaces
		System.out.println(str.length());
		//will display amount of characters minus spaces
		int charCount=str.length()-spaceCount;
		//will display amount of words
		int wordCount=spaceCount+1;
		
	}
	
	static void ex5(){
		String poet="Wordsworth";
		/*
		 * substring returns a new string
		 * which contains "Words"
		 * "words" is not put in the pool
		 */
		String str1=poet.substring(0, 5);
		String str2=poet.substring(0, 5);
		//will print out true
		System.out.println(str1.equals(str2));
		/*
		 * this will print out false as they
		 * are both new strings
		 */
		System.out.println(str1==str2);
		/*
		 * when you directly assign a value
		 * THEN that is put in the pool
		 */
		String str3="Words";
		/*
		 * will print false as str3 was created
		 * using the substring method, which returns
		 * a NEW string
		 */
		System.out.println(str2==str3);
		/*
		 * this checks the pool for the word
		 * "Words", if it is in the pool it will
		 * assign this to str4
		 */
		String str4="Words";
		/*
		 * so str3 and str4 are the same object
		 */
		System.out.println(str3==str4);
		
		
		
		/*
		int[][][]threeDarray=new int[2][3][4];
		
		for(int i=0;i<threeDarray.length;i++){
			System.out.println("i is "+i);
			for(int j=0;j<threeDarray[i].length;j++){
				System.out.println("j is "+j);
				for(int m=0;m<threeDarray[i][j].length;m++){
					System.out.println("m is "+m);
					threeDarray[i][j][m]=i+j+m;
					System.out.println("number is "+threeDarray[i][j][m]);
				}
					
			}
				
		}
		
		int i, j, k;
		for(i=5;i>=1;i--)
		{
			for(j=5;j>i;j--)
		{
				System.out.print(" ");
		}
					for(k=1;k<(i*2);k++)
		{
						System.out.print("x");
		}
			System.out.println();
		}
		
		*/	
		
	}
	
	static void ex6(){
		/*
		 * with strings we only use certain operators
		 * namely Concatenation (+ +=)
		 * and equality(== !=)
		 */
		//this is simple concatenation, just joins them up
		String aString="Santa "+"Claus"+" is coming";
		System.out.println(aString);
		int num=10;
		int num2=30;
		/*
		 * the first location we find a string in a print
		 * statement, everything after that (that is not in a
		 * bracket) is treated as a string
		 */
		String name="noel";
		aString=name+num+num2;//will print noel1030
		System.out.println(aString);
		aString=num+num2+name;//will print out 40noel
		System.out.println(aString);
		aString=name+(num+num2);
		System.out.println(aString);
		
		aString="rudolph";
		aString+=" the red nosed reindeer";
		System.out.println(aString);
		
		String nullString=null;
		nullString+="Java";
		System.out.println(nullString);
		
		
		
		
		
		/*
		 int i, j;
		 for(i=5;i>=1;i--)
		 {
			 for(j=1;j<=i;j++)
			 	{
				 System.out.print("*");
			 	}
			 System.out.println();
		}
		*/
		
	}

}
