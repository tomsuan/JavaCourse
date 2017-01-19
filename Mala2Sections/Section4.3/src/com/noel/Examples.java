package com.noel;

public class Examples {
	
	static void ex1(){
		/*
		 * creates an array of ints of size 4
		 * size always goes on the right hand side
		 */
		int[]myArray=new int[4];
		//bracket can be in different position
		int myArray2[]=new int[5];
		/*
		 * once the size of the array has been set
		 * it cannot changed
		 * if you attempt to place more numbers than
		 * allowed in the above arrays, we get
		 * arrayIndexOutOfBounds Exception
		 */
		/*
		 * this array is set to be of length 2
		 * because we have two numbers in our array
		 */
		double dArray[]=new double[]{3.4,5.6};
		
		double dArray2[]={2.3,4.5,6.7};
		/*
		 * as an array is an object, we can assign
		 * one array to another
		 */
		double[] copyArray=dArray;
		System.out.println(copyArray==dArray);
		//assigning a new array of doubles to dArray
		dArray=new double[]{2.56,12.33,14.67};
		//this is not allowed
		//dArray={3.67,12.12};
		System.out.println(dArray[0]);
		System.out.println(dArray[1]);
		System.out.println(dArray[2]);
		System.out.println("using a loop to print");
		for(int i=0;i<dArray.length;i++){
			System.out.println(dArray[i]);
		}
		System.out.println("using enhanced for loop");
		for(double singleElement:dArray){
			System.out.println(singleElement);
		}
		
		String[]names={"noel","patsy","nora"};
		System.out.println("enhanced for loop for names");
		for(String name:names){
			System.out.println(name);
		}
		
		dArray[0]=45.67;
		dArray[1]=99.99;
		dArray[2]=122.22;
		//using a for loop to re assign values to array
		for(int i=0;i<dArray.length;i++)
		{//new values will be 0,12.12 and 24.24
			dArray[i]=12.12*i;
		}
		/*
		 * can't assign values to array in a enhanced
		 * for loop
		 * an enhanced for loop is for displaying
		 * values
		 */
		for(double d:dArray)
			System.out.println(d);
		
		int[]numArray=new int[7];
		numArray[0]=2;
		
		for(int i=1;i<numArray.length;i++){
			numArray[i]=numArray[i-1]*2;
		//	System.out.println(numArray[++i]);
		}
		
		for(int i=0;i<numArray.length;i++)
			numArray[i]=i+1;
		for(int num:numArray)
			System.out.println(num);
		
	}
	
	static void ex2(){
		/*
		 * creates an array of 4 rows and two columns
		 */
		int twoDarray[][]=new int[4][2];
		int[][] twoDarray2=new int[3][2];
		double[]doubleD[]=new double[3][4];
		String[][]names={
				{"noel","mick","kevin"},//1st row
				{"patricia","kate","mary"}//2nd row
		};
		System.out.println(names[0][0]);
		System.out.println(names[0][1]);
		System.out.println(names[0][2]);
		System.out.println(names[1][0]);
		System.out.println(names[1][1]);
		System.out.println(names[1][2]);
		
		names[0][1]="Michael";
		System.out.println(names[0][1]);
		
		int[][]int2d=new int[4][3];
		
		for(int i=0;i<int2d.length;i++){
			for(int j=0;j<int2d[i].length;j++){
				int2d[i][j]=i+j;
				
			}
			
		}
		
		for(int i=0;i<int2d.length;i++){
			for(int j=0;j<int2d[i].length;j++){
				System.out.println(int2d[i][j]);
				}
		}
		
		int[][][] threeD=new int[3][3][3];
		for(int i=0;i<threeD.length;i++)
			for(int j=0;j<threeD[i].length;j++)
				for(int k=0;k<threeD[i][j].length;k++)
					threeD[i][j][k]=i+j+k;
		
		for(int i=0;i<threeD.length;i++)
			for(int j=0;j<threeD[i].length;j++)
				for(int k=0;k<threeD[i][j].length;k++)
					System.out.println(threeD[i][j][k]);
		
		}
	
	static void ex3(){
		for(int i=0;i<4;i++){
			/*
			 * each time println() is used a new line
			 * is created
			 */
			System.out.println("hello");
		}
		for(int i=0;i<5;i++)
			//all five x's will appear on same line
			System.out.print('X');
		//this is a new line
		System.out.println();
		//new line appears after the words "new line"
		System.out.println("new line");
		for(int i=0;i<5;i++)
			System.out.print('Y');
		System.out.println();
		
		char[][]charArray=new char[3][3];
		for(int i=0;i<charArray.length;i++)
			for(int j=0;j<charArray[i].length;j++)
				charArray[i][j]='*';
		/*
		 * prints out all elements of our array
		 */
		for(int i=0;i<charArray.length;i++){
			
			for(int j=0;j<charArray[i].length;j++){
				System.out.print(charArray[i][j]);
			}
			System.out.println();
				
		}
			
	}
	
