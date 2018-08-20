package ocpjp._5.string_processing_dates;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class InstantExample {

	public static void main(String[] args) {
		
		doSimpleCalcualtion(800000, 25);
		getMomentInTimeUsingZonedDateTime();
		getMomentInTimeUsingSeconds();

	}

	static void doSimpleCalcualtion(long i, long j){
		
		Instant start = Instant.now();
		long k = 0L;
		while (i > j){
			k = k + i*j;
			i--;
		}
		
		Instant finish = Instant.now();
		
		Duration duration = Duration.between(start, finish);
		
		System.out.println("It took " + duration.toMillis() + " milliseconds to complete the calculation. Result of multiplication: " + k);
		
	}
	
	static void getMomentInTimeUsingZonedDateTime() {
		
		LocalDate date = LocalDate.of(2015, 1, 1);
		LocalTime time = LocalTime.of(17, 59, 12, 400000000);
		LocalDateTime ldt = LocalDateTime.of(date, time);
		ZoneId zone = ZoneId.of("US/Eastern");
		ZonedDateTime  zdt = ZonedDateTime.of(ldt, zone);
		Instant instant = zdt.toInstant();
				
		System.out.println("Time in US Eastern: " + zdt);
		System.out.println("Equivalent of above time in GMT: " + instant);
	}
	
	static void getMomentInTimeUsingSeconds(){
		
		long epochSecond = 432415226;
		Instant instant = Instant.ofEpochSecond(epochSecond);
		
		System.out.println("Value of 432415226: " + instant);
		
		Instant nextDay = instant.plus(1, ChronoUnit.DAYS);
		System.out.println("Value of 432415226 plus one day: " + nextDay);
		
		Instant nextHour = instant.plus(1, ChronoUnit.HOURS);
		System.out.println("Value of 432415226 plus one day and one hour: " + nextHour);
		
		Instant nextWeeks = instant.plus(3, ChronoUnit.WEEKS);
		System.out.println("Value of 432415226 plus three weeks, one day and one hour: " + nextWeeks);


	}
}
