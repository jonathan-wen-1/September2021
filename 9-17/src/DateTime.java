package com.ss.java.sept17;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAdjusters;

public class DateTime {
	public static void main(String [] args) {
		//Answer 1: Using LocalDatetime class 
		LocalDateTime date = LocalDateTime.now();
		System.out.println(date);
		
		//Answer 2: Using TemporalAdjustor.previous
		System.out.println("Last Thursday: " + date.with(TemporalAdjusters.previous(DayOfWeek.THURSDAY)));
		
		//Answer 3: ZoneID is a time zone identifier, specifying rules for changing between Instant/ LocalDateTime
		//ZoneOffset refers to the amount of time a time zone is off from UTC/Greenwich
		ZoneId z1 = ZoneId.of("Asia/Tokyo");
		ZoneOffset z2 = ZoneOffset.of("+09:00");
		System.out.println(z1.getRules());
		System.out.println(z2.getTotalSeconds());
		
		//Answer 4: Using toInstant() on ZonedDateTime variables
		Instant timer = ZonedDateTime.now().toInstant();
		System.out.println(timer);
		DateTime dt = new DateTime();
		
		dt.daysInMonth(2019);
		Month m = Month.valueOf("SEPTEMBER");
		dt.mondaysinMonth(m);
		LocalDate date2 = LocalDate.now();
		LocalDate fri13 = LocalDate.of(2021, Month.AUGUST, 13);
		System.out.println(dt.friday13(fri13));
	}
	
	public void daysInMonth(Integer year) {
		try {
			Year yearVal = Year.of(year); //check used in JUnit to make sure the year is a valid year
		}catch(DateTimeException e) {
			System.out.println("This year is not valid");
			throw e; //will check this in jUnit
		}
		System.out.println("Year: " + year);
		for(Month m : Month.values()) { //for each month in the array Month.values()
			YearMonth yeMo = YearMonth.of(year, m); //object that represents combination of year and month, correlates both
			System.out.println(m + ": " + yeMo.lengthOfMonth() + " days"); //checks the length of the month in respect to the input year
		}
	}
	
	public void mondaysinMonth(Month m) {
		try {
			System.out.println("For the month: " + m);
		} catch(Exception e) {
			throw e;
		}
		
		LocalDate mondayDate = Year.now().atMonth(m).atDay(1).with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		//sets a localdate to the first monday using this year, current month, on the first day, using an adjuster to make it the first monday
		//.with returns the adjusted copy of the date which makes this start on the first monday (so for sept, this localdate is 9-06-2021
		Month mChecker = m; //only for this case its ok, rest of them will change according to localdate
		while(mChecker==m) {
			System.out.println(mondayDate);
			mondayDate = mondayDate.with(TemporalAdjusters.next(DayOfWeek.MONDAY));//adjust the date using .with, using adjustor for the next Monday
			mChecker = mondayDate.getMonth(); //need to update this so that if the monday is no longer within the month we exit/ stop printing
		}
	}
	
	public Boolean friday13(LocalDate d) {
		int day = d.getDayOfMonth();
		int checkFriday = d.getDayOfWeek().getValue();
		if(day==13 && checkFriday==5) {
			return true;
		}
		return false;
	}
}
