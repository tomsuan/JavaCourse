package com.noel;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class Examples {
	
	static void ex1(){
		/*
		 * you can't directly create a date or time
		 * object (can't use new). you create a date
		 * object by using the static method "of"
		 */
		LocalDate date1=LocalDate.of(2222, 1, 25);
		LocalDate dateNow=LocalDate.now();
		System.out.println(dateNow);
		
		LocalDate date2=LocalDate.of(2017, Month.JULY, 
				22);
		System.out.println(date2);
		
		date2=LocalDate.parse("2018-08-02");
		System.out.println(date2);
		/*
		 * parse LocalDate has to be in this format
		 * YYYY-MM-DD
		 */
		System.out.println("Get methods");
		System.out.println(dateNow.getDayOfMonth());
		System.out.println(dateNow.getDayOfWeek());
		System.out.println(dateNow.getDayOfYear());
		System.out.println(dateNow.getMonth());
		System.out.println(dateNow.getMonthValue());
		System.out.println(dateNow.getYear());
		
		LocalDate xmas=LocalDate.of(2016,12,25);
		LocalDate paddys=LocalDate.of(2017,03,17);
		//will print true, true, false
		System.out.println(xmas.isBefore(paddys));
		System.out.println(paddys.isAfter(xmas));
		System.out.println(paddys.isBefore(xmas));
		//checks if the same date
		System.out.println(paddys.equals(xmas));
		
		/*
		 * cannot do this
		 */
		//System.out.println(paddys<xmas);
		xmas=xmas.minusDays(10);
		System.out.println(xmas);
		xmas=xmas.minusMonths(4);
		xmas=xmas.minusWeeks(3);
		xmas=xmas.minusDays(34);
		xmas=xmas.minusYears(12);
		System.out.println(xmas);
		/*
		 * plus dates
		 * methods of LocalDate cannot change
		 * dates
		 */
		date1=LocalDate.of(2016, 12, 27);
		System.out.println(date1.plusDays(4));
		System.out.println(date1.plusWeeks(5));
		System.out.println(date1.plusMonths(7));
		System.out.println(date1.plusYears(2));
		
		System.out.println("date is "+date1);
		date1=date1.plusYears(3);
		//date1=LocalDate.of(2017, 02, 29);
		//System.out.println(" leap date "+date1);
		date1=LocalDate.of(2016, 02, 29);
		System.out.println(" leap year date "+date1);
		
		date2=date1.plusDays(1095);
		System.out.println("leap year plus 3 "+date2);
		/*
		 * withxx() returns a copy of the date with
		 * a replacement for the day, month or year
		 */
		date1=LocalDate.of(2016, 12, 27);
		System.out.println(date1.withDayOfMonth(21));
		System.out.println(date1.withDayOfYear(123));
		System.out.println(date1.withMonth(10));
		System.out.println(date1.withYear(2555));
		
		/*
		 * atTime, this converting LocalDate to a 
		 * LocalDateTime
		 */
		date1=LocalDate.of(2016, 12, 27);
		System.out.println(date1.atTime(16,30));
		System.out.println(date1.atTime(17, 30, 30));
		System.out.println(date1.atTime(2, 15, 45, 56746));
		System.out.println(date1.atTime(LocalTime.of(16, 30)));	
		/*
		 * epoch day is january 1st, 1970
		 * this is day one 
		 */
		LocalDate earlyDate=LocalDate.of(1970, Month.JANUARY, 4);
		System.out.println(earlyDate.toEpochDay());
		date1=LocalDate.MAX;
		date2=LocalDate.MIN;
		System.out.println("max date is "+date1);
		System.out.println("min date is "+date2);
		
		
		
	}
	
	static void ex2(){
		/*
		 * LocalTime stores in format hours-minutes-seconds
		 * and nanoseconds (without timezone)
		 * like LocalDate LocalTime is immutable
		 */
		/*
		 * created similar way to LocalDate
		 * displayed as 24 hour clock
		 */
		LocalTime time1=LocalTime.of(12, 12);//12:12
		LocalTime time2=LocalTime.of(13,15,25 );//12:15:25
		LocalTime time3=LocalTime.of(11, 10,23,777);//with nanoseconds
		System.out.println(time1);
		System.out.println(time2);
		System.out.println(time3);
		/*
		 * this will cause a DateTimeException
		 * as values for hour, minute and second
		 * are all out of range, 25 hours, 61 minutes
		 * and 65. range is 0 to 23 for hours,
		 * 0 to 59 for minutes and 0 to 59 for seconds
		 */
		//time2=LocalTime.of(2, 61,65);
		/*
		 * no AM or Pm in times
		 */
		/*
		 * you can parse a string to be a time
		 */
		time2=LocalTime.parse("16:06");
		System.out.println(time2);
		//this will get the current time
		time2=LocalTime.now();
		System.out.println("time is "+time2);
		
		LocalTime midDay=LocalTime.NOON;
		LocalTime midNight=LocalTime.MIDNIGHT;
		LocalTime minTime=LocalTime.MIN;
		LocalTime maxTime=LocalTime.MAX;
		
		System.out.println("noon is "+midDay);//12:00
		System.out.println("Midnight is "+midNight);//time is 00:00
		System.out.println("min time is "+minTime);//midnight and Min time are same
		System.out.println("max time is "+maxTime);//23:59:59.999999999
		
		LocalTime rightNow=LocalTime.now();
		System.out.println("hour of now "+rightNow.getHour());
		System.out.println("minute of now "+rightNow.getMinute());
		System.out.println("second of now "+rightNow.getSecond());
		System.out.println("nano of now "+rightNow.getNano());
		
		time1=time1.plusHours(2);
		time2=time2.plusMinutes(75);
		
		rightNow.minusHours(3);
		rightNow.minusMinutes(89);
		rightNow=LocalTime.now();
		
		System.out.println(midDay.isAfter(rightNow));
		System.out.println(midDay.isBefore(rightNow));
		/*
		 * you can also chain
		 * this exmaple takes three hours away from 
		 * current time 
		 */
		System.out.println(rightNow.minusHours(3).isBefore(midDay));
		
		LocalTime startTime=LocalTime.of(8, 30);
		LocalTime timmyTime=LocalTime.of(8, 31);
		
		if(timmyTime.isBefore(startTime)){
			System.out.println("timmy is on time");
		}
		else
			System.out.println("Timmy is late");
		
		LocalTime worldRecord=LocalTime.of(2, 3,45);
		LocalTime myTime=LocalTime.of(1, 58,50);
		/*
		 * want to check if myTime plus four minutes
		 * still beats the world record
		 */
		if(myTime.plusMinutes(4).isBefore(worldRecord))
			System.out.println("new world Record");
		else
			System.out.println("tough luck");
		/*
		 * withHour(),withMinute(),etc methods accept an
		 * int value and returns copy of LocalTime with 
		 * the specified value altered
		 */
		time1=LocalTime.of(12, 30,30);
		System.out.println(time1.withHour(14));
		System.out.println(time1.withMinute(45));
		
		LocalDate date1=LocalDate.now();
		LocalDateTime dateTime1=time1.atDate(date1);
		System.out.println(dateTime1);	
	}
	
	static void ex3(){
		LocalDateTime dateTime1=LocalDateTime.of
				(2222,Month.APRIL,20,23,15,50,675);
		LocalDate date1=LocalDate.now();
		LocalTime time1=LocalTime.now();
		
		dateTime1=LocalDateTime.of(date1, time1);
		dateTime1=LocalDateTime.now();
		/*
		 * all methods available to time and date
		 * are also available to to LocalDateTime
		 */
	}
	
	static void ex4(){
		Period yearPeriod=Period.ofYears(3);
		Period monthPeriod=Period.ofMonths(11);
		Period weekPeriod=Period.ofWeeks(4);
		Period dayPeriod=Period.ofDays(56);
		/*
		 * this goes years, months and days
		 */
		Period per1=Period.of(2, 3,456);
		//you can also do minus numbers
		Period dayMinus=Period.ofDays(-20);
		LocalDate myDate=LocalDate.of(2010, 2, 12);
		myDate=myDate.plus(per1);
		System.out.println("date is now "+myDate);
		
		LocalDate myDate2=LocalDate.of(2030, 4, 2);
		Period betweenDates=Period.between(myDate, myDate2);
		System.out.println(betweenDates);
		/*
		 * the get functions only get the month
		 * value in this case, which is 3,
		 * we can see we have a days set to 456
		 * but yet getMonths will still read 3, and 
		 * getYears will still read 2
		 */
		per1=Period.of(2, 3,456);
		System.out.println(per1.getMonths());
		System.out.println(per1.getDays());
		System.out.println(per1.getYears());
		/*
		 * you have to use a get() to find out which
		 * period is bigger
		 * comparing periods we can use the greater or 
		 * less than symbol, unlike LocalDates, times, datetimes
		 */
		//System.out.println(per1.getDays()>betweenDates.getMonths());
		System.out.println(per1);
		/*
		 * periods have the following characters
		 * Y,y refers to year
		 * m or M refers to month
		 * D or d refers to day
		 * P refers to period
		 */
		Period p5y1=Period.parse("P5y");
		Period p5y2=Period.parse("p5y");
		Period p5y3=Period.parse("P5Y");
		Period p5y4=Period.parse("+P5Y");
		Period p5y5=Period.parse("-p-5Y");
		System.out.println(p5y5);
		
		//different period of different durations
		Period per4=Period.parse("p5y1m21d");
		LocalDate future=LocalDate.now().plus(per4);
		System.out.println(future);
		
		LocalDate filmOpening=LocalDate.of(2016, 12, 4);
		LocalDate filmClosing=LocalDate.of(2017, 02, 14);
		Period filmTime=Period.between(filmOpening, filmClosing);
		System.out.println("lenght film plays is "+filmTime);
		
		LocalDate today=LocalDate.now();
		LocalDate century = LocalDate.of(2056, 10, 20);
		filmTime=Period.between(filmOpening, filmClosing);
		
		today=today.plus(filmTime);
		System.out.println("today plus filmtime is "+today);
		today=LocalDate.now();
		today=today.minus(filmTime);
		System.out.println("today minus filmtime is "+today);
		
		while(today.isBefore(century)){
			System.out.println("today is "+today);
			today=today.plus(filmTime);
		}
		
		Period myPeriod=Period.of(1, 10, 15);
		Period weekPeriod2=Period.ofWeeks(4);
		
	}
	
	static void ex5(){
		/*
		 * cannot chain methods of the Period
		 * class
		 * this is only a period of 4 weeks
		 * it ignores the ofYears(2) method
		 */
		Period wrong=Period.ofYears(2).ofWeeks(4);
		LocalDate today=LocalDate.now();
		LocalDate future=today.plus(wrong);
		System.out.println("future is "+future);
		
		Period perMonth=Period.ofMonths(22);
		Period perWeek=Period.ofWeeks(12);
		Period perDay=Period.ofDays(3000);
		Period per1=Period.of(2, 13, 60);
		/*
		 * adding periods, you only add up the 
		 * individual elements, i.e add up only days
		 * and does not effect months and years
		 */
		System.out.println("per1 is "+per1);
		Period newPer=per1.plus(perDay);
		System.out.println("new period is "+newPer);
		newPer=per1.plus(perMonth);
		System.out.println("new period is now "+newPer);
		newPer=per1.plus(perWeek);
		System.out.println("new period is "+newPer);
		
		Period per2=Period.of(3, 14, 16);
		Period per3=Period.of(12, 19, 56);
		Period per4=Period.ofWeeks(5);
		newPer=per2.plus(per3);
		System.out.println("answer is "+newPer);
		newPer=per3.plus(per4);
		System.out.println("answer is "+newPer);
		newPer=per2.plus(per4);
		System.out.println("answer is "+newPer);
		newPer=per4.plus(per4);
		System.out.println("answer is "+newPer);
		
		Period perMinus=Period.of(1, 12, 0);
		Period perMinus2=Period.of(4, 11, 4);
		newPer=perMinus.minus(perMinus2);
		System.out.println("subtract is "+newPer);
		/*
		 * MultipliedBy
		 */
		per1=Period.of(2, 3, 4);
		Period perMult=per1.multipliedBy(3);
		System.out.println("multiply is "+perMult);
		
		LocalDate anomoly=LocalDate.of(2016, 5, 30);
		System.out.println("anomoly plus"+anomoly.plusMonths(1));
		anomoly=LocalDate.of(2016, 5, 31);
		System.out.println("anomoly plus"+anomoly.plusMonths(1));
		
		per1=Period.of(0, 0, 0);
		/*
		 * this returns true if year, month and 
		 * day are set to 0. ALL have to be set
		 * to zero to be true
		 */
		System.out.println(per1.isZero());
		per1=Period.of(0, 0, 1);
		System.out.println(per1.isZero());
		/*
		 * isNegative() returns true if year, or 
		 * month or day are negative. if any are
		 * negative, it returns true
		 */
		per1=Period.of(-1, 1, 0);
		System.out.println(per1.isNegative());
		per1=Period.of(1, 1, 1);
		System.out.println(per1.isNegative());
		
		per1=Period.of(10, 4, 90);
		/*
		 * this gets the total months of our 
		 * period, or does it??
		 * do this only multiplies year by 12
		 * and adds months to it
		 */
		System.out.println(" months is "+per1.toTotalMonths());
		Period zeroMonths=Period.of(0, 0, 3000);
		System.out.println(zeroMonths.getMonths());
		/*
		 * no getWeeks() method
		 */
		//System.out.println(zeroMonths.getWeeks());
	}
	
	static void ex6(){
		/*
		 * you can find out the amount of days, weeks,
		 * months, years in this period, as this period
		 * is between two known dates
		 */
		LocalDate startDate=LocalDate.of(2016, 2, 3);
		LocalDate endDate=LocalDate.of(2022, 12, 24);
		Period betweenDates=Period.between(startDate, endDate);
		System.out.println("between dates is "+betweenDates);
		
		long days=ChronoUnit.DAYS.between(startDate, endDate);
		System.out.println("days in our period is "+days);
		LocalDateTime time1=LocalDateTime.of(2016, 2, 14, 12, 45);
		LocalDateTime time2=LocalDateTime.of(2022, 3, 14, 13, 45);

		long hours=ChronoUnit.HOURS.between(time1, time2);
		System.out.println("hours in our period is "+hours);
	}
	
	static void ex7(){
		LocalDate today = LocalDate.now();
		System.out.println("today is "+today);
		/*
		 * create a DateTimeFormatter for our dates
		 * and datetimes in localised format. In our
		 * case it will be in the format date/month/
		 * year. localised date will be set to european
		 * date format
		 * when creating formatters for localDate,
		 * LocalTime and LocalDateTime
		 * they are all of type DateTimeFormatter
		 */
		LocalDate myDate=LocalDate.of(2056, 11, 4);
		DateTimeFormatter shortDate=
				DateTimeFormatter.ofLocalizedDate
				(FormatStyle.SHORT);
		System.out.println(today.format(shortDate));
		System.out.println(myDate.format(shortDate));
		
		DateTimeFormatter mediumDate=
				DateTimeFormatter.ofLocalizedDate
				(FormatStyle.MEDIUM);
		System.out.println("medium format");
		System.out.println(today.format(mediumDate));
		System.out.println(myDate.format(mediumDate));
		/*
		 * .ofLocalizedDate works only for
		 * DATES
		 */
		DateTimeFormatter fullDate=
				DateTimeFormatter.ofLocalizedDate
				(FormatStyle.FULL);
		System.out.println("full format");
		System.out.println(today.format(fullDate));
		System.out.println(myDate.format(fullDate));
		/*
		 * LONG is the same as full
		 */
		/*
		 * this is a formatter for time, notice
		 * how you have .ofLocalizedTime()
		 */
		DateTimeFormatter mediumTime=
				DateTimeFormatter.ofLocalizedTime
				(FormatStyle.MEDIUM);//displays seconds
		LocalTime rightNow=LocalTime.now();
		System.out.println(rightNow.format(mediumTime));
		
		DateTimeFormatter formatter1=
				DateTimeFormatter.BASIC_ISO_DATE;
		DateTimeFormatter formatter2=
				DateTimeFormatter.ISO_LOCAL_DATE;
		DateTimeFormatter formatter3=
				DateTimeFormatter.ISO_LOCAL_TIME;
		DateTimeFormatter formatter4=
				DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		
		System.out.println("basic_iso_date");
		System.out.println(today.format(formatter1));
		System.out.println("ISO_LOCAL_DATE");
		System.out.println(today.format(formatter2));
		System.out.println("ISO_LOCAL_TIME");
		System.out.println(rightNow.format(formatter3));
		LocalDateTime myDateTime=LocalDateTime.now();
		System.out.println("ISO_LOCAL_DATE_TIME");
		System.out.println(myDateTime.format(formatter4));
		/*
		 * this will not work as each time type
		 * has to have it's own formatter
		 * so a LocalTime can only take a timeFormater
		 * a LocalDate can only take a dateformatter
		 * and a localDateTime can only take a dateTimeFormatter
		 */
		//System.out.println(rightNow.format(formatter1));
		
		
	}
	
	static void ex8(){
		LocalDate today=LocalDate.now();
		LocalTime rightNow=LocalTime.now();
		LocalDateTime nowDateTime=LocalDateTime.now();
		
		DateTimeFormatter eurDate=
				DateTimeFormatter.
				ofPattern("EEEE dd MMMM YYYY");
		System.out.println("european date 1");
		System.out.println(today.format(eurDate));
		DateTimeFormatter eurTime=DateTimeFormatter.
				ofPattern("hh:mm a");
		System.out.println("european time");
		System.out.println(rightNow.format(eurTime));
		
		DateTimeFormatter eurDateTime=DateTimeFormatter.
				ofPattern("'day of year 'D e dd E MMMM YYYY hh:mm a");
		System.out.println(nowDateTime.format(eurDateTime));
		/*
		 * they have to match up
		 * and they have to be a valid date
		 */
		DateTimeFormatter eurDate1=DateTimeFormatter.
				ofPattern("EEEE dd MMMM yyyy");
		DateTimeFormatter eurDate2=DateTimeFormatter.ofPattern("dd MM yyyy");
		/*
		 * this only takes in a string and converts it to 
		 * be of type LocalDate
		 */
		LocalDate myDate=LocalDate.parse("Thursday 01 January 2015",eurDate1);
		LocalDate myDate2=LocalDate.parse("01 01 2017",eurDate2);
		/*
		 * so if we want to display it in our format
		 * we have to apply formatting to it
		 */
		System.out.println(myDate.format(eurDate1));
		System.out.println(myDate2);
		/*
		 * wrong sequence does not work
		 */
		//myDate=LocalDate.parse("02-15-2123");
	}
	
	static void ex9(){
		DateTimeFormatter eurDate2=DateTimeFormatter
				.ofPattern("dd MM yyyy");
		/*
		 * we can create a date, time or dateTime
		 * by passing in a string. we do this by
		 * using the parse method. The parse methods
		 * takes a string and a formatter
		 */
		LocalDate myDate2=LocalDate.parse
				("01 01 2017",eurDate2);
		System.out.println("Formatted "
				+myDate2.format(eurDate2));
		System.out.println("default "+myDate2);
		/*
		 * this does not work as the formatter
		 * does not match the string 
		 */
		/*LocalDate myDate3=LocalDate.parse
				("02 04 17",eurDate2);*/
		DateTimeFormatter eurDate1=DateTimeFormatter.
				ofPattern("EEEE dd MMMM yyyy");
		
		LocalDate myDate=LocalDate.parse
				("Thursday 01 January 2015",eurDate1);
		System.out.println("formatted "+myDate
				.format(eurDate1));
		/*
		 * it also has to be a valid date
		 * so this will not work, it will generate
		 * a DateTimeParserException
		 * because the 1st of January 2015 does not
		 * fall on a wednesday
		 */
		/*LocalDate wrong=LocalDate.parse
				("Wednesday 01 January 2015",eurDate1);*/
		
	}
	
/*	static void ex(){
		LocalDate date1=LocalDate.of(2017, 01, 01);
		LocalDate date2=LocalDate.of(2018, 01, 01);
		Period per1=Period.between(date1, date2);
		System.out.println(per1.getDays());
	}*/

}
