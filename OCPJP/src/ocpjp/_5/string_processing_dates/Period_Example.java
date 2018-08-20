package ocpjp._5.string_processing_dates;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Period_Example {

	public static void main(String[] args) {
		
		LocalDate start = LocalDate.of(2018, Month.JANUARY, 1);
		LocalDate end = LocalDate.of(2020, Month.MARCH, 31);
		Period period = Period.of(1, 1, 20);
		
		Duration duration = Duration.of(1, ChronoUnit.HALF_DAYS);
		
		/*
		 * Won't fail compilation, but warning will be displayed. Only the final method in the chain
		 * will be invoked. 
		 */
		Period wrong = Period.ofMonths(1).ofWeeks(2).ofDays(20);
		
		performAnimalEnrichment(start, end, period);
		//performAnimalEnrichment(start, end, wrong);
		

		
	}
	
	private static void performAnimalEnrichment (LocalDate start, LocalDate end, Period period){
		
		while (start.isBefore(end)){
			System.out.println("Give new toy to: " + start);
			System.out.println("Increasing the date by: " + period);
			start = start.plus(period);
		}
		System.out.println("Allocated time is up. No more toys can be given");
		
	}

}
