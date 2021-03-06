package com.scooby24.main;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.time.DayOfWeek;
import java.time.LocalDate;

/*
 * The following class invokes most of the calender related fields and prints them to the console
 */
public class MyMain {

	public static void main(String[] args) {
		
		Calendar calendar = new GregorianCalendar();
	    calendar.setTime(new Date());

        LocalDate localDate = LocalDate.now();
	    DayOfWeek dayOfWeek = DayOfWeek.from(localDate);
	   
	    // Field number for get and set indicating the era, e.g., AD or BC in the Julian calendar.
	    System.out.println("ERA: " + calendar.get(Calendar.ERA));
	    
	    // Field number for get and set indicating the year.
	    System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
	    
	    // Field number for get and set indicating the month.
	    System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
	    
	    // Field number for get and set indicating the week number within the current year.
	    System.out.println("WEEK_OF_YEAR: " + calendar.get(Calendar.WEEK_OF_YEAR));
	    
	    // Field number for get and set indicating the week number within the current month.
	    System.out.println("WEEK_OF_MONTH: " + calendar.get(Calendar.WEEK_OF_MONTH));
	    
	    // Field number for get and set indicating the day of the month.
	    System.out.println("DATE: " + calendar.get(Calendar.DATE));
	    
	    // Field number for get and set indicating the day of the month.
	    System.out.println("DAY_OF_MONTH: " + calendar.get(Calendar.DAY_OF_MONTH));
	    
	    // Field number for get and set indicating the day of the week.
	    System.out.println("DAY_OF_WEEK: " + calendar.get(Calendar.DAY_OF_WEEK));
	    
	    // Field number for get and set indicating the ordinal number of the day of the week within the current month.
	    System.out.println("DAY_OF_WEEK_IN_MONTH: " + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
	    
	    // Value of the AM_PM field indicating the period of the day from midnight to just before noon.
	    System.out.println("AM_PM: " + calendar.get(Calendar.AM_PM));
	    
	    // Field number for get and set indicating the millisecond within the second.
	    System.out.println("MILLISECOND: " + calendar.get(Calendar.MILLISECOND));
	    
	    // Field number for get and set indicating the raw offset from GMT in milliseconds.
	    System.out.println("ZONE_OFFSET: "+ (calendar.get(Calendar.ZONE_OFFSET)/(60*60*1000)));
	    
	    // Field number for get and set indicating the daylight saving offset in milliseconds.
	    System.out.println("DST_OFFSET: "+ (calendar.get(Calendar.DST_OFFSET)/(60*60*1000)));
	    
	    System.out.println("DAY_OF_THE_WEEK_NAME: "+ (dayOfWeek.name()));
	}

}
