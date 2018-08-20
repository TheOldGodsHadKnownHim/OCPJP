/**
 * 
 */
package ocpjp._5.string_processing_dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;


/**
 * @author keithclarges
 *
 */
public class Date_Example1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Date date = new Date(1_000_000_000_000L);//1 trillion milliseconds
		System.out.println("A trillion milliseconds since Jan 1, 1970: " + date.toString());
		
		//now lets add an hour to that date
		date.setTime(date.getTime() + 60*60*1000L);
		System.out.println("The new time should be one hour later: " + date.toString());
		
		//This is the only way to manipulate dates using the Date class
		
		System.out.println("Number of time zones available: " + ZoneId.getAvailableZoneIds().size());
		
		for (String zone : ZoneId.getAvailableZoneIds()){
			System.out.println(zone);
		}
		LocalDate date2 = LocalDate.of(2015, 1, 1);
		LocalTime time = LocalTime.of(23, 59, 12, 400000000);
		LocalDateTime localDateTime = LocalDateTime.of(date2, time).minusDays(1).minusHours(1).minusMinutes(3);



	}

}
