package org.example.java8.DatesAndTimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {

	public static void main(String[] args) {
		// Indsæt kode currentTime
		LocalTime currentTime = LocalTime.now();
		System.out.println("the current time: "+currentTime);
		
		// Indsæt kode specificTime;
		LocalDate specificTime = LocalDate.ofYearDay(2018,22);
		System.out.println("the specific date: "+specificTime);
		
		// Indsæt kode  currentDateTime
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("the current date and time: "+currentDateTime);
		
	}

}