	static void ex4(){
		int[][][]threeD={
				{
					{23,45,67},
					{3,567,890},
					{654,234,112}
					}
				};
		
		int numArray[]={34,56,23};
		int[][]twoD=new int[2][3];
		int[][][]threeD2=new int[3][3][3];
		/*
		 * if no values are initialised in our array
		 * the default value is given to each element
		 * in the array
		 * defaults for all numbers are 0 or 0.0
		 * for booleans its false
		 * for chars its blank
		 */
		double[]dList=new double[5];
		int[]iList=new int[5];
		//for objects default is null
		String[]sList=new String[5];
		char[]cList=new char[5];//''
		boolean[]bList=new boolean[5];
		for(int i=0;i<5;i++){
			System.out.println(dList[i]);
			System.out.println(iList[i]);
			System.out.println(sList[i]);
			System.out.println(cList[i]);
			System.out.println(bList[i]);
		}
		/*
		 * if you are declaring an array over two 
		 * lines, you have to use the "new" keyword
		 */
		int[] intArray;
		//this will not work
		//intArray={23,45,56};
		intArray=new int[]{23,45,67};
		int[]newArray=intArray;
		//will print true
		System.out.println(newArray==intArray);
		
		int num=1;
		num=8_908_098;
		long lnum=1;
		lnum=243434343434787878l;
		byte bnum=2;
		
		}
	
	static void ex5(){
		Cat[]catList=new Cat[3];
		Cat tibbles=new Cat();
		Cat tomCat=new Cat();
		tomCat.name="tomcat";
		Cat fluffles=new Cat();
		fluffles.name="fluffles";
		/*
		 * populates our array of cats
		 * with cats created
		 */
		catList[0]=tibbles;
		catList[1]=tomCat;
		catList[2]=fluffles;
		System.out.println("name of first cat is "
				+catList[0].name);
		//our first cat
		catList[0].eat();
		tibbles.eat();
		//our second cat
		catList[1].eat();
		tomCat.eat();
		//our third cat
		catList[2].eat();
		fluffles.eat();
		
		for(int i=0;i<catList.length;i++){
			System.out.println("name of cat is "
					+catList[i].name);
			catList[i].eat();
			
		}
		
		
	}
	
	static void ex6(){
		/*
		 * can't use new to create an abstract object
		 * as you can't create an object of an abstract
		 * class
		 */
		//Animal andy=new Animal();
		/*
		 * if you have an array of an abstract type
		 * you can populate the array with Concrete
		 * classes that inherit from this abstract class
		 * in our case its Hippos and Monkeys
		 * these objects can only access the overriden
		 * methods from the animal class which were
		 * eat() and drink(). and also only access
		 * variables declared in the Animal class
		 */
		//Animal andy=new Animal();
		Animal[]animalList=new Animal[5];
		Hippo henry=new Hippo();
		animalList[0]=new Hippo();
		animalList[1]=new Monkey();
		animalList[2]=new Monkey();
		animalList[3]=new Hippo();
		animalList[4]=henry;
		//animalList[5]=null;
		
		for(int i=0;i<animalList.length;i++){
			System.out.println(animalList[i].age);
			animalList[i].drink();
			animalList[i].eat();
		}
		
		Collie spot=new Collie();
		Collie rex=new Collie();
		CockerSpaniel hunter=new CockerSpaniel();
		/*
		 * this is an array of dogs, so it can be
		 * populated with all the breeds of dog
		 * which inherits from the Dog class, and
		 * also can have Dogs in it
		 */
		Dog[]dogList={spot,rex,hunter,new Dog()};
		/*
		 * this will not work as this only takes
		 * collies and you can't put in a superclass
		 * object into an array that only accepts a
		 * subclass. this array can only take collies
		 * and a dog could be a cocker spaniel or 
		 * a collie. So this array cannot take
		 * cocker spaniels either
		 */
		//Collie[]collieList={spot,rex,new Dog()};
		
	}
	
