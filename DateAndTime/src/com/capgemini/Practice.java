package com.capgemini;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;

public class Practice {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println("Date is : "+date);
		System.out.println("Day is : "+date.getDayOfMonth());
		System.out.println("Month is : "+date.getMonthValue());
		System.out.println("Year is : "+date.getYear());


		LocalTime time = LocalTime.now();
		System.out.println("Time is : "+time);
		System.out.println( "Hr  : "+time.getHour());
		System.out.println( "Minutes : "+time.getMinute());
		System.out.println( "Seconds : "+time.getSecond());
		System.out.println( "Nanoseconds : "+time.getNano());
		
		int dd=date.getDayOfMonth();
		int mm=date.getMonthValue();
		int yy=date.getYear();

		
		LocalDate birthday = LocalDate.of(1999,10,11);
		LocalDate today=LocalDate.now();
		Period p =Period.between(birthday,today);
		System.out.printf("Your age is %d years %d months %d days",p.getYears(),p.getMonths(),p.getDays());
		
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);



	}

}
