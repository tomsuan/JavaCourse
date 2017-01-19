package com.android;
/*
 * can't import two classes of the same name
 * ,even though they are in different packages
 */
import java.util.Date;
//import java.sql.Date;
public class Date2 {
	/*
	 * we can use the simple format to declare
	 * a date, its just the word Date
	 */
	Date myDate;
	/*
	 * if you want to use both types of date
	 * you have to use fully qualified name
	 * for one the data types
	 */
	java.sql.Date sqlDate;

}