	static void ex7(){
		Behaviour[]behaveArray=new Behaviour[4];
		/*
		 * can't create an instance of a interface
		 * as a an interface is purely abstract
		 */
		//Behaviour behave=new Behaviour();
		/*
		 * when declaring a variable of type interface
		 * you can only assign an object that implements
		 * that interface to it
		 * in this case a reference of type behaviour
		 * can only be assigned to a Employee or Person
		 * object, as both these classes implement 
		 * behaviour
		 */
		Behaviour behaveEmp=new Employee();
		/*
		 * this object will access the employee's
		 * implementation of the happy(), mad() and 
		 * sad() methods
		 */
		behaveEmp.happy();
		behaveEmp.mad();
		behaveEmp.sad();
		
		Behaviour behavePerson=new Person();
		behavePerson.happy();
		behavePerson.mad();
		behavePerson.sad();
		/*
		 * when you have an array of type interface
		 * you can only populate this array with objects
		 * whose classes implement this interface.
		 * we have a behaviour interface and only Employees
		 * and Person's implement it. so our array can only
		 * be populated with employees and person's
		 */
		Behaviour[]behaveList=new Behaviour[3];
		behaveList[0]=new Person();
		behaveList[1]=new Employee();
		behaveList[2]=new Person();
		/*
		 * each of these objects can only access
		 * happy(),mad() and sad();
		 */
		for(int i=0;i<behaveList.length;i++){
			behaveList[i].happy();
			behaveList[i].mad();
			behaveList[i].sad();
		}
	}
	
	static void ex8(){
		/*
		 * the Object class is the Super class of all
		 * other classes in java
		 */
		Object obj=new Object();
		
		/*
		 * this object can only call methods of the 
		 * object class
		 * one of the methods of the object class
		 * is the toString()
		 * toString() is called implicitly when you
		 * insert any data type or object into a
		 * print statement
		 */
		//these two statements are exactly the same
		System.out.println(obj.toString());
		System.out.println(obj);
		
		Cat tibbles = new Cat();
		/*
		 * going to take the toString() method from
		 * the object class, which just prints out
		 * the address
		 */
		System.out.println(tibbles);
		
		Dog spot=new Dog();
		/*
		 * i have overriden the Dog class toString()
		 * method, which prints out the weight and 
		 * height of the dog
		 */
		System.out.println(spot);
		/*
		 * when you have a superclass reference
		 * to a subclass object, you can only access
		 * methods first defined in the superclass.
		 * in this case it means that this Cat 
		 * can only access methods from the Object class
		 * and it has no implementation for the toString
		 * method so it takes its implementation from the
		 * object class.
		 * the Dog does have its own implementation of the
		 * toString() so it will print out the weight and 
		 * height. this dog can only access methods first 
		 * defined in teh object class, but it can have it's
		 * own implementation of these methods (Overriden)
		 */
		Object objCat=new Cat();
		Object objDog=new Dog();
		
		
		System.out.println(objCat.toString());
		System.out.println(objDog.toString());
		/*
		 * this array can take ANY object
		 * this can only use methods of the
		 * object class
		 */
		Object[]objArray=new Object[4];
		objArray[0]=new Hippo();
		objArray[1]=new String("hello");
		objArray[2]=new Person();
		objArray[3]=new Integer(1);
		
		System.out.println(objArray[0].getClass());
		
		
		
		
	}
	
	


	static void ex9(){
		Dog[]dogList={new Dog(),new Dog(),new Dog(),
				new Dog()};
		/*
		 * if we create an array of objects and assign
		 * them no value, by default they are all null
		 */
		dogList[2]=null;
		Dog spot=null;
		//System.out.println(spot.weight);
		//our list is now a Dog, a Dog, null, a dog
		for(int i=0;i<dogList.length;i++){
			System.out.println(dogList[i].height);
		}
		}
	
	static void ex10(){
		/*
		 * Asymetrical multidimensional Array
		 */
		String[][]twoDarray=new String[2][3];
		
		String multi[][]=new String[][]{
			{"mary","patsy"},//2 columns
			{"paddy"},//1 column
			{"kate","timmy","kimmy","harry"},//4 columns
		};
		
		int[]numArray={23,56,34,112};
		System.out.println(numArray.length);
		String str="Mary had a little lamb";
		System.out.println(str.length());
	}
	}
	/*
	static void ex4(){
		int[][][]threeD={{{34,56,22},{56,1000,4569}}};
		
		Object[]objArray={new Dog(),new Cat()};
		//do not have acess to any of the Dog or cat methods or variables
		System.out.println(objArray[1]);
		//can only be a concrete class that extends the abstract animal class 
		Animal[]animals=new Animal[4];
	}
	*/
//	}


