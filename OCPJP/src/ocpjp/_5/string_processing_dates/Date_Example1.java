/**
 * 
 */
package ocpjp._5.string_processing_dates;

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


	}

}
