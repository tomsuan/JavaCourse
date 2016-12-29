package f_Thirty_Eight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Main {
	public static void main(String[]args){
		Animal andy=new Animal();
		Animal Anie=new Animal();
		/*
		 * brand new for dealing with dates in
		 * Java 8
		 */
		/*
		 * three different types of date
		 * this is only the date
		 * i.e 12-12-2016
		 */
		LocalDate date;
		/*
		 * this is only the time
		 * i.e 12:34:56:23
		 */
		LocalTime time;
		/*
		 * this is both date and time
		 * i.e 12-12-2017 12:34
		 */
		LocalDateTime dateTime;
		/*
		 * each of the above three classes has a
		 * static method called now() which we
		 * use like the following
		 */
		/*prints current date, by default prints in
		 * US Format which is yyyy-mm-dd
		 */
		System.out.println(LocalDate.now());
		/*
		 * prints the current time, by default prints
		 * in 24 hour format hh:mm:SS.000, last part is
		 * nanoseconds
		 */
		System.out.println(LocalTime.now());
		/*
		 * prints the current date and time which is
		 * a combination of the above 2
		 */
		System.out.println(LocalDateTime.now());
		//you can't assign a date directly
		//is the constructor in the LocalDate class
		//is private
		//date=new LocalDate();
		date=LocalDate.of(2015, Month.JANUARY, 21);
		date=LocalDate.of(2015, 1, 21);
		time=LocalTime.of(6, 15);//time of 6:25
		dateTime=LocalDateTime.of(2015,Month.JANUARY,21, 6,15,30);
		System.out.println(date);
		System.out.println(time);
		System.out.println(dateTime);
		try{
			date=LocalDate.of(2050, 11, 32);
		}
		catch(Exception e){
			System.out.println("the exception is "+e);
		}
		/*
		 * this is how we add days, weeks, months,
		 * years to our dates
		 */
		date=date.plusDays(120);
		time=time.minusHours(4);
		/*
		 * chaining is an object calling many
		 * methods at the same time
		 */
		date=date.plusDays(4).plusYears(120);
		System.out.println("new date is "+date);
		System.out.println(date.getDayOfWeek());
	}

}
